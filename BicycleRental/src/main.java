
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
        jLabel1.setText("Bicycle Rental");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        cbxPersonType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Student", "Worker" }));
        cbxPersonType.setToolTipText("");

        cbxBicycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Normal -> R$ 25,00", "Electric -> R$ 45,00" }));

        lblFinishDate.setText("Devolution Date:");

        lblPersonType.setText("Person Type:");

        lblBicycle.setText("Bicycle:");

        lblBeginDate.setText("Begin Date:");

        try {
            fTxtBeginDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fTxtFinishDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpnDataLayout = new javax.swing.GroupLayout(jpnData);
        jpnData.setLayout(jpnDataLayout);
        jpnDataLayout.setHorizontalGroup(
            jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDataLayout.createSequentialGroup()
                .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDataLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnDataLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBicycle)
                            .addComponent(lblPersonType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxBicycle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFinishDate)
                            .addComponent(lblBeginDate))
                        .addGap(15, 15, 15)
                        .addGroup(jpnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fTxtFinishDate, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(fTxtBeginDate))))
                .addContainerGap(61, Short.MAX_VALUE))
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
                .addGap(33, 33, 33)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
        
        txtTotalValue.setText("R$ " + totalValue);
    }//GEN-LAST:event_btnCalculateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
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
