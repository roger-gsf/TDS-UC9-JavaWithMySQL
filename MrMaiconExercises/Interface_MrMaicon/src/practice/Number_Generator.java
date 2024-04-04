package practice;

public class Number_Generator extends javax.swing.JFrame {

    public Number_Generator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDigiteNumero = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        lblMaior = new javax.swing.JLabel();
        lblMenor = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        txtNumeros = new javax.swing.JTextField();
        txtMaior = new javax.swing.JTextField();
        txtMenor = new javax.swing.JTextField();
        txtMedia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exercício 1");

        lblDigiteNumero.setText("Type a number:");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblMaior.setText("Biggest >>>");

        lblMenor.setText("Smallest >>>");

        lblMedia.setText("Average >>>");

        txtMaior.setEditable(false);

        txtMenor.setEditable(false);

        txtMedia.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDigiteNumero)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOK))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMedia)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMaior)
                                .addComponent(lblMenor))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaior)
                                .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblDigiteNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaior)
                    .addComponent(txtMaior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMenor)
                    .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedia)
                    .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String numeros = txtNumeros.getText();
        String[] numerosParaStrings = numeros.split(";");

        // Cálculo do maior número:
        int maior = Integer.MIN_VALUE;
        for (String numeroString : numerosParaStrings) {
            try {
                int numero = Integer.parseInt(numeroString.trim());
                maior = numero;
            } catch (NumberFormatException e) {
            }
        }

        // Cálculo do menor número:
        int menor = Integer.MAX_VALUE;
        for (String numeroString : numerosParaStrings) {
            try {
                int numero = Integer.parseInt(numeroString.trim());
                if (numero < menor) {
                    menor = numero;
                }
            } catch (NumberFormatException e) {
            }
        }

        // Calculo da média:
        int soma = 0;
        int quantidadeNumeros = 0;
        for (String numeroString : numerosParaStrings) {
            try {
                int numero = Integer.parseInt(numeroString.trim());
                soma += numero;
                quantidadeNumeros++;

            } catch (NumberFormatException e) {
            }
        }

        // Exibição dos valores nos campos de texto:
        if (maior != Integer.MIN_VALUE) {
            txtMaior.setText(Integer.toString(maior));
        } else {
            txtMaior.setText("Nenhum número válido foi digitado.");
        }

        if (menor != Integer.MAX_VALUE) {
            txtMenor.setText(Integer.toString(menor));
        } else {
            txtMenor.setText("Nenhum número válido foi digitado.");
        }

        if (quantidadeNumeros > 0) {
            double media = (double) soma / quantidadeNumeros;
            txtMedia.setText(Double.toString(media));
        } else {
            txtMedia.setText("Nenhum número válido foi digitado.");
        }
    }//GEN-LAST:event_btnOKActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Number_Generator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblDigiteNumero;
    private javax.swing.JLabel lblMaior;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblMenor;
    private javax.swing.JTextField txtMaior;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtMenor;
    private javax.swing.JTextField txtNumeros;
    // End of variables declaration//GEN-END:variables
}
