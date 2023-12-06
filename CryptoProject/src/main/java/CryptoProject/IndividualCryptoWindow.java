///////////////////////////////////////////////////////////////////////////////////////
//                                                                                   //
//  Author: Bradford Torpey                                                          //
//  Purpose: To display live cryptocurrency information utilizing the CoinGecko API  //
//                                                                                   //
///////////////////////////////////////////////////////////////////////////////////////
package CryptoProject;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author bradf
 */
public class IndividualCryptoWindow extends javax.swing.JFrame { 
    private String crypto;
    private String currency;
    private double currentPrice;
    private String marketCap;
    private String dailyVolume;
    private String percentChange;
    private double historicPrice;
    private double dailyChange;

 
    public IndividualCryptoWindow(String crypto, String currency, double currentPrice, String marketCap, String dailyVolume, String percentChange) {
        initComponents();
        setTitle(crypto + " Information in " + currency.toUpperCase()); // Set the title of the window
        this.crypto = crypto; // Initialize the fields
        this.currency = currency;
        this.currentPrice = currentPrice;
        this.marketCap = marketCap;
        this.dailyVolume = dailyVolume;
        this.percentChange = percentChange;
        historicPrice = findHistoricPrice();
        dailyChange = currentPrice - historicPrice;
        populateCurrencyInfo(); // Set the currency info
        
    }
    
    /**
     * Populates the window with the values from the constructor.
     */
    private void populateCurrencyInfo() {
        cryptoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + crypto.toLowerCase() + ".png")));
        String symbol = getCurrencySymbol(currency); // Find the currency symbol to use
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");           // Format the decimal place and commas - CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
        decimalFormat.setMinimumFractionDigits(2);                            // Ensure two decimal places are shown - CODE FROM: https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html
        marketCapLabel.setText("Market Cap: " + symbol + marketCap);                // Set the labels
        dailyVolumeLabel.setText("24h Vol: " + symbol + dailyVolume);
        cryptoLabel.setText(crypto);
        currentPriceLabel.setText(symbol + String.valueOf(decimalFormat.format(currentPrice)));
        percentChangeLabel.setText("(" + percentChange + ")");
        historicPriceLabel.setText("Yesterdays Price: " + symbol + String.valueOf(decimalFormat.format(historicPrice)));
        if (parsePercentageValue(percentChange) > 0)
                percentChangeLabel.setForeground(Color.GREEN); // Adjust the color of the percentage if it is negative or positve, or 0.
        else if (parsePercentageValue(percentChange) < 0)
            percentChangeLabel.setForeground(Color.RED);
        else
            percentChangeLabel.setForeground(Color.BLACK);
        if (dailyChange > 0) { // Add a "+" if positive 
            dailyChangeLabel.setText("+" + decimalFormat.format(dailyChange));  // Print the difference with 3 decimal places
            dailyChangeLabel.setForeground(Color.GREEN);
        }
        else if (dailyChange < 0) {
            dailyChangeLabel.setText(decimalFormat.format(dailyChange)); // Print the difference with 3 decimal places
            dailyChangeLabel.setForeground(Color.RED);
        }
        else {
            dailyChangeLabel.setText(String.valueOf(dailyChange)); // Print the difference as 0.0 if only 0.
            dailyChangeLabel.setForeground(Color.BLACK);
        }
    }
    /*
    * Calculates yesterdays cryptocurrency price
    */
    private double findHistoricPrice() {
        double percent = parsePercentageValue(percentChange);
        return currentPrice/(1+(percent/100));
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentPriceLabel = new javax.swing.JLabel();
        cryptoLabel = new javax.swing.JLabel();
        percentChangeLabel = new javax.swing.JLabel();
        dailyChangeLabel = new javax.swing.JLabel();
        historicPriceLabel = new javax.swing.JLabel();
        cryptoLogo = new javax.swing.JLabel();
        marketCapLabel = new javax.swing.JLabel();
        dailyVolumeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        currentPriceLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        currentPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentPriceLabel.setText("$6,455,133,345.34");

        cryptoLabel.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        cryptoLabel.setText("Binancecoin");

        percentChangeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        percentChangeLabel.setText("(-0.4728%)");

        dailyChangeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dailyChangeLabel.setText("-$452,443.44");

        historicPriceLabel.setText("Yesterdays Price: $143.5324");

        marketCapLabel.setText("Market Cap: $3,345,323,552,345.34");

        dailyVolumeLabel.setText("24h Vol: $3,345,323,552,345.34");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cryptoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cryptoLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(currentPriceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dailyChangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(percentChangeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(historicPriceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(marketCapLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dailyVolumeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cryptoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cryptoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyChangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentChangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historicPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marketCapLabel)
                    .addComponent(dailyVolumeLabel))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(IndividualCurrencyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndividualCurrencyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndividualCurrencyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndividualCurrencyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cryptoLabel;
    private javax.swing.JLabel cryptoLogo;
    private javax.swing.JLabel currentPriceLabel;
    private javax.swing.JLabel dailyChangeLabel;
    private javax.swing.JLabel dailyVolumeLabel;
    private javax.swing.JLabel historicPriceLabel;
    private javax.swing.JLabel marketCapLabel;
    private javax.swing.JLabel percentChangeLabel;
    // End of variables declaration//GEN-END:variables
}
