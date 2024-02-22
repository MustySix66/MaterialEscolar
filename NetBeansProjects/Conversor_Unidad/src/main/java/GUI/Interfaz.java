
package GUI;

import Logica.CentimetrosAOtraUnidad;
import Logica.KilometrosAOtraUnidad;
import Logica.MetrosAOtraUnidad;
import Logica.MilimetrosAOtraUnidad;
import Logica.MillasAOtraUnidad;
import Logica.PiesAOtraUnidad;
import Logica.PulgadasAOtraUnidad;
import Logica.YardasAOtraUnidad;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUnidadIngreso = new javax.swing.JTextField();
        cbUnidadIngreso = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbConvertirUnidad = new javax.swing.JComboBox<>();
        txtResultado = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        etiquetaPerrona = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vamos a convertir:");

        txtUnidadIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUnidadIngreso.setName(""); // NOI18N
        txtUnidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadIngresoActionPerformed(evt);
            }
        });

        cbUnidadIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbUnidadIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Centimetro", "Milimetro", "Milla", "Yarda", "Pie", "Pulgada" }));
        cbUnidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnidadIngresoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("a:");

        cbConvertirUnidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbConvertirUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometro", "Metro", "Centimetro", "Milimetro", "Milla", "Yarda", "Pie", "Pulgada" }));
        cbConvertirUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConvertirUnidadActionPerformed(evt);
            }
        });

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtResultado.setEnabled(false);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });

        btnConvertir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbConvertirUnidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUnidadIngreso)
                    .addComponent(cbUnidadIngreso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtResultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaPerrona, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUnidadIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUnidadIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbConvertirUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConvertir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtResultado)
                            .addComponent(etiquetaPerrona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnidadIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadIngresoActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        try {
            String UnidadEntrada = String.valueOf(cbUnidadIngreso.getSelectedItem());
            String UnidadSalida = String.valueOf(cbConvertirUnidad.getSelectedItem());
            Double ValorIngreso = Double.parseDouble(txtUnidadIngreso.getText());
            
            switch (UnidadEntrada) {
                case "Kilometro":
                    KilometrosAOtraUnidad kilomet = new KilometrosAOtraUnidad();
                    txtResultado.setText(kilomet.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Metro":
                    MetrosAOtraUnidad metro = new MetrosAOtraUnidad();
                    txtResultado.setText(metro.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Centimetro":
                    CentimetrosAOtraUnidad centi = new CentimetrosAOtraUnidad();
                    txtResultado.setText(centi.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Milimetro":
                    MilimetrosAOtraUnidad mili = new MilimetrosAOtraUnidad();
                    txtResultado.setText(mili.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Milla":
                    MillasAOtraUnidad milla = new MillasAOtraUnidad();
                    txtResultado.setText(milla.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Yarda":
                    YardasAOtraUnidad yarda = new YardasAOtraUnidad();
                    txtResultado.setText(yarda.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Pie":
                    PiesAOtraUnidad pie = new PiesAOtraUnidad();
                    txtResultado.setText(pie.formula(ValorIngreso, UnidadSalida));
                    break;
                case "Pulgada":
                    PulgadasAOtraUnidad pulgada = new PulgadasAOtraUnidad();
                    txtResultado.setText(pulgada.formula(ValorIngreso, UnidadSalida));
                    break;
                
                default:
                    txtResultado.setText("No furula :c");
            }
            etiquetaPerrona.setText(UnidadSalida+"s");
        } catch (Exception e) {
            txtResultado.setText("No furuleichon :c");
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void cbUnidadIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUnidadIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUnidadIngresoActionPerformed

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

    private void cbConvertirUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConvertirUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbConvertirUnidadActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cbConvertirUnidad;
    private javax.swing.JComboBox<String> cbUnidadIngreso;
    private javax.swing.JLabel etiquetaPerrona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtUnidadIngreso;
    // End of variables declaration//GEN-END:variables
}
