/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CryptoProject;

import java.awt.Color;
import java.text.DecimalFormat; // CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author bradf
 */
public class CurrencyConverter extends javax.swing.JFrame {
    private CryptoData data; // Create a field for the data class
    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
        data = new CryptoData(); // Initialize the data container class
        initComponents();
        convertButton.setEnabled(false); // Disable the buttons initially
        swapButton.setEnabled(false);
        resetButton.setEnabled(false);
        currencyAmount.getDocument().addDocumentListener(new DocumentListener() { // Add a document listener to disable or enable the buttons based on input
            @Override                                                             // Dissallow empty, or non-double inputs
            public void insertUpdate(DocumentEvent e) {
                onCurrencyAmountTextChanged();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                onCurrencyAmountTextChanged();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                onCurrencyAmountTextChanged();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        convertButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        currencyAmount = new javax.swing.JTextField();
        selectedCurrencyOne = new javax.swing.JComboBox<>();
        swapButton = new javax.swing.JButton();
        selectedCurrencyTwo = new javax.swing.JComboBox<>();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        currencyResult = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Currency Converter");

        convertButton.setText("Convert");
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        selectedCurrencyOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Ethereum", "Litecoin", "Dogecoin", "Cardano", "Solana", "Monero", "Polkadot", "Ripple", "Binancecoin", "USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "NOK", "MXN" }));
        selectedCurrencyOne.setToolTipText("");
        selectedCurrencyOne.setName("eee"); // NOI18N
        selectedCurrencyOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedCurrencyOneActionPerformed(evt);
            }
        });

        swapButton.setText("↑↓");
        swapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapButtonActionPerformed(evt);
            }
        });

        selectedCurrencyTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Ethereum", "Litecoin", "Dogecoin", "Cardano", "Solana", "Monero", "Polkadot", "Ripple", "Binancecoin", "USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "NOK", "MXN" }));
        selectedCurrencyTwo.setToolTipText("");
        selectedCurrencyTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedCurrencyTwoActionPerformed(evt);
            }
        });

        fromLabel.setText("From:");

        toLabel.setText("To:");

        amountLabel.setText("Amount:");

        currencyResult.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        currencyResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(amountLabel)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectedCurrencyOne, 0, 126, Short.MAX_VALUE)
                            .addComponent(selectedCurrencyTwo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(currencyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(swapButton)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(convertButton)
                        .addGap(232, 232, 232))))
            .addComponent(currencyResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectedCurrencyOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectedCurrencyTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(swapButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currencyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetButton)
                    .addComponent(convertButton))
                .addGap(29, 29, 29)
                .addComponent(currencyResult)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Reset the comboboxes, amount text, and result text.
     * @param evt Reset button pressed
     */
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        selectedCurrencyOne.setSelectedItem("Bitcoin");
        selectedCurrencyTwo.setSelectedItem("Bitcoin");
        currencyAmount.setText("");
        currencyResult.setText("");
        resetButton.setEnabled(false); // Disable the reset button after it is pressed 
    }//GEN-LAST:event_resetButtonActionPerformed
    
    /**
     * Convert the values 
     * @param evt Convert button pressed
     */
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButtonActionPerformed
        // TODO add your handling code here:
        convert(selectedCurrencyOne.getSelectedItem().toString().toLowerCase(), selectedCurrencyTwo.getSelectedItem().toString().toLowerCase(), Double.parseDouble(currencyAmount.getText()));
    }//GEN-LAST:event_convertButtonActionPerformed

    /**
     * Swap the values of the comboboxes and perform a conversion
     * @param evt Swap button pressed
     */
    private void swapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapButtonActionPerformed
        // TODO add your handling code here:
        String selectedItem1 = selectedCurrencyOne.getSelectedItem().toString(); // Store the original states
        String selectedItem2 = selectedCurrencyTwo.getSelectedItem().toString();
        selectedCurrencyOne.setSelectedItem(selectedItem2); // Swap them, then do the conversion
        selectedCurrencyTwo.setSelectedItem(selectedItem1); 
        convert(selectedCurrencyOne.getSelectedItem().toString().toLowerCase(), selectedCurrencyTwo.getSelectedItem().toString().toLowerCase(), Double.parseDouble(currencyAmount.getText()));
        
    }//GEN-LAST:event_swapButtonActionPerformed
    /**
     * Return to main menu
     * @param evt Back button pressed
     */
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /*
    * Enables the reset button when changes are made
    */
    private void selectedCurrencyOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedCurrencyOneActionPerformed
        if(selectedCurrencyOne.getSelectedItem().equals("Bitcoin") && selectedCurrencyTwo.getSelectedItem().equals("Bitcoin") && currencyAmount.getText().equals(""))  
            resetButton.setEnabled(false); // If the reset conditions are met, disable the button
        else
            resetButton.setEnabled(true); // Otherwise, enable it
    }//GEN-LAST:event_selectedCurrencyOneActionPerformed
    
    /*
    * Enables the reset button when changes are made
    */
    private void selectedCurrencyTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedCurrencyTwoActionPerformed
        if(selectedCurrencyOne.getSelectedItem().equals("Bitcoin") && selectedCurrencyTwo.getSelectedItem().equals("Bitcoin") && currencyAmount.getText().equals(""))  
            resetButton.setEnabled(false); // If the reset conditions are met, disable the button
        else
            resetButton.setEnabled(true); // Otherwise, enable it
    }//GEN-LAST:event_selectedCurrencyTwoActionPerformed

    /** 
     *  Disables the swap and convert button on incorrect input, and changes the text to red. Enables again on correct input.
     */
    private void onCurrencyAmountTextChanged() {
        if (currencyAmount.getText().equals("") && selectedCurrencyOne.getSelectedItem().equals("Bitcoin") && selectedCurrencyTwo.getSelectedItem().equals("Bitcoin"))  {
            resetButton.setEnabled(false); // Disable the button if the amount field is empty and both currencies are already reset
        }
        else
            resetButton.setEnabled(true); // Otherwise, enable the box
        String amountText = currencyAmount.getText();  // Get the amount text
        // Check if the text is empty or not a valid double
        boolean isValid = !amountText.isEmpty(); // Create a boolean to track the state of the text
        if (isValid) {
            try {
                Double.parseDouble(amountText); // Try to parse the value as a double
            } catch (NumberFormatException e) { // If an exception occurs, we know there is bad input
                isValid = false;    // Set the bool to false
            }
        }
        // Enable or disable the convertButton and swapButton based on the validation result
        if(!isValid) 
            currencyAmount.setForeground(Color.red); // Set the text to red on an error
        else
            currencyAmount.setForeground(Color.black); // Reset the text
        convertButton.setEnabled(isValid); // Update the button's states
        swapButton.setEnabled(isValid);
    }
    /** Performs the currency conversion and displays the result to the user
     * 
     * @param fromCurrency The currency to convert from
     * @param toCurrency The currency to convert to
     * @param amount The amount of currency to convert to
     */
    private void convert(String fromCurrency, String toCurrency, double amount) {
        DecimalFormat CryptoResultFormat = new DecimalFormat("0.########"); // CODE FROM: https://stackoverflow.com/questions/26706784/how-to-make-0-display-as-0-00-using-decimal-format
        DecimalFormat CurrencyResultFormat = new DecimalFormat("0.###");
        String value;
        if(fromCurrency.length() == 3 && toCurrency.length() == 3) {  // Convert Currency -> Currency
            value = String.valueOf( CurrencyResultFormat.format(amount/data.getPrice("bitcoin", fromCurrency.toLowerCase()) * data.getPrice("bitcoin", toCurrency.toLowerCase())));
            currencyResult.setText(amount + " " + fromCurrency.toUpperCase() + " = " + value + " " + toCurrency.toUpperCase());
        }
        else if(fromCurrency.length() == 3 && toCurrency.length() > 3) { // Convert Currency -> Crypto
            value = String.valueOf(CryptoResultFormat.format(amount/data.getPrice(toCurrency.toLowerCase(), fromCurrency.toLowerCase())));
            currencyResult.setText(amount + " " + fromCurrency.toUpperCase() + " = " + value + " " + toCurrency.substring(0, 1).toUpperCase() + toCurrency.substring(1)); //CODE FROM: https://www.javatpoint.com/how-to-capitalize-the-first-letter-of-a-string-in-java
        }
        else if(fromCurrency.length() > 3 && toCurrency.length() == 3) { // Convert Crypto -> Currency
            value = String.valueOf(CurrencyResultFormat.format(data.getPrice(fromCurrency.toLowerCase(), toCurrency.toLowerCase()) * amount));
            currencyResult.setText(amount + " " + fromCurrency.substring(0, 1).toUpperCase() + fromCurrency.substring(1) + " = " + value + " " + toCurrency.toUpperCase()); //CODE FROM: https://www.javatpoint.com/how-to-capitalize-the-first-letter-of-a-string-in-java
        }
        else if(fromCurrency.length() > 3 && toCurrency.length() > 3) { // Convert Crypto -> Crypto
            value = String.valueOf(CryptoResultFormat.format(data.getPrice(fromCurrency.toLowerCase(), "usd")/data.getPrice(toCurrency.toLowerCase(), "usd") * amount));
            currencyResult.setText(amount + " " + fromCurrency.substring(0, 1).toUpperCase() + fromCurrency.substring(1) + " = " + value + " " + toCurrency.substring(0, 1).toUpperCase() + toCurrency.substring(1)); //CODE FROM: https://www.javatpoint.com/how-to-capitalize-the-first-letter-of-a-string-in-java
        }
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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new CurrencyConverter().setVisible(true);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton convertButton;
    private javax.swing.JTextField currencyAmount;
    private javax.swing.JLabel currencyResult;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> selectedCurrencyOne;
    private javax.swing.JComboBox<String> selectedCurrencyTwo;
    private javax.swing.JButton swapButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel toLabel;
    // End of variables declaration//GEN-END:variables
}
