///////////////////////////////////////////////////////////////////////////////////////
//                                                                                   //
//  Author: Bradford Torpey                                                          //
//  Purpose: To display live cryptocurrency information utilizing the Coingecko API  //
//                                                                                   //
///////////////////////////////////////////////////////////////////////////////////////
package CryptoProject;

import java.awt.Color;  // Neccessary Imports 
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;                                           // CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER; // CODE FROM: https://stackoverflow.com/questions/1727840/disable-horizontal-scroll-in-jscrollpane
import javax.swing.SwingWorker;                                           // CODE FROM: https://docs.oracle.com/javase/8/docs/api/javax/swing/SwingWorker.html
import javax.swing.Timer;                                                 // CODE FROM: https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/javax/swing/Timer.html

/**
 * @author bradf
 */
public class ShowCryptoCurrency extends javax.swing.JFrame {
    private CryptoData data;
    /**
     * Creates new form NewShowCryptoCurrency
     */
    public ShowCryptoCurrency() {
        data = new CryptoData();                                                         // Create an instance of the class
        initComponents();
        valuesScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER); // Removes the horizontal scrollbar - CODE FROM: https://stackoverflow.com/questions/1727840/disable-horizontal-scroll-in-jscrollpane
        updateCoinData("usd");                                                    // Call the constructor to populate the values
        
        for (Component component : valuesPanel.getComponents()) { // Creates a mouselistener for each JPanel in valuesPanel - used for creating individual windows
            JPanel currencyPanel = (JPanel) component;        // CODE FROM: https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html
            String cryptocurrency = currencyPanel.getName(); // Use the name of the JPanel as the "crypto"
            currencyPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    createIndividualWindow(cryptocurrency);
                }
            });
        }
    }
        
    
    /**
     * Updates the coin price, market cap, and 24h volume/change in relation to the selected currency.
     * 
     * @param currency Current selected fiat currency
     */
    private void updateCoinData(String currency) { 
        setTitle("Cryptocurrency prices in " + currency.toUpperCase());
        String[] coins = {                                                               // Array of strings to hold all of the coins
            "bitcoin", "ethereum", "litecoin", "dogecoin", "cardano",
            "solana", "monero", "polkadot", "ripple", "binancecoin"
        };
        JLabel[] priceLabels = {                                                         // Array of JLabels to hold price, volume, change, and market cap labels
            bitcoinPrice, ethereumPrice, litecoinPrice, dogecoinPrice, cardanoPrice,
            SolanaPrice, MoneroPrice, PolkadotPrice, RipplePrice, BinancecoinPrice
        };
        JLabel[] changeLabels = {
            bitcoinChange, ethereumChange, litecoinChange, dogecoinChange, cardanoChange,
            SolanaChange, MoneroChange, PolkadotChange, RippleChange, BinancecoinChange
        };
        JLabel[] mcLabels = {
            bitcoinMC, ethereumMC, litecoinMC, dogecoinMC, cardanoMC,
            SolanaMC, MoneroMC, PolkadotMC, RippleMC, BinancecoinMC
        };
        JLabel[] volumeLabels = {
            bitcoinVolume, ethereumVolume, litecoinVolume, dogecoinVolume, cardanoVolume,
            SolanaVolume, MoneroVolume, PolkadotVolume, RippleVolume, BinancecoinVolume
        };
        
        String currencySymbol = getCurrencySymbol(currency);                             // Gets the currency symbol to use to print the values
        try { 
            dateLabel.setText("Updated: " + data.date.toString());             // Gets and prints the last updated date
            for (int i = 0; i < coins.length; i++) {                                         // Loop through all 10 coins in the list to update the values
                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");           // Format the decimal place and commas - CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
                decimalFormat.setMinimumFractionDigits(2);                            // Ensure two decimal places are shown - CODE FROM: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
                priceLabels[i].setText(currencySymbol + decimalFormat.format(data.getPrice(coins[i], currency)));   // Update the current price label
                changeLabels[i].setText(data.get24HourChange(coins[i], currency + "%"));                           // Update the current change label
                mcLabels[i].setText(currencySymbol + data.getMarketCap(coins[i], currency));                           // Update the current market cap label
                volumeLabels[i].setText(currencySymbol + data.getVolume(coins[i], currency));                          // Update the current volume label

                if (parsePercentageValue(changeLabels[i].getText()) >= 0)                                              // Set the color of the change percentage to red if negative, green if positive
                    changeLabels[i].setForeground(Color.GREEN);
                else 
                    changeLabels[i].setForeground(Color.RED);
            }
        } catch (IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "An error occured while retrieving crypto prices. \nPlease try again later.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "An error occured while retrieving crypto prices. \nPlease try again later.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        valuesScrollPane = new javax.swing.JScrollPane();
        valuesPanel = new javax.swing.JPanel();
        bitcoinPanel = new javax.swing.JPanel();
        bitcoinImage = new javax.swing.JLabel();
        bitcoinLabel = new javax.swing.JLabel();
        bitcoinPrice = new javax.swing.JLabel();
        bitcoinChange = new javax.swing.JLabel();
        bitcoinMC = new javax.swing.JLabel();
        bitcoinVolume = new javax.swing.JLabel();
        ethereumPanel = new javax.swing.JPanel();
        ethereumImage = new javax.swing.JLabel();
        ethereumLabel = new javax.swing.JLabel();
        ethereumPrice = new javax.swing.JLabel();
        ethereumChange = new javax.swing.JLabel();
        ethereumMC = new javax.swing.JLabel();
        ethereumVolume = new javax.swing.JLabel();
        litecoinPanel = new javax.swing.JPanel();
        litecoinImage = new javax.swing.JLabel();
        litecoinLabel = new javax.swing.JLabel();
        litecoinPrice = new javax.swing.JLabel();
        litecoinChange = new javax.swing.JLabel();
        litecoinMC = new javax.swing.JLabel();
        litecoinVolume = new javax.swing.JLabel();
        dogecoinPanel = new javax.swing.JPanel();
        dogecoinImage = new javax.swing.JLabel();
        dogecoinLabel = new javax.swing.JLabel();
        dogecoinPrice = new javax.swing.JLabel();
        dogecoinChange = new javax.swing.JLabel();
        dogecoinMC = new javax.swing.JLabel();
        dogecoinVolume = new javax.swing.JLabel();
        cardanoPanel = new javax.swing.JPanel();
        cardanoImage = new javax.swing.JLabel();
        cardanoLabel = new javax.swing.JLabel();
        cardanoPrice = new javax.swing.JLabel();
        cardanoChange = new javax.swing.JLabel();
        cardanoMC = new javax.swing.JLabel();
        cardanoVolume = new javax.swing.JLabel();
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
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        Title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Live Crypto Prices");

        valuesScrollPane.setBackground(new java.awt.Color(153, 153, 153));

        valuesPanel.setBackground(new java.awt.Color(102, 102, 102));

        bitcoinPanel.setBackground(new java.awt.Color(153, 153, 153));
        bitcoinPanel.setName("bitcoin"); // NOI18N

        bitcoinImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bitcoinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bitcoin.png"))); // NOI18N

        bitcoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bitcoinLabel.setText("Bitcoin");

        bitcoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bitcoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bitcoinPrice.setText("Loading...");

        bitcoinChange.setText("%");

        bitcoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        bitcoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout bitcoinPanelLayout = new javax.swing.GroupLayout(bitcoinPanel);
        bitcoinPanel.setLayout(bitcoinPanelLayout);
        bitcoinPanelLayout.setHorizontalGroup(
            bitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bitcoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bitcoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bitcoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bitcoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(bitcoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bitcoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bitcoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bitcoinPanelLayout.setVerticalGroup(
            bitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bitcoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bitcoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bitcoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitcoinImage, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(bitcoinLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitcoinMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitcoinVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(bitcoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ethereumPanel.setBackground(new java.awt.Color(153, 153, 153));
        ethereumPanel.setName("ethereum"); // NOI18N

        ethereumImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ethereumImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ethereum.png"))); // NOI18N

        ethereumLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ethereumLabel.setText("Ethereum");

        ethereumPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ethereumPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ethereumPrice.setText("Loading...");

        ethereumChange.setText("%");

        ethereumMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        ethereumVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout ethereumPanelLayout = new javax.swing.GroupLayout(ethereumPanel);
        ethereumPanel.setLayout(ethereumPanelLayout);
        ethereumPanelLayout.setHorizontalGroup(
            ethereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ethereumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ethereumImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ethereumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ethereumMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ethereumVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ethereumChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ethereumPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ethereumPanelLayout.setVerticalGroup(
            ethereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ethereumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ethereumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ethereumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ethereumImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(ethereumMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ethereumVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ethereumChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(ethereumPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        litecoinPanel.setBackground(new java.awt.Color(153, 153, 153));
        litecoinPanel.setName("litecoin"); // NOI18N

        litecoinImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        litecoinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/litecoin.png"))); // NOI18N

        litecoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        litecoinLabel.setText("Litecoin");

        litecoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        litecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        litecoinPrice.setText("Loading...");

        litecoinChange.setText("%");

        litecoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        litecoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout litecoinPanelLayout = new javax.swing.GroupLayout(litecoinPanel);
        litecoinPanel.setLayout(litecoinPanelLayout);
        litecoinPanelLayout.setHorizontalGroup(
            litecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(litecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(litecoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(litecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(litecoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(litecoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(litecoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(litecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        litecoinPanelLayout.setVerticalGroup(
            litecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, litecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(litecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(litecoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(litecoinImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(litecoinMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(litecoinVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(litecoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(litecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dogecoinPanel.setBackground(new java.awt.Color(153, 153, 153));
        dogecoinPanel.setName("dogecoin"); // NOI18N

        dogecoinImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogecoinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dogecoin.png"))); // NOI18N

        dogecoinLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dogecoinLabel.setText("Dogecoin");

        dogecoinPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dogecoinPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dogecoinPrice.setText("Loading...");

        dogecoinChange.setText("%");

        dogecoinMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        dogecoinVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout dogecoinPanelLayout = new javax.swing.GroupLayout(dogecoinPanel);
        dogecoinPanel.setLayout(dogecoinPanelLayout);
        dogecoinPanelLayout.setHorizontalGroup(
            dogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dogecoinImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dogecoinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dogecoinMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dogecoinVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dogecoinChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dogecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dogecoinPanelLayout.setVerticalGroup(
            dogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dogecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dogecoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dogecoinImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(dogecoinMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dogecoinVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dogecoinChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(dogecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cardanoPanel.setBackground(new java.awt.Color(153, 153, 153));
        cardanoPanel.setName("cardano"); // NOI18N

        cardanoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardanoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cardano.png"))); // NOI18N

        cardanoLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cardanoLabel.setText("Cardano");

        cardanoPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cardanoPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardanoPrice.setText("Loading...");

        cardanoChange.setText("%");

        cardanoMC.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        cardanoVolume.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N

        javax.swing.GroupLayout cardanoPanelLayout = new javax.swing.GroupLayout(cardanoPanel);
        cardanoPanel.setLayout(cardanoPanelLayout);
        cardanoPanelLayout.setHorizontalGroup(
            cardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardanoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardanoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardanoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardanoMC, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardanoVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardanoChange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardanoPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardanoPanelLayout.setVerticalGroup(
            cardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardanoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardanoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cardanoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardanoImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(cardanoMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardanoVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardanoChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(cardanoPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SolanaPanel.setBackground(new java.awt.Color(153, 153, 153));
        SolanaPanel.setName("solana"); // NOI18N

        SolanaImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SolanaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/solana.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SolanaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SolanaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SolanaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolanaMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolanaImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(SolanaVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolanaChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(SolanaPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MoneroPanel.setBackground(new java.awt.Color(153, 153, 153));
        MoneroPanel.setName("monero"); // NOI18N

        MoneroImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MoneroImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/monero.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MoneroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MoneroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoneroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneroImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(MoneroMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneroVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneroChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(MoneroPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PolkadotPanel.setBackground(new java.awt.Color(153, 153, 153));
        PolkadotPanel.setName("polkadot"); // NOI18N

        PolkadotImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PolkadotImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/polkadot.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PolkadotPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PolkadotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PolkadotImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(PolkadotMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PolkadotVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PolkadotLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PolkadotChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(PolkadotPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        RipplePanel.setBackground(new java.awt.Color(153, 153, 153));
        RipplePanel.setName("ripple"); // NOI18N

        RippleImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RippleImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ripple.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RipplePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RipplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RippleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RippleImage, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(RippleMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RippleVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RippleChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(RipplePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BinancecoinPanel.setBackground(new java.awt.Color(153, 153, 153));
        BinancecoinPanel.setName("binancecoin"); // NOI18N

        BinancecoinImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BinancecoinImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/binancecoin.png"))); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BinancecoinPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BinancecoinPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BinancecoinChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(BinancecoinPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout valuesPanelLayout = new javax.swing.GroupLayout(valuesPanel);
        valuesPanel.setLayout(valuesPanelLayout);
        valuesPanelLayout.setHorizontalGroup(
            valuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(valuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bitcoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ethereumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(litecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dogecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardanoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SolanaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MoneroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PolkadotPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RipplePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BinancecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        valuesPanelLayout.setVerticalGroup(
            valuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bitcoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ethereumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(litecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dogecoinPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardanoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        valuesScrollPane.setViewportView(valuesPanel);

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

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(valuesScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(autoUpdateCB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
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
                .addComponent(valuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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
                data.updatePrices();                                          // Update the prices in the data class when the button is clicked
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
    /**
     * Automatically updates the crypto data every 10 seconds when selected. Disables the update button when selected
     * @param evt 
     */
    private void autoUpdateCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoUpdateCBActionPerformed
        Timer autoUpdateTimer = new Timer(10000, new ActionListener() { // Start a 10 second timer to update the values
            @Override
            public void actionPerformed(ActionEvent e) {
                if (autoUpdateCB.isSelected()) {
                    data.updatePrices();
                    updateCoinData(selectedCurrency.getSelectedItem().toString().toLowerCase());
                }
            }
        });

        if (autoUpdateCB.isSelected()) {          // When selected
            updateButton.setEnabled(false);     // Disable the updateButton
            autoUpdateTimer.setRepeats(true); // Repeat the timer every 10 seconds
            autoUpdateTimer.start();              // Start the timer
        } else { // When deselected
            updateButton.setEnabled(true); // Enable the updateButton
            autoUpdateTimer.stop(); // Disable the timer if running
            autoUpdateCB.setEnabled(false); // Disable the checkbox and update button for 5 seconds
            updateButton.setEnabled(false);

            // After 5 seconds, re-enable the checkbox
            Timer cooldownTimer = new Timer(5000, new ActionListener() { // After 5 seconds, enable them again
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
     * Return to main menu
     * @param evt Back button pressed
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed
    
    /**
     * Creates an individual cryptocurrency window
     * @param crypto The selected cryptocurrency
     */
    private void createIndividualWindow(String crypto) {
        String currency = selectedCurrency.getSelectedItem().toString().toLowerCase(); // Calculate info for the window
        double price = data.getPrice(crypto, currency);
        String marketCap = data.getMarketCap(crypto, currency);
        String dailyVolume = data.getVolume(crypto, currency);
        String percentChange = data.get24HourChange(crypto, currency);
        crypto = crypto.substring(0, 1).toUpperCase() + crypto.substring(1);
        new IndividualCryptoWindow(crypto, currency, price, marketCap, dailyVolume, percentChange).setVisible(true); // Create the window
    }
    
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
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowCryptoCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new ShowCryptoCurrency().setVisible(true); // Start the window
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BinancecoinChange;
    private javax.swing.JLabel BinancecoinImage;
    private javax.swing.JLabel BinancecoinLabel;
    private javax.swing.JLabel BinancecoinMC;
    private javax.swing.JPanel BinancecoinPanel;
    private javax.swing.JLabel BinancecoinPrice;
    private javax.swing.JLabel BinancecoinVolume;
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
    private javax.swing.JCheckBox autoUpdateCB;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bitcoinChange;
    private javax.swing.JLabel bitcoinImage;
    private javax.swing.JLabel bitcoinLabel;
    private javax.swing.JLabel bitcoinMC;
    private javax.swing.JPanel bitcoinPanel;
    private javax.swing.JLabel bitcoinPrice;
    private javax.swing.JLabel bitcoinVolume;
    private javax.swing.JLabel cardanoChange;
    private javax.swing.JLabel cardanoImage;
    private javax.swing.JLabel cardanoLabel;
    private javax.swing.JLabel cardanoMC;
    private javax.swing.JPanel cardanoPanel;
    private javax.swing.JLabel cardanoPrice;
    private javax.swing.JLabel cardanoVolume;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dogecoinChange;
    private javax.swing.JLabel dogecoinImage;
    private javax.swing.JLabel dogecoinLabel;
    private javax.swing.JLabel dogecoinMC;
    private javax.swing.JPanel dogecoinPanel;
    private javax.swing.JLabel dogecoinPrice;
    private javax.swing.JLabel dogecoinVolume;
    private javax.swing.JLabel ethereumChange;
    private javax.swing.JLabel ethereumImage;
    private javax.swing.JLabel ethereumLabel;
    private javax.swing.JLabel ethereumMC;
    private javax.swing.JPanel ethereumPanel;
    private javax.swing.JLabel ethereumPrice;
    private javax.swing.JLabel ethereumVolume;
    private javax.swing.JLabel labelsLabel;
    private javax.swing.JLabel litecoinChange;
    private javax.swing.JLabel litecoinImage;
    private javax.swing.JLabel litecoinLabel;
    private javax.swing.JLabel litecoinMC;
    private javax.swing.JPanel litecoinPanel;
    private javax.swing.JLabel litecoinPrice;
    private javax.swing.JLabel litecoinVolume;
    private javax.swing.JComboBox<String> selectedCurrency;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel valuesPanel;
    private javax.swing.JScrollPane valuesScrollPane;
    // End of variables declaration//GEN-END:variables
}
