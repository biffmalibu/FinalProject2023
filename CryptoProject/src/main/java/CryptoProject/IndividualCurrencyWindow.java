///////////////////////////////////////////////////////////////////////////////////////
//                                                                                   //
//  Author: Bradford Torpey                                                          //
//  Purpose: To display live currency information utilizing the Currencybeacon API   //
//                                                                                   //
///////////////////////////////////////////////////////////////////////////////////////
package CryptoProject;

import java.awt.Color;
import java.text.DecimalFormat;

/**
 *
 * @author bradf
 */
public class IndividualCurrencyWindow extends javax.swing.JFrame { 
    private String fromCurrency;
    private String toCurrency;
    private double currentRate;
    private double historicRate;
    private double dailyChange;
    private double percentChange;
 
    public IndividualCurrencyWindow(String fromCurrency, String toCurrency, double currentRate, double historicRate, double dailyChange, double percentChange) {
        getContentPane().setBackground(new Color(153, 153, 153)); // Set the color of the frame for better viewing
        initComponents();
        currencyFlag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/" + toCurrency.toLowerCase() + ".png")));
        setTitle(fromCurrency + "/" + toCurrency + " Information"); // Set the title of the window
        this.fromCurrency = fromCurrency; // Initialize the fields
        this.toCurrency = toCurrency;
        this.currentRate = currentRate;
        this.historicRate = historicRate;
        this.dailyChange = dailyChange;
        this.percentChange = percentChange;
        populateCurrencyInfo(); // Set the currency info
        
    }
    
    /**
     * Populates the window with the values from the constructor.
     */
    private void populateCurrencyInfo() {
        String symbol = getCurrencySymbol(toCurrency);
        DecimalFormat decimalFormat = new DecimalFormat("0.0###"); // Format the value with two decimal places and commas
        currenciesLabel.setText(fromCurrency + "/" + toCurrency);
        currentRateLabel.setText(symbol + String.valueOf(decimalFormat.format(currentRate)));
        percentChangeLabel.setText("(" + String.format("%.4f", percentChange) + "%)");
        historicPrice.setText("Yesterdays Price: " + symbol + String.valueOf(decimalFormat.format(historicRate)));
        if (percentChange > 0)
                percentChangeLabel.setForeground(Color.GREEN); // Adjust the color of the percentage if it is negative or positve, or 0.
        else if (percentChange < 0)
            percentChangeLabel.setForeground(Color.RED);
        else
            percentChangeLabel.setForeground(Color.BLACK);
        if (dailyChange > 0) { // Add a "+" if positive 
            dailyChangeLabel.setText("+" + String.format("%.8f", dailyChange));  // Print the difference with 12 decimal places
            dailyChangeLabel.setForeground(Color.GREEN);
        }
        else if (dailyChange < 0) {
            dailyChangeLabel.setText(String.format("%.8f", dailyChange)); // Print the difference with 12 decimal places
            dailyChangeLabel.setForeground(Color.RED);
        }
        else {
            dailyChangeLabel.setText(String.valueOf(dailyChange)); // Print the difference as 0.0 if only 0.
            dailyChangeLabel.setForeground(Color.BLACK);
        }
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

        currentRateLabel = new javax.swing.JLabel();
        currenciesLabel = new javax.swing.JLabel();
        percentChangeLabel = new javax.swing.JLabel();
        dailyChangeLabel = new javax.swing.JLabel();
        historicPrice = new javax.swing.JLabel();
        currencyFlag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        currentRateLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        currentRateLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        currentRateLabel.setText("145.5133");

        currenciesLabel.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        currenciesLabel.setText("USA/JPY");

        percentChangeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        percentChangeLabel.setText("(-0.4728%)");

        dailyChangeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dailyChangeLabel.setText("-0.003243234342");

        historicPrice.setText("Yesterdays Price: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(historicPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currentRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dailyChangeLabel)
                        .addGap(12, 12, 12)
                        .addComponent(percentChangeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(currencyFlag, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currenciesLabel)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(currencyFlag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currenciesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dailyChangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentChangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historicPrice)
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
    private javax.swing.JLabel currenciesLabel;
    private javax.swing.JLabel currencyFlag;
    private javax.swing.JLabel currentRateLabel;
    private javax.swing.JLabel dailyChangeLabel;
    private javax.swing.JLabel historicPrice;
    private javax.swing.JLabel percentChangeLabel;
    // End of variables declaration//GEN-END:variables
}
