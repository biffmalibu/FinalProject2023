/////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                                             //
//  Author: Bradford Torpey                                                                    //
//  Purpose: To collect and store live currency information utilizing the Currencybeacon API   //
//                                                                                             //
/////////////////////////////////////////////////////////////////////////////////////////////////
package CryptoProject;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author bradf
 */
public class CurrencyData {
    
    private static Map<String, Map<String, Double>>  currencyPrices;   // Static map to store the currency prices   
    private static Map<String, Map<String, Double>> historicPrices;
    private static Date dataDate;
    
    private final String[] currencies = { // Array of strings for the currency names
        "USD", "EUR", "JPY", "GBP", "AUD",
        "CAD", "CHF", "CNY", "NOK", "MXN",
    };
    
    public CurrencyData() { // Initialize map to store currency data
        this.currencyPrices = new HashMap<>();
        this.historicPrices = new HashMap<>();
        updateCurrencyData("latest"); // Populate map with values
        updateCurrencyData("historical");
    }
    
    /**
     * Updates the map with currency conversions
     */
    public void updateCurrencyData(String endpoint) {
        try {
            String apiKey = "fVYGGBrh0nIwXt5UvnPMEqNDQPGkBrHn";
            String base = "USD";
            String date = "";
            if(endpoint.equals("historical"))                                                                                        // CODE FROM: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
                date = "&date=" + LocalDate.now().minusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")); // CODE FROM: https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
            String apiUrl = "https://api.currencybeacon.com/v1/"+ endpoint + "?api_key=" + apiKey + "&base=" + base + date + "&symbols=" + String.join(",", currencies);
            //System.out.println(apiUrl);
            System.out.println("Currency API called");
            URL url = new URL(apiUrl);      // Create a URL object to store the API link

            InputStreamReader read = new InputStreamReader(url.openStream()); // Open an input stream to collect data from the API
            JsonElement element = JsonParser.parseReader(read);            // Parse the data from the API into a JsonObject
            JsonObject jsonObject = element.getAsJsonObject();

            if (jsonObject.has("response") && jsonObject.getAsJsonObject("response").has("rates")) {
                JsonObject rates = jsonObject.getAsJsonObject("response").getAsJsonObject("rates");
                if (endpoint.equals("latest")) { // Convert the zulu time from the API to a date object for consistency
                    String dateFromJSON = jsonObject.getAsJsonObject("response").get("date").getAsString(); // Store the date of the data
                    long epoch = Instant.parse(dateFromJSON).toEpochMilli(); // CODE FROM: https://www.geeksforgeeks.org/instant-toepochmilli-method-in-java-with-examples/
                    dataDate = new Date(epoch);
                }
                
                for (String fromCurrency : currencies) { // Iterate over the 10 currencies in the currencies array
                    Map<String, Double> exchangeRates = new HashMap<>(); // Initialize a map to store each conversion
                    for (String toCurrency : currencies) {
                        if (rates.has(fromCurrency) && rates.has(toCurrency)) { // Calculate the correct exchange rate
                            double fromRate = rates.get(fromCurrency).getAsDouble();    // Convert the values from usd to avoid 10 api calls
                            double toRate = rates.get(toCurrency).getAsDouble();
                            double exchangeRate = 1 / (fromRate / toRate);
                            exchangeRates.put(toCurrency, exchangeRate); // Store the converted exchange rate
                        }
                    }
                    if (endpoint.equals("latest")) {
                        currencyPrices.put(fromCurrency, exchangeRates); // Add the map of exchange rates to currencyPrices
                    }
                    else if (endpoint.equals("historical")) {
                        historicPrices.put(fromCurrency, exchangeRates);
                    }
                }
            }
        } catch (IOException e) { // Catch an IOException in the event of a problem with the API
            JOptionPane.showMessageDialog(null, "Crypto prices are currently unavailable. The API has been rate limited.\nPlease try again later.", "API ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    /** 
     * Gets the current exchange rate between two currencies
     * 
     * @param fromCurrency The current to convert from
     * @param toCurrency The current to convert to
     * @return The conversion rate as a double
     */
    public double getConversionRate(String fromCurrency, String toCurrency) {
        if (currencyPrices.containsKey(fromCurrency) && currencyPrices.get(fromCurrency).containsKey(toCurrency)) // Check if the fromCurrency and toCurrency exist in the currencyPrices map.
            return currencyPrices.get(fromCurrency).get(toCurrency);
        else { // If the conversion rate is not available.
            System.out.println("Conversion rate from " + fromCurrency + " to " + toCurrency + " is not available.");
            return 0.0; // You can return a default value or handle the error as needed.
        }
    }
    /** 
     * Gets the historic exchange rate between two currencies
     * 
     * @param fromCurrency The current to convert from
     * @param toCurrency The current to convert to
     * @return The conversion rate as a double
     */
    public double getHistoricRate(String fromCurrency, String toCurrency) {
        if (historicPrices.containsKey(fromCurrency) && historicPrices.get(fromCurrency).containsKey(toCurrency)) // Check if the fromCurrency and toCurrency exist in the historicPrices map.
            return historicPrices.get(fromCurrency).get(toCurrency);
        else { // If the conversion rate is not available.
            System.out.println("Conversion rate from " + fromCurrency + " to " + toCurrency + " is not available.");
            return 0.0; // You can return a default value or handle the error as needed.
        }
    }
    
    /**
     * Returns the date of the data.
     * 
     * @return The date of the currency data
     */
    public Date getDate() {
        return dataDate;
    }
}
