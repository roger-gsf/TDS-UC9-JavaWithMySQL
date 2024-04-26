
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnData = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        cbxPersonType = new javax.swing.JComboBox<>();
        cbxBicycle = new javax.swing.JComboBox<>();
        lblFinishDate = new javax.swing.JLabel();
        lblPersonType = new javax.swing.JLabel();
        lblBicycle = new javax.swing.JLabel();
        lblBeginDate = new javax.swing.JLabel();
        fTxtBeginDate = new javax.swing.JFormattedTextField();
        fTxtFinishDate = new javax.swing.JFormattedTextField();
        jpnTotalValue = new javax.swing.JPanel();
        lblTotalValue = new javax.swing.JLabel();
        txtTotalValue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bicycle Rental");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        cbxPersonType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Student", "Worker" }));
        cbxPersonType.setToolTipText("");

        cbxBicycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Normal -> R$ 25,00", "Electric -> R$ 45,00" }));
        cbxBicycle.setToolTipText("");

        lblFinishDate.setText("Devolution Date:");
        lblFinishDate.setToolTipText("");

        lblPersonType.setText("Person Type:");
        lblPersonType.setToolTipText("");

        lblBicycle.setText("Bicycle:");
        lblBicycle.setToolTipText("");

        lblBeginDate.setText("Begin Date:");
        lblBeginDate.setToolTipText("");

        try {
            fTxtBeginDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTxtBeginDate.setToolTipText("");

        try {
            fTxtFinishDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fTxtFinishDate.setToolTipText("");

        javax.swing.GroupLayout jpnDataLayout = new javax.swing.GroupLayout(jpnData);
        jpnData.setLayout(jpnDataLayout);
        jpnDataLayout.setHorizontalGroup(
            jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDataLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPersonType)
                    .addComponent(lblBicycle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxBicycle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPersonType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBeginDate)
                    .addComponent(lblFinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fTxtFinishDate)
                    .addComponent(fTxtBeginDate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
        );
        jpnDataLayout.setVerticalGroup(
            jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDataLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDataLayout.createSequentialGroup()
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBicycle)
                            .addComponent(cbxBicycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnDataLayout.createSequentialGroup()
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBeginDate)
                            .addComponent(fTxtBeginDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFinishDate)
                            .addComponent(fTxtFinishDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lblTotalValue.setText("Total Value:");

        txtTotalValue.setEditable(false);

        javax.swing.GroupLayout jpnTotalValueLayout = new javax.swing.GroupLayout(jpnTotalValue);
        jpnTotalValue.setLayout(jpnTotalValueLayout);
        jpnTotalValueLayout.setHorizontalGroup(
            jpnTotalValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTotalValueLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblTotalValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTotalValueLayout.setVerticalGroup(
            jpnTotalValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTotalValueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jpnTotalValueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalValue)
                    .addComponent(txtTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTotalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        double discount = 0.00;
        double totalValue = 0.00;

        switch (cbxBicycle.getSelectedIndex()) {
            case 1 ->
                totalValue = 25;
            case 2 ->
                totalValue = 45;
        };

        switch (cbxPersonType.getSelectedIndex()) {
            case 1 ->
                discount += 0.50;
            case 2 ->
                discount += 0.10;
        };

        LocalDate DataInicio = LocalDate.parse(fTxtBeginDate.getText(), formattedDate);
        LocalDate DataDevolucao = LocalDate.parse(fTxtFinishDate.getText(), formattedDate);

        long difference = ChronoUnit.DAYS.between(DataInicio, DataDevolucao);
        System.out.println("The difference is : " + difference);

        if (difference > 20) {
            discount += 0.10;
        }

        totalValue = totalValue - (totalValue * discount);

        txtTotalValue.setText("R$ " + (totalValue * difference));
    }//GEN-LAST:event_btnCalculateActionPerformed

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
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JComboBox<String> cbxBicycle;
    private javax.swing.JComboBox<String> cbxPersonType;
    private javax.swing.JFormattedTextField fTxtBeginDate;
    private javax.swing.JFormattedTextField fTxtFinishDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpnData;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JPanel jpnTotalValue;
    private javax.swing.JLabel lblBeginDate;
    private javax.swing.JLabel lblBicycle;
    private javax.swing.JLabel lblFinishDate;
    private javax.swing.JLabel lblPersonType;
    private javax.swing.JLabel lblTotalValue;
    private javax.swing.JTextField txtTotalValue;
    // End of variables declaration//GEN-END:variables
}
