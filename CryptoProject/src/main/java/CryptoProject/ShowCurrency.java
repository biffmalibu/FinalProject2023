/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CryptoProject;

import java.text.DecimalFormat;
import javax.swing.JLabel;

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
        updateCurrencyData(selectedCurrency.getSelectedItem().toString());
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
        gbpPanel = new javax.swing.JPanel();
        gbpImage = new javax.swing.JLabel();
        gbpLabel = new javax.swing.JLabel();
        gbpPrice = new javax.swing.JLabel();
        audPanel = new javax.swing.JPanel();
        audImage = new javax.swing.JLabel();
        audLabel = new javax.swing.JLabel();
        audPrice = new javax.swing.JLabel();
        cadPanel = new javax.swing.JPanel();
        cadImage = new javax.swing.JLabel();
        cadLabel = new javax.swing.JLabel();
        cadPrice = new javax.swing.JLabel();
        chfPanel = new javax.swing.JPanel();
        chfImage = new javax.swing.JLabel();
        chfLabel = new javax.swing.JLabel();
        chfPrice = new javax.swing.JLabel();
        cnyPanel = new javax.swing.JPanel();
        cnyImage = new javax.swing.JLabel();
        cnyLabel = new javax.swing.JLabel();
        cnyPrice = new javax.swing.JLabel();
        nokPanel = new javax.swing.JPanel();
        nokImage = new javax.swing.JLabel();
        nokLabel = new javax.swing.JLabel();
        nokPrice = new javax.swing.JLabel();
        mxnPanel = new javax.swing.JPanel();
        mxnImage = new javax.swing.JLabel();
        mxnLabel = new javax.swing.JLabel();
        mxnPrice = new javax.swing.JLabel();
        selectedCurrency = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(usdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eurPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addContainerGap())
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

        gbpPanel.setBackground(new java.awt.Color(153, 153, 153));

        gbpLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gbpLabel.setText("GBP - Great British Pound");

        gbpPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gbpPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gbpPrice.setText("Loading...");

        javax.swing.GroupLayout gbpPanelLayout = new javax.swing.GroupLayout(gbpPanel);
        gbpPanel.setLayout(gbpPanelLayout);
        gbpPanelLayout.setHorizontalGroup(
            gbpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gbpImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gbpPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gbpPanelLayout.setVerticalGroup(
            gbpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gbpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gbpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gbpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(gbpPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(gbpImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        audPanel.setBackground(new java.awt.Color(153, 153, 153));

        audLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        audLabel.setText("AUD - Austrailian Dollar");

        audPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        audPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        audPrice.setText("Loading...");

        javax.swing.GroupLayout audPanelLayout = new javax.swing.GroupLayout(audPanel);
        audPanel.setLayout(audPanelLayout);
        audPanelLayout.setHorizontalGroup(
            audPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(audImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(audLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(audPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        audPanelLayout.setVerticalGroup(
            audPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(audPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(audPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(audPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(audLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(audPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(audImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cadPanel.setBackground(new java.awt.Color(153, 153, 153));

        cadLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadLabel.setText("CAD - Canadian Dollars");

        cadPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cadPrice.setText("Loading...");

        javax.swing.GroupLayout cadPanelLayout = new javax.swing.GroupLayout(cadPanel);
        cadPanel.setLayout(cadPanelLayout);
        cadPanelLayout.setHorizontalGroup(
            cadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cadPanelLayout.setVerticalGroup(
            cadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(cadPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(cadImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        chfPanel.setBackground(new java.awt.Color(153, 153, 153));

        chfLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chfLabel.setText("CHF - Swiss Francs");

        chfPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        chfPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chfPrice.setText("Loading...");

        javax.swing.GroupLayout chfPanelLayout = new javax.swing.GroupLayout(chfPanel);
        chfPanel.setLayout(chfPanelLayout);
        chfPanelLayout.setHorizontalGroup(
            chfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chfPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chfImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        chfPanelLayout.setVerticalGroup(
            chfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chfPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chfPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(chfPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(chfImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cnyPanel.setBackground(new java.awt.Color(153, 153, 153));

        cnyLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cnyLabel.setText("CNY - Chinese Yuan");

        cnyPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cnyPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cnyPrice.setText("Loading...");

        javax.swing.GroupLayout cnyPanelLayout = new javax.swing.GroupLayout(cnyPanel);
        cnyPanel.setLayout(cnyPanelLayout);
        cnyPanelLayout.setHorizontalGroup(
            cnyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cnyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cnyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cnyPanelLayout.setVerticalGroup(
            cnyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cnyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cnyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cnyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cnyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(cnyPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(cnyImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        nokPanel.setBackground(new java.awt.Color(153, 153, 153));

        nokLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nokLabel.setText("NOK - Norwegian Krone");

        nokPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nokPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nokPrice.setText("Loading...");

        javax.swing.GroupLayout nokPanelLayout = new javax.swing.GroupLayout(nokPanel);
        nokPanel.setLayout(nokPanelLayout);
        nokPanelLayout.setHorizontalGroup(
            nokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nokImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nokLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nokPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        nokPanelLayout.setVerticalGroup(
            nokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nokPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nokPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(nokPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(nokImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mxnPanel.setBackground(new java.awt.Color(153, 153, 153));

        mxnLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mxnLabel.setText("MXN - Mexican Peso");

        mxnPrice.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mxnPrice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mxnPrice.setText("Loading...");

        javax.swing.GroupLayout mxnPanelLayout = new javax.swing.GroupLayout(mxnPanel);
        mxnPanel.setLayout(mxnPanelLayout);
        mxnPanelLayout.setHorizontalGroup(
            mxnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mxnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mxnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mxnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mxnPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mxnPanelLayout.setVerticalGroup(
            mxnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mxnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mxnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mxnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mxnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(mxnPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(mxnImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jpyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gbpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(audPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chfPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cnyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nokPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mxnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gbpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(audPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chfPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mxnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        valuesScrollPane.setViewportView(valuesPanel);

        selectedCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "NOK", "MXN" }));
        selectedCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedCurrencyActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setEnabled(false);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(valuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Title)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton))
                .addGap(0, 0, 0)
                .addComponent(valuesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectedCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedCurrencyActionPerformed
        updateCurrencyData(selectedCurrency.getSelectedItem().toString());  // Update the values
    }//GEN-LAST:event_selectedCurrencyActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateCurrencyData(String base) {
        String symbol = getCurrencySymbol(base);
        String[] currencies = { // Array of strings for the currency names
            "USD", "EUR", "JPY", "GBP", "AUD",
            "CAD", "CHF", "CNY", "NOK", "MXN",
        };
        JLabel[] prices = {usdPrice, eurPrice, jpyPrice, gbpPrice, audPrice, cadPrice, chfPrice, cnyPrice, nokPrice, mxnPrice};
        DecimalFormat decimalFormat = new DecimalFormat("0.0###"); // Format the value with two decimal places and commas
        decimalFormat.setGroupingUsed(true); // Enable comma grouping
        for (int i = 0; i < prices.length; i++) {
            String currentRate = String.valueOf(decimalFormat.format(data.getConversionRate(base, currencies[i])));
            prices[i].setText(symbol + currentRate);
            //
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
    private javax.swing.JLabel audImage;
    private javax.swing.JLabel audLabel;
    private javax.swing.JPanel audPanel;
    private javax.swing.JLabel audPrice;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cadImage;
    private javax.swing.JLabel cadLabel;
    private javax.swing.JPanel cadPanel;
    private javax.swing.JLabel cadPrice;
    private javax.swing.JLabel chfImage;
    private javax.swing.JLabel chfLabel;
    private javax.swing.JPanel chfPanel;
    private javax.swing.JLabel chfPrice;
    private javax.swing.JLabel cnyImage;
    private javax.swing.JLabel cnyLabel;
    private javax.swing.JPanel cnyPanel;
    private javax.swing.JLabel cnyPrice;
    private javax.swing.JLabel eurImage;
    private javax.swing.JLabel eurLabel;
    private javax.swing.JPanel eurPanel;
    private javax.swing.JLabel eurPrice;
    private javax.swing.JLabel gbpImage;
    private javax.swing.JLabel gbpLabel;
    private javax.swing.JPanel gbpPanel;
    private javax.swing.JLabel gbpPrice;
    private javax.swing.JLabel jpyImage;
    private javax.swing.JLabel jpyLabel;
    private javax.swing.JPanel jpyPanel;
    private javax.swing.JLabel jpyPrice;
    private javax.swing.JLabel mxnImage;
    private javax.swing.JLabel mxnLabel;
    private javax.swing.JPanel mxnPanel;
    private javax.swing.JLabel mxnPrice;
    private javax.swing.JLabel nokImage;
    private javax.swing.JLabel nokLabel;
    private javax.swing.JPanel nokPanel;
    private javax.swing.JLabel nokPrice;
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
