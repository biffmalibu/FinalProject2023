/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CryptoProject;

/**
 *
 * @author bradf
 */
public class ShowCurrency extends javax.swing.JFrame {
    private CurrencyData data;
    /**
     * Creates new form ShowCurrency
     */
    public ShowCurrency() {
        initComponents();
        data = new CurrencyData();
        updateCoinData(selectedCurrency.getSelectedItem().toString());
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
        usdPanel = new javax.swing.JPanel();
        usdImage = new javax.swing.JLabel();
        usdLabel = new javax.swing.JLabel();
        usdPrice = new javax.swing.JLabel();
        eurPanel = new javax.swing.JPanel();
        eurImage = new javax.swing.JLabel();
        eurLabel = new javax.swing.JLabel();
        eurPrice = new javax.swing.JLabel();
        jpyPanel = new javax.swing.JPanel();
        jpyImage = new javax.swing.JLabel();
        jpyLabel = new javax.swing.JLabel();
        jpyPrice = new javax.swing.JLabel();
        selectedCurrency = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        Title.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Live Currency Prices");

        valuesScrollPane.setBackground(new java.awt.Color(153, 153, 153));

        valuesPanel.setBackground(new java.awt.Color(102, 102, 102));

        usdPanel.setBackground(new java.awt.Color(153, 153, 153));

        usdLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usdLabel.setText("USD - United States Dollar");

        usdPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usdPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usdPrice.setText("Loading...");

        javax.swing.GroupLayout usdPanelLayout = new javax.swing.GroupLayout(usdPanel);
        usdPanel.setLayout(usdPanelLayout);
        usdPanelLayout.setHorizontalGroup(
            usdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usdImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usdLabel)
                .addGap(241, 241, 241)
                .addComponent(usdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        usdPanelLayout.setVerticalGroup(
            usdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(usdPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(usdImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        eurPanel.setBackground(new java.awt.Color(153, 153, 153));

        eurLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eurLabel.setText("EUR - Euro");

        eurPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        eurPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eurPrice.setText("Loading...");

        javax.swing.GroupLayout eurPanelLayout = new javax.swing.GroupLayout(eurPanel);
        eurPanel.setLayout(eurPanelLayout);
        eurPanelLayout.setHorizontalGroup(
            eurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eurPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eurImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eurLabel)
                .addGap(374, 374, 374)
                .addComponent(eurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eurPanelLayout.setVerticalGroup(
            eurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eurPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eurLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(eurPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(eurImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpyPanel.setBackground(new java.awt.Color(153, 153, 153));

        jpyLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jpyLabel.setText("JPY - Japanese Yen");

        jpyPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jpyPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpyPrice.setText("Loading...");

        javax.swing.GroupLayout jpyPanelLayout = new javax.swing.GroupLayout(jpyPanel);
        jpyPanel.setLayout(jpyPanelLayout);
        jpyPanelLayout.setHorizontalGroup(
            jpyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jpyPanelLayout.setVerticalGroup(
            jpyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jpyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jpyPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(jpyImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout valuesPanelLayout = new javax.swing.GroupLayout(valuesPanel);
        valuesPanel.setLayout(valuesPanelLayout);
        valuesPanelLayout.setHorizontalGroup(
            valuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(valuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eurPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        valuesPanelLayout.setVerticalGroup(
            valuesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valuesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eurPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        valuesScrollPane.setViewportView(valuesPanel);

        selectedCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "NOK", "MXN" }));
        selectedCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedCurrencyActionPerformed(evt);
            }
        });

        updateButton.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Title)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addGap(0, 0, 0)
                .addComponent(valuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectedCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedCurrencyActionPerformed
        updateCoinData(selectedCurrency.getSelectedItem().toString());  // Update the values
    }//GEN-LAST:event_selectedCurrencyActionPerformed

    private void updateCoinData(String base) {
        usdPrice.setText(String.valueOf(data.getConversionRate(base, "USD")));
        eurPrice.setText(String.valueOf(data.getConversionRate(base, "EUR")));
        jpyPrice.setText(String.valueOf(data.getConversionRate(base, "JPY")));
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
            java.util.logging.Logger.getLogger(ShowCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowCurrency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowCurrency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JLabel eurImage;
    private javax.swing.JLabel eurLabel;
    private javax.swing.JPanel eurPanel;
    private javax.swing.JLabel eurPrice;
    private javax.swing.JLabel jpyImage;
    private javax.swing.JLabel jpyLabel;
    private javax.swing.JPanel jpyPanel;
    private javax.swing.JLabel jpyPrice;
    private javax.swing.JComboBox<String> selectedCurrency;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel usdImage;
    private javax.swing.JLabel usdLabel;
    private javax.swing.JPanel usdPanel;
    private javax.swing.JLabel usdPrice;
    private javax.swing.JPanel valuesPanel;
    private javax.swing.JScrollPane valuesScrollPane;
    // End of variables declaration//GEN-END:variables
}
