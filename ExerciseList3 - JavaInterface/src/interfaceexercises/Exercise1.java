package interfaceexercises;

import javax.swing.JOptionPane;

public class Exercise1 extends javax.swing.JFrame {

    public Exercise1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblEarthWeight = new javax.swing.JLabel();
        jfTxtEarthWeight = new javax.swing.JFormattedTextField();
        btnCalculate = new javax.swing.JButton();
        lblSelect = new javax.swing.JLabel();
        cbxPlanets = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("What would your weight be in other planets?");

        lblEarthWeight.setText("Type your eight in earth (kg):");

        jfTxtEarthWeight.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        btnCalculate.setText("Calculate Weight");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblSelect.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelect.setText("Select the planet:");

        cbxPlanets.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Earth", "Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(lblEarthWeight))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(cbxPlanets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jfTxtEarthWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEarthWeight)
                .addGap(5, 5, 5)
                .addComponent(jfTxtEarthWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPlanets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        String selectedPlanet = (String) cbxPlanets.getSelectedItem();
        double weightOnSelectedPlanet = 0.00;

        try {
            double earthWeight = Double.parseDouble(jfTxtEarthWeight.getText());

            if (earthWeight <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a valid weight in Earth.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            switch (selectedPlanet) {
                case "Earth":
                    weightOnSelectedPlanet = earthWeight * 1;
                    break;
                case "Mercury":
                    weightOnSelectedPlanet = earthWeight * 0.37;
                    break;
                case "Venus":
                    weightOnSelectedPlanet = earthWeight * 0.88;
                    break;
                case "Mars":
                    weightOnSelectedPlanet = earthWeight * 0.38;
                    break;
                case "Jupiter":
                    weightOnSelectedPlanet = earthWeight * 2.64;
                    break;
                case "Saturn":
                    weightOnSelectedPlanet = earthWeight * 1.15;
                    break;
                case "Uranus":
                    weightOnSelectedPlanet = earthWeight * 1.17;
                    break;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Your weight on the planet " + selectedPlanet
                    + " is " + String.format("%.2f", weightOnSelectedPlanet) + " kg.", "Calculation result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number for Earth weight.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JComboBox<String> cbxPlanets;
    private javax.swing.JFormattedTextField jfTxtEarthWeight;
    private javax.swing.JLabel lblEarthWeight;
    private javax.swing.JLabel lblSelect;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
