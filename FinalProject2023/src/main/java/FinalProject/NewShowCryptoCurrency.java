///////////////////////////////////////////////////////////////////////////////////////
//                                                                                   //
//  Author: Bradford Torpey                                                          //
//  Purpose: To display live cryptocurrency information utilizing the Coingecko API  //
//                                                                                   //
///////////////////////////////////////////////////////////////////////////////////////
package FinalProject;

import java.awt.Color;  // Neccessary Imports 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;                                           // CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
import javax.swing.JLabel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER; // CODE FROM: https://stackoverflow.com/questions/1727840/disable-horizontal-scroll-in-jscrollpane
import javax.swing.SwingWorker;                                           // CODE FROM: https://docs.oracle.com/javase/8/docs/api/javax/swing/SwingWorker.html
import javax.swing.Timer;                                                 // CODE FROM: https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/javax/swing/Timer.html

/**
 * @author bradf
 */
public class NewShowCryptoCurrency extends javax.swing.JFrame {
    private UpdatedPrices updatedPrices;
    private boolean isAutoUpdating = false;
    /**
     * Creates new form NewShowCryptoCurrency
     */
    public NewShowCryptoCurrency() {
        initComponents();
        ValuesScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER); // Removes the horizontal scrollbar - CODE FROM: https://stackoverflow.com/questions/1727840/disable-horizontal-scroll-in-jscrollpane
        updatedPrices = new UpdatedPrices();                                             // Create an instance of the class
        updateCoinData("usd");                                                    // Call the constructor to populate the values
    }
    
    /**
     * Updates the coin price, market cap, and 24h volume/change in relation to the selected currency.
     * 
     * @param currency Current selected fiat currency
     */
    public void updateCoinData(String currency) { 
        String[] coins = {                                                               // Array of strings to hold all of the coins
            "bitcoin", "ethereum", "litecoin", "dogecoin", "cardano",
            "solana", "monero", "polkadot", "ripple", "binancecoin"
        };
        JLabel[] priceLabels = {                                                         // Array of JLabels to hold price, volume, change, and market cap labels
            BitcoinPrice, EthereumPrice, LitecoinPrice, DogecoinPrice, CardanoPrice,
            SolanaPrice, MoneroPrice, PolkadotPrice, RipplePrice, BinancecoinPrice
        };
        JLabel[] changeLabels = {
            BitcoinChange, EthereumChange, LitecoinChange, DogecoinChange, CardanoChange,
            SolanaChange, MoneroChange, PolkadotChange, RippleChange, BinancecoinChange
        };
        JLabel[] mcLabels = {
            BitcoinMC, EthereumMC, LitecoinMC, DogecoinMC, CardanoMC,
            SolanaMC, MoneroMC, PolkadotMC, RippleMC, BinancecoinMC
        };
        JLabel[] volumeLabels = {
            BitcoinVolume, EthereumVolume, LitecoinVolume, DogecoinVolume, CardanoVolume,
            SolanaVolume, MoneroVolume, PolkadotVolume, RippleVolume, BinancecoinVolume
        };
        dateLabel.setText("Updated: " + updatedPrices.getDate().toString());             // Gets and prints the last updated date
        String currencySymbol = getCurrencySymbol(currency);                             // Gets the currency symbol to use to print the values
        for (int i = 0; i < coins.length; i++) {                                         // Loop through all 10 coins in the list to update the values
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");           // Format the decimal place and commas - CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
            decimalFormat.setMinimumFractionDigits(2);                            // Ensure two decimal places are shown - CODE FROM: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
            priceLabels[i].setText(currencySymbol + decimalFormat.format(updatedPrices.getPrice(coins[i], currency)));   // Update the current price label
            changeLabels[i].setText(updatedPrices.get24HourChange(coins[i], currency + "%"));                           // Update the current change label
            mcLabels[i].setText(currencySymbol + updatedPrices.getMarketCap(coins[i], currency));                           // Update the current market cap label
            volumeLabels[i].setText(currencySymbol + updatedPrices.getVolume(coins[i], currency));                          // Update the current volume label

            if (parsePercentageValue(changeLabels[i].getText()) >= 0)                                              // Set the color of the change percentage to red if negative, green if positive
                changeLabels[i].setForeground(Color.GREEN);
            else 
                changeLabels[i].setForeground(Color.RED);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        ValuesScrollPane = new javax.swing.JScrollPane();
        ValuesPanel = new javax.swing.JPanel();
        BitcoinPanel = new javax.swing.JPanel();
        BitcoinImage = new javax.swing.JLabel();
        BitcoinLabel = new javax.swing.JLabel();
        BitcoinPrice = new javax.swing.JLabel();
        BitcoinChange = new javax.swing.JLabel();
        BitcoinMC = new javax.swing.JLabel();
        BitcoinVolume = new javax.swing.JLabel();
        EthereumPanel = new javax.swing.JPanel();
        EthereumImage = new javax.swing.JLabel();
        EthereumLabel = new javax.swing.JLabel();
        EthereumPrice = new javax.swing.JLabel();
        EthereumChange = new javax.swing.JLabel();
        EthereumMC = new javax.swing.JLabel();
        EthereumVolume = new javax.swing.JLabel();
        LitecoinPanel = new javax.swing.JPanel();
        LitecoinImage = new javax.swing.JLabel();
        LitecoinLabel = new javax.swing.JLabel();
        LitecoinPrice = new javax.swing.JLabel();
        LitecoinChange = new javax.swing.JLabel();
        LitecoinMC = new javax.swing.JLabel();
        LitecoinVolume = new javax.swing.JLabel();
        DogecoinPanel = new javax.swing.JPanel();
        DogecoinImage = new javax.swing.JLabel();
        DogecoinLabel = new javax.swing.JLabel();
        DogecoinPrice = new javax.swing.JLabel();
        DogecoinChange = new javax.swing.JLabel();
        DogecoinMC = new javax.swing.JLabel();
        DogecoinVolume = new javax.swing.JLabel();
        CardanoPanel = new javax.swing.JPanel();
        CardanoImage = new javax.swing.JLabel();
        CardanoLabel = new javax.swing.JLabel();
        CardanoPrice = new javax.swing.JLabel();
        CardanoChange = new javax.swing.JLabel();
        CardanoMC = new javax.swing.JLabel();
        CardanoVolume = new javax.swing.JLabel();
        SolanaPanel = new javax.swing.JPanel();
        SolanaImage = new javax.swing.JLabel();
        SolanaLabel = new javax.swing.JLabel();
        SolanaPrice = new javax.swing.JLabel();
        SolanaChange = new javax.swing.JLabel();
        SolanaMC = new javax.swing.JLabel();
        SolanaVolume = new javax.swing.JLabel();
        MoneroPanel = new javax.swing.JPanel();
        MoneroImage = new javax.swing.JLabel();
        MoneroLabel = new javax.swing.JLabel();
        MoneroPrice = new javax.swing.JLabel();
        MoneroChange = new javax.swing.JLabel();
        MoneroMC = new javax.swing.JLabel();
        MoneroVolume = new javax.swing.JLabel();
        PolkadotPanel = new javax.swing.JPanel();
        PolkadotImage = new javax.swing.JLabel();
        PolkadotLabel = new javax.swing.JLabel();
        PolkadotPrice = new javax.swing.JLabel();
        PolkadotChange = new javax.swing.JLabel();
        PolkadotMC = new javax.swing.JLabel();
        PolkadotVolume = new javax.swing.JLabel();
        RipplePanel = new javax.swing.JPanel();
        RippleImage = new javax.swing.JLabel();
        RippleLabel = new javax.swing.JLabel();
        RipplePrice = new javax.swing.JLabel();
        RippleChange = new javax.swing.JLabel();
        RippleMC = new javax.swing.JLabel();
        RippleVolume = new javax.swing.JLabel();
        BinancecoinPanel = new javax.swing.JPanel();
        BinancecoinImage = new javax.swing.JLabel();
        BinancecoinLabel = new javax.swing.JLabel();
        BinancecoinPrice = new javax.swing.JLabel();
        BinancecoinChange = new javax.swing.JLabel();
        BinancecoinMC = new javax.swing.JLabel();
        BinancecoinVolume = new javax.swing.JLabel();
        selectedCurrency = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        labelsLabel = new javax.swing.JLabel();
        autoUpdateCB = new javax.swing.JCheckBox();
        dateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        Title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Live Crypto Prices");

        ValuesScrollPane.setBackground(new java.awt.Color(153, 153, 153));

        ValuesPanel.setBackground(new java.awt.Color(102, 102, 102));

        BitcoinPanel.setBackground(new java.awt.Color(153, 153, 153));

        BitcoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BitcoinLabel.setText("Bitcoin");

        BitcoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BitcoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BitcoinPrice.setText("Loading...");

        BitcoinChange.setText("%");

        BitcoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        BitcoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout BitcoinPanelLayout = new javax.swing.GroupLayout(BitcoinPanel);
        BitcoinPanel.setLayout(BitcoinPanelLayout);
        BitcoinPanelLayout.setHorizontalGroup(
            BitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BitcoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BitcoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BitcoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BitcoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BitcoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BitcoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BitcoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BitcoinPanelLayout.setVerticalGroup(
            BitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BitcoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BitcoinImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BitcoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BitcoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(BitcoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BitcoinMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BitcoinVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        EthereumPanel.setBackground(new java.awt.Color(153, 153, 153));

        EthereumLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EthereumLabel.setText("Ethereum");

        EthereumPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        EthereumPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EthereumPrice.setText("Loading...");

        EthereumChange.setText("%");

        EthereumMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        EthereumVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout EthereumPanelLayout = new javax.swing.GroupLayout(EthereumPanel);
        EthereumPanel.setLayout(EthereumPanelLayout);
        EthereumPanelLayout.setHorizontalGroup(
            EthereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EthereumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EthereumImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EthereumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EthereumMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EthereumVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EthereumChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EthereumPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EthereumPanelLayout.setVerticalGroup(
            EthereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EthereumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EthereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EthereumImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EthereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EthereumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EthereumPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(EthereumChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(EthereumMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EthereumVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LitecoinPanel.setBackground(new java.awt.Color(153, 153, 153));

        LitecoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LitecoinLabel.setText("Litecoin");

        LitecoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LitecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LitecoinPrice.setText("Loading...");

        LitecoinChange.setText("%");

        LitecoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        LitecoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout LitecoinPanelLayout = new javax.swing.GroupLayout(LitecoinPanel);
        LitecoinPanel.setLayout(LitecoinPanelLayout);
        LitecoinPanelLayout.setHorizontalGroup(
            LitecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LitecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LitecoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LitecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LitecoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LitecoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LitecoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LitecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LitecoinPanelLayout.setVerticalGroup(
            LitecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LitecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LitecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LitecoinImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LitecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LitecoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LitecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(LitecoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LitecoinMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LitecoinVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        DogecoinPanel.setBackground(new java.awt.Color(153, 153, 153));

        DogecoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DogecoinLabel.setText("Dogecoin");

        DogecoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DogecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DogecoinPrice.setText("Loading...");

        DogecoinChange.setText("%");

        DogecoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        DogecoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout DogecoinPanelLayout = new javax.swing.GroupLayout(DogecoinPanel);
        DogecoinPanel.setLayout(DogecoinPanelLayout);
        DogecoinPanelLayout.setHorizontalGroup(
            DogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DogecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DogecoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DogecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DogecoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DogecoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DogecoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DogecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DogecoinPanelLayout.setVerticalGroup(
            DogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DogecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DogecoinImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DogecoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DogecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(DogecoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DogecoinMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DogecoinVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        CardanoPanel.setBackground(new java.awt.Color(153, 153, 153));

        CardanoLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CardanoLabel.setText("Cardano");

        CardanoPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CardanoPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CardanoPrice.setText("Loading...");

        CardanoChange.setText("%");

        CardanoMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        CardanoVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout CardanoPanelLayout = new javax.swing.GroupLayout(CardanoPanel);
        CardanoPanel.setLayout(CardanoPanelLayout);
        CardanoPanelLayout.setHorizontalGroup(
            CardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardanoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CardanoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardanoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CardanoMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CardanoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CardanoChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CardanoPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CardanoPanelLayout.setVerticalGroup(
            CardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardanoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardanoImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CardanoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CardanoPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(CardanoChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CardanoMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CardanoVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        SolanaPanel.setBackground(new java.awt.Color(153, 153, 153));

        SolanaLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SolanaLabel.setText("Solana");

        SolanaPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SolanaPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SolanaPrice.setText("Loading...");

        SolanaChange.setText("%");

        SolanaMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        SolanaVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout SolanaPanelLayout = new javax.swing.GroupLayout(SolanaPanel);
        SolanaPanel.setLayout(SolanaPanelLayout);
        SolanaPanelLayout.setHorizontalGroup(
            SolanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolanaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SolanaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolanaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SolanaMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SolanaVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SolanaChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SolanaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SolanaPanelLayout.setVerticalGroup(
            SolanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SolanaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SolanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SolanaMC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolanaImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SolanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SolanaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SolanaPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(SolanaChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SolanaVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        MoneroPanel.setBackground(new java.awt.Color(153, 153, 153));

        MoneroLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MoneroLabel.setText("Monero");

        MoneroPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MoneroPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MoneroPrice.setText("Loading...");

        MoneroChange.setText("%");

        MoneroMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        MoneroVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout MoneroPanelLayout = new javax.swing.GroupLayout(MoneroPanel);
        MoneroPanel.setLayout(MoneroPanelLayout);
        MoneroPanelLayout.setHorizontalGroup(
            MoneroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoneroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MoneroImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoneroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoneroMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoneroVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MoneroChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MoneroPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MoneroPanelLayout.setVerticalGroup(
            MoneroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MoneroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoneroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MoneroImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MoneroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MoneroPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(MoneroChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(MoneroMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneroVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PolkadotPanel.setBackground(new java.awt.Color(153, 153, 153));

        PolkadotLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PolkadotLabel.setText("Polkadot");

        PolkadotPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PolkadotPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PolkadotPrice.setText("Loading...");

        PolkadotChange.setText("%");

        PolkadotMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        PolkadotVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout PolkadotPanelLayout = new javax.swing.GroupLayout(PolkadotPanel);
        PolkadotPanel.setLayout(PolkadotPanelLayout);
        PolkadotPanelLayout.setHorizontalGroup(
            PolkadotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PolkadotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PolkadotImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PolkadotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PolkadotMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PolkadotVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PolkadotChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PolkadotPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PolkadotPanelLayout.setVerticalGroup(
            PolkadotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PolkadotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PolkadotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PolkadotImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolkadotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PolkadotLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PolkadotPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(PolkadotChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PolkadotMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PolkadotVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        RipplePanel.setBackground(new java.awt.Color(153, 153, 153));

        RippleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RippleLabel.setText("Ripple");

        RipplePrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RipplePrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RipplePrice.setText("Loading...");

        RippleChange.setText("%");

        RippleMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        RippleVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout RipplePanelLayout = new javax.swing.GroupLayout(RipplePanel);
        RipplePanel.setLayout(RipplePanelLayout);
        RipplePanelLayout.setHorizontalGroup(
            RipplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RipplePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RippleImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RippleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RippleMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RippleVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RippleChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RipplePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RipplePanelLayout.setVerticalGroup(
            RipplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RipplePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RipplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RippleImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RipplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RippleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RipplePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(RippleChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(RippleMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RippleVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BinancecoinPanel.setBackground(new java.awt.Color(153, 153, 153));

        BinancecoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BinancecoinLabel.setText("Binancecoin");

        BinancecoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BinancecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BinancecoinPrice.setText("Loading...");

        BinancecoinChange.setText("%");

        BinancecoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        BinancecoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout BinancecoinPanelLayout = new javax.swing.GroupLayout(BinancecoinPanel);
        BinancecoinPanel.setLayout(BinancecoinPanelLayout);
        BinancecoinPanelLayout.setHorizontalGroup(
            BinancecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BinancecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BinancecoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BinancecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BinancecoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BinancecoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BinancecoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BinancecoinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BinancecoinPanelLayout.setVerticalGroup(
            BinancecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BinancecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BinancecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BinancecoinVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BinancecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BinancecoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BinancecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(BinancecoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout ValuesPanelLayout = new javax.swing.GroupLayout(ValuesPanel);
        ValuesPanel.setLayout(ValuesPanelLayout);
        ValuesPanelLayout.setHorizontalGroup(
            ValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BitcoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EthereumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LitecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DogecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CardanoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolanaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PolkadotPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RipplePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ValuesPanelLayout.setVerticalGroup(
            ValuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ValuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BitcoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EthereumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LitecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DogecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardanoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolanaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MoneroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PolkadotPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RipplePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BinancecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ValuesScrollPane.setViewportView(ValuesPanel);

        selectedCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "NOK", "MXN" }));
        selectedCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedCurrencyActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        labelsLabel.setText("Coin                                Market Cap                         24h Vol                         24h                  Price");

        autoUpdateCB.setText("AutoUpdate");
        autoUpdateCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoUpdateCBActionPerformed(evt);
            }
        });

        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText("Mon Jan 1st 12:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValuesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(autoUpdateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Title)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autoUpdateCB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton)
                    .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelsLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0)
                .addComponent(ValuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Updates the prices in the form when the base currency is changed.
     * 
     * @param evt Currency changed
     */
    private void selectedCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedCurrencyActionPerformed
        updateCoinData(selectedCurrency.getSelectedItem().toString().toLowerCase());  // Update the values
    }//GEN-LAST:event_selectedCurrencyActionPerformed
    
    /**
     * Updates the currencies in the form when the update button is pressed. Button is enabled again after 10 seconds.
     * 
     * @param evt Update button pressed
     */
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        updateButton.setEnabled(false);                                              // Disable the button 
        autoUpdateCB.setEnabled(false);                                              // Disable the check box
                                                                                       //CODE FROM: https://docs.oracle.com/javase/8/docs/api/javax/swing/SwingWorker.html
        SwingWorker<Void, Void> buttonPressed = new SwingWorker<Void, Void>() {        //           https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/javax/swing/Timer.html                                                                                      
            @Override                                                                  // Create a non blocking swingworker to run in the background
            protected Void doInBackground() throws Exception {                         
                updatedPrices.updatePrices();                                          // Update the prices in the data class when the button is clicked
                updateCoinData(selectedCurrency.getSelectedItem().toString().toLowerCase()); // // Update the prices in the form when the button is clicked
                return null;
            }
            @Override
            protected void done() {
                Timer timer = new Timer(10000, e -> {
                    updateButton.setEnabled(true); // Enable the button after 10 seconds of being pressed
                    autoUpdateCB.setEnabled(true); // Enable the check box
                });
                timer.setRepeats(false);                                               // Stop the timer from repeating
                timer.start();
            }
        };
        buttonPressed.execute();                                                        // END
    }//GEN-LAST:event_updateButtonActionPerformed

    private void autoUpdateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoUpdateCBActionPerformed
        Timer autoUpdateTimer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (autoUpdateCB.isSelected()) {
                    updatedPrices.updatePrices();
                    updateCoinData(selectedCurrency.getSelectedItem().toString().toLowerCase());
                }
            }
        });

        if (autoUpdateCB.isSelected()) {
            //updatedPrices.updatePrices(); // Update the values initially
            //updateCoinData(selectedCurrency.getSelectedItem().toString().toLowerCase());
            // Disable the updateButton
            updateButton.setEnabled(false);

            autoUpdateTimer.setRepeats(true);
            autoUpdateTimer.start();
        } else {
            // Enable the updateButton
            updateButton.setEnabled(true);

            // If the timer exists, stop it
            autoUpdateTimer.stop();

            // Disable the checkbox for 5 seconds
            autoUpdateCB.setEnabled(false);
            updateButton.setEnabled(false);

            // After 5 seconds, re-enable the checkbox
            Timer cooldownTimer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    autoUpdateCB.setEnabled(true);
                    updateButton.setEnabled(true);
                }
            });
            cooldownTimer.setRepeats(false);
            cooldownTimer.start();
        }
        
    }//GEN-LAST:event_autoUpdateCBActionPerformed
    
    /**
     * Helper method to remove the percent symbol and convert to a double.
     * 
     * @param percentage The 24h volume as a string
     * @return The 24h volume as a double
     */
    private double parsePercentageValue(String percentage) {
        percentage = percentage.replace("%", ""); // Remove the % symbol
        return Double.parseDouble(percentage);                 // Parse as a double
    }
    
    /**
     * Helper method to find the correct currency symbol to print.
     * 
     * @param currency The current selected currency
     * @return The corresponding currency symbol
     */
    private String getCurrencySymbol(String currency) {
        String symbol;
        currency = currency.toLowerCase();  // Set the currency to lowercase
        if (null == currency) {
            symbol = "";                    // Default to empty string for unknown currencies
        } else symbol = switch (currency) { // Look for the correct symbol
            case "usd" -> "$";
            case "eur" -> "€";
            case "jpy" -> "¥";
            case "gbp" -> "£";
            case "aud" -> "A$";
            case "cad" -> "C$";
            case "chf" -> "Fr";
            case "cny" -> "¥";
            case "mxn" -> "$";
            case "nok" -> "kr";
            default -> "";
        }; 
        return symbol;                      // Return the symbol
    }

  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new NewShowCryptoCurrency().setVisible(true); // Start the window
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BinancecoinChange;
    private javax.swing.JLabel BinancecoinImage;
    private javax.swing.JLabel BinancecoinLabel;
    private javax.swing.JLabel BinancecoinMC;
    private javax.swing.JPanel BinancecoinPanel;
    private javax.swing.JLabel BinancecoinPrice;
    private javax.swing.JLabel BinancecoinVolume;
    private javax.swing.JLabel BitcoinChange;
    private javax.swing.JLabel BitcoinImage;
    private javax.swing.JLabel BitcoinLabel;
    private javax.swing.JLabel BitcoinMC;
    private javax.swing.JPanel BitcoinPanel;
    private javax.swing.JLabel BitcoinPrice;
    private javax.swing.JLabel BitcoinVolume;
    private javax.swing.JLabel CardanoChange;
    private javax.swing.JLabel CardanoImage;
    private javax.swing.JLabel CardanoLabel;
    private javax.swing.JLabel CardanoMC;
    private javax.swing.JPanel CardanoPanel;
    private javax.swing.JLabel CardanoPrice;
    private javax.swing.JLabel CardanoVolume;
    private javax.swing.JLabel DogecoinChange;
    private javax.swing.JLabel DogecoinImage;
    private javax.swing.JLabel DogecoinLabel;
    private javax.swing.JLabel DogecoinMC;
    private javax.swing.JPanel DogecoinPanel;
    private javax.swing.JLabel DogecoinPrice;
    private javax.swing.JLabel DogecoinVolume;
    private javax.swing.JLabel EthereumChange;
    private javax.swing.JLabel EthereumImage;
    private javax.swing.JLabel EthereumLabel;
    private javax.swing.JLabel EthereumMC;
    private javax.swing.JPanel EthereumPanel;
    private javax.swing.JLabel EthereumPrice;
    private javax.swing.JLabel EthereumVolume;
    private javax.swing.JLabel LitecoinChange;
    private javax.swing.JLabel LitecoinImage;
    private javax.swing.JLabel LitecoinLabel;
    private javax.swing.JLabel LitecoinMC;
    private javax.swing.JPanel LitecoinPanel;
    private javax.swing.JLabel LitecoinPrice;
    private javax.swing.JLabel LitecoinVolume;
    private javax.swing.JLabel MoneroChange;
    private javax.swing.JLabel MoneroImage;
    private javax.swing.JLabel MoneroLabel;
    private javax.swing.JLabel MoneroMC;
    private javax.swing.JPanel MoneroPanel;
    private javax.swing.JLabel MoneroPrice;
    private javax.swing.JLabel MoneroVolume;
    private javax.swing.JLabel PolkadotChange;
    private javax.swing.JLabel PolkadotImage;
    private javax.swing.JLabel PolkadotLabel;
    private javax.swing.JLabel PolkadotMC;
    private javax.swing.JPanel PolkadotPanel;
    private javax.swing.JLabel PolkadotPrice;
    private javax.swing.JLabel PolkadotVolume;
    private javax.swing.JLabel RippleChange;
    private javax.swing.JLabel RippleImage;
    private javax.swing.JLabel RippleLabel;
    private javax.swing.JLabel RippleMC;
    private javax.swing.JPanel RipplePanel;
    private javax.swing.JLabel RipplePrice;
    private javax.swing.JLabel RippleVolume;
    private javax.swing.JLabel SolanaChange;
    private javax.swing.JLabel SolanaImage;
    private javax.swing.JLabel SolanaLabel;
    private javax.swing.JLabel SolanaMC;
    private javax.swing.JPanel SolanaPanel;
    private javax.swing.JLabel SolanaPrice;
    private javax.swing.JLabel SolanaVolume;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel ValuesPanel;
    private javax.swing.JScrollPane ValuesScrollPane;
    private javax.swing.JCheckBox autoUpdateCB;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel labelsLabel;
    private javax.swing.JComboBox<String> selectedCurrency;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
