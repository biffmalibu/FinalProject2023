/////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                             //
//  Author: Bradford Torpey                                                                    //
//  Purpose: To collect and store live cryptocurrency information utilizing the Coingecko API  //
//                                                                                             //
/////////////////////////////////////////////////////////////////////////////////////////////////
package CryptoProject;
                                       // Neccessary imports
import com.google.gson.JsonObject;     // GSON/JSON imports
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat; 
import java.util.Date;       // Date format
import java.util.HashMap;   // Imports for data storage
import java.util.Map;
import javax.swing.JOptionPane;

public class CryptoData {
    private final String[] coins = {                                        // Array of strings for the coin names
        "bitcoin", "ethereum", "litecoin", "dogecoin", "cardano",
        "solana", "monero", "polkadot", "ripple", "binancecoin"
    };
    
    private final String[] currencies = {                                   // Array of strings for the currency names
        "usd", "eur", "jpy", "gbp", "aud",
        "cad", "chf", "cny", "nok", "mxn", 
    };
    public static Date date;                                               // Store the date of the data
    private static Map<String, Map<String, Double>> coinPrices;             // These static maps store all of the cryptocurrency data
    private static Map<String, Double> coinValueChanges;                    //      coinPrices                         coinValueChanges
    private static Map<String, Map<String, Double>> coinVolume;             //          bitcoin:                            bitcoin: x.x%
    private static Map<String, Map<String, Double>> coinMarketCap;          //              usd: xx,xxx.xx                  ethereum: x.x%
    private static int lastUpdatedValue;
                                                                            //              eur: xx,xxx.xx                  litecoin: x.x%
    public CryptoData() {                                                //              (...)                           (...)
        this.coinPrices = new HashMap<>();   // Initialize maps to store cryptocurrency data
        this.coinValueChanges = new HashMap<>();
        this.coinVolume = new HashMap<>();
        this.coinMarketCap = new HashMap<>();
        updatePrices();                      // Update the maps with crypto data
    }
    /**
     *  Update the maps with cryptocurrency prices, volume, change, and market cap
     */
    public void updatePrices() {
        try {
            String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=" +  // Build the URL with the currencies and crypto coins
                    String.join(",", coins) + "&vs_currencies=" + String.join(",", currencies) + "&include_market_cap=true&include_24hr_vol=true&include_24hr_change=true&include_last_updated_at=true&precision=18";
            //System.out.println(apiUrl);
            System.out.println("Crypto Api called");
            URL url = new URL(apiUrl);      // Create a URL object to store the API link

            InputStreamReader read = new InputStreamReader(url.openStream()); // Open an input stream to collect data from the API
            JsonElement element = JsonParser.parseReader(read);            // Parse the data from the API into a JsonObject
            JsonObject jsonObject = element.getAsJsonObject();
            
            String lastUpdated = jsonObject.getAsJsonObject("bitcoin").get("last_updated_at").toString(); // Get the last updated value in epoch time
            int curLastUpdated = Integer.parseInt(lastUpdated);
            if (lastUpdatedValue != 0 && lastUpdatedValue > curLastUpdated) {
                //System.out.println("Incorrect API values were retrieved... Last: " + lastUpdatedValue + " " + new Date(Long.parseLong(String.valueOf(lastUpdatedValue)) * 1000) + " Received: " + curLastUpdated + " " + new Date(Long.parseLong(String.valueOf(curLastUpdated)) * 1000));
                return;
            } 
            lastUpdatedValue = curLastUpdated; // Check if the new data is old -- Some strange quirk with the API
            //System.out.println("Current Time: " + lastUpdated + " " + new Date(Long.parseLong(String.valueOf(lastUpdated)) * 1000));
            long epoch = Long.parseLong(lastUpdated);
            date = new Date(epoch * 1000); // Convert the epoch time to a date object
            
            for (String coin : coins) {                                          // Iterate over the 10 cryptocurrencies in the coins array
                Map<String, Double> marketCaps = new HashMap<>();                // Initialize maps to store market caps, prices, and volumes for the coins
                Map<String, Double> prices = new HashMap<>();
                Map<String, Double> volumes = new HashMap<>();
                double valueChange = jsonObject.getAsJsonObject(coin).get("usd_24h_change").getAsDouble(); // Get the 24h change as a percentage from the JsonObject
                
                coinValueChanges.put(coin, valueChange);
                
                for (String currency : currencies) {                             // Iterate over each currency to collect data from the JsonObject for each one
                    if (jsonObject.has(coin) && jsonObject.getAsJsonObject(coin).has(currency)) {
                        double marketCap = jsonObject.getAsJsonObject(coin).get(currency + "_market_cap").getAsDouble(); // Get market cap, price, and volume data for the cryptocurrency in the current currency
                        double price = jsonObject.getAsJsonObject(coin).get(currency).getAsDouble();
                        double volume = jsonObject.getAsJsonObject(coin).get(currency + "_24h_vol").getAsDouble();
                        marketCaps.put(currency, marketCap); // Store the values in the respective maps
                        prices.put(currency, price);
                        volumes.put(currency, volume);
                    }
                }
                coinMarketCap.put(coin, marketCaps); // Update the global maps with the current crypto data
                coinPrices.put(coin, prices);
                coinVolume.put(coin, volumes);
            }
        } catch (IOException e) { // Catch an IOException in the event of a problem with the API
            JOptionPane.showMessageDialog(null, "Crypto prices are currently unavailable. The API has been rate limited.\nPlease try again later.", "API ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Gets the current price for a cryptocurrency based off the provided currency
     * 
     * @param coin The provided cryptocurrency
     * @param currency The provided currency
     * @return The cryptocurrency's price as a double
     */
    public Double getPrice(String coin, String currency) {
        Map<String, Double> prices = coinPrices.get(coin); // Get the map of prices for the selected coin
        if (prices != null && prices.containsKey(currency)) {
            return prices.get(currency);    // Return the price
        }
        return null; // Return null if no data is found
    }
    
    /**
     * Gets the current 24h change for a cryptocurrency based off the provided currency
     * 
     * @param coin The provided cryptocurrency
     * @param currency The provided currency
     * @return The cryptocurrency's 24h change as a string
     */
    public String get24HourChange(String coin, String currency) {
        if (coinValueChanges.containsKey(coin)) {
            Double change = coinValueChanges.get(coin);
            return String.format("%.2f%%", change); // Format the value with two decimal places and a percentage symbol
        }
        return "N/A"; // Return "N/A" if no data is found
    }
    
    /**
     * Gets the current market cap for a cryptocurrency based off the provided currency
     * 
     * @param coin The provided cryptocurrency
     * @param currency The provided currency
     * @return The cryptocurrency's market cap as a string
     */
    public String getMarketCap(String coin, String currency) {
        Map<String, Double> marketCaps = coinMarketCap.get(coin); // Get the map of market caps for the selected coin
        if (marketCaps != null && marketCaps.containsKey(currency)) {
            Double marketCap = marketCaps.get(currency);
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00"); // Format the value with two decimal places and commas
            return decimalFormat.format(marketCap); // Return the market cap
        }
        return "N/A";
    }
    
    public Date getDate() {
        return date;
    }
    
    /**
     * Gets the current volume for a cryptocurrency based off the provided currency
     * 
     * @param coin The provided cryptocurrency
     * @param currency The provided currency
     * @return The cryptocurrency's volume as a string
     */
    public String getVolume(String coin, String currency) {
        Map<String, Double> volumes = coinVolume.get(coin);  // Get the map of volumes for the selected coin
        if (volumes != null && volumes.containsKey(currency)) {
            Double volume = volumes.get(currency);
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00"); // Format the value with two decimal places and commas
            return decimalFormat.format(volume); // Return the volume
        }
        return "N/A";
    }
}
