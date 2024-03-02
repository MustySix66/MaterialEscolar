package IGU;

import logica.ElfoImp;
import logica.GuerreroImp;
import logica.MagoImp;
import logica.Personaje;

public class Grafica extends javax.swing.JFrame {

    public Grafica() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEspecieOne = new javax.swing.JComboBox<>();
        cbEspecieTwo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbVidaOne = new javax.swing.JComboBox<>();
        cbVidaTwo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbManaOne = new javax.swing.JComboBox<>();
        cbManaTwo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbNivelTwo = new javax.swing.JComboBox<>();
        cbNivelOne = new javax.swing.JComboBox<>();
        btnCombatir = new javax.swing.JButton();
        txtNombreOne = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreTwo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 23)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Escoge tus combatientes!");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rival 1:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Rival 2:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escoge la clase de tu combatiente:");

        cbEspecieOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mago", "Guerrero", "Elfo" }));

        cbEspecieTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elfo", "Guerrero", "Mago" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Escoge sus niveles de vida:");

        cbVidaOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150", "200", "250", "300", "350", "400", "450" }));

        cbVidaTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150", "200", "250", "300", "350", "400", "450" }));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Escoge sus niveles de maná:");

        cbManaOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cbManaTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Selecciona sus niveles:");

        cbNivelTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cbNivelOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        btnCombatir.setText("A pelear!");
        btnCombatir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombatirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nombra a los combatientes:");

        txtDisplay.setBackground(new java.awt.Color(255, 255, 255));
        txtDisplay.setColumns(20);
        txtDisplay.setRows(5);
        txtDisplay.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDisplay.setEnabled(false);
        jScrollPane2.setViewportView(txtDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCombatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreOne, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbManaOne, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbManaTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNivelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbNivelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbVidaOne, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbVidaTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbEspecieOne, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbEspecieTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEspecieOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEspecieTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbVidaOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVidaTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbManaOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbManaTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNivelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNivelOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCombatir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirActionPerformed
        String nombreOne = txtNombreOne.getText();
        String nombreTwo = txtNombreTwo.getText();
        String combatienteOne = cbEspecieOne.getSelectedItem().toString();
        String combatienteTwo = cbEspecieTwo.getSelectedItem().toString();
        int vidaOne = Integer.parseInt(cbVidaOne.getSelectedItem().toString());
        int vidaTwo = Integer.parseInt(cbVidaTwo.getSelectedItem().toString());
        int manaOne = Integer.parseInt(cbManaOne.getSelectedItem().toString());
        int manaTwo = Integer.parseInt(cbManaTwo.getSelectedItem().toString());
        int levelOne = Integer.parseInt(cbNivelOne.getSelectedItem().toString());
        int levelTwo = Integer.parseInt(cbNivelTwo.getSelectedItem().toString());
        String LoQueSeImprime = "";
        
        switch (combatienteOne) {
            case "Mago" -> {
                Personaje magoOne = new MagoImp(nombreOne, vidaOne, manaOne, levelOne);
                switch (combatienteTwo) {
                    case "Mago" -> {
                        Personaje magoTwo = new MagoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (magoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (magoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n*******************************************************\n";
                        while(magoOne.estaVivo() && magoTwo.estaVivo()){
                            LoQueSeImprime += magoOne.atacar(magoTwo);
                            if (!magoTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago " + magoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += magoTwo.atacar(magoOne);
                            if (!magoOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago "+ magoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Guerrero" -> {
                        Personaje guerreroTwo = new GuerreroImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (magoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (guerreroTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n*******************************************************\n";

                        while(magoOne.estaVivo() && guerreroTwo.estaVivo()){
                            LoQueSeImprime += magoOne.atacar(guerreroTwo);
                            if (!guerreroTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago " + magoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += guerreroTwo.atacar(magoOne);
                            if (!magoOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el guerrero "+ guerreroTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Elfo" -> {
                        Personaje elfoTwo = new ElfoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (magoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (elfoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n*******************************************************\n";
                        
                        while(magoOne.estaVivo() && elfoTwo.estaVivo()){
                            LoQueSeImprime += magoOne.atacar(elfoTwo);
                            if (!elfoTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago " + magoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += elfoTwo.atacar(magoOne);
                            if (!magoOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el elfo "+ elfoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                        
                    }
                    default -> System.out.println("No furula combatiente 2");
                }
            }

            case "Elfo" -> {
                Personaje elfoOne = new ElfoImp(nombreOne, vidaOne, manaOne, levelOne);
                switch (combatienteTwo) {
                    case "Mago" -> {
                        Personaje magoTwo = new MagoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (elfoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (magoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n***************************************\n";

                        while(elfoOne.estaVivo() && magoTwo.estaVivo()){
                            LoQueSeImprime += elfoOne.atacar(magoTwo);
                            if (!magoTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el elfo " + elfoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += magoTwo.atacar(elfoOne);
                            if (!elfoOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago "+ magoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Guerrero" -> {
                        Personaje guerreroTwo = new GuerreroImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (elfoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (guerreroTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n***************************************\n";

                        while(elfoOne.estaVivo() && guerreroTwo.estaVivo()){
                            LoQueSeImprime += elfoOne.atacar(guerreroTwo);
                            if (!guerreroTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el elfo " + elfoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += guerreroTwo.atacar(elfoOne);
                            if (!elfoOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el guerrero "+ guerreroTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Elfo" -> {
                        Personaje elfoTwo = new ElfoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (elfoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (elfoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n***************************************\n";

                        while(elfoOne.estaVivo() && elfoTwo.estaVivo()){
                            LoQueSeImprime += elfoOne.atacar(elfoTwo);
                            if (!elfoTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el elfo " + elfoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += elfoTwo.atacar(elfoOne);
                            if (!elfoOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el elfo "+ elfoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    default -> System.out.println("No furula combatiente 2");
                }
            }

            case "Guerrero" -> {
                Personaje guerreroOne = new GuerreroImp(nombreOne, vidaOne, manaOne, levelOne);
                switch (combatienteTwo) {
                    case "Mago" -> {
                        Personaje magoTwo = new MagoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (guerreroOne.mostrarInformacion()+"\n");
                        LoQueSeImprime += (magoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n***************************************\n";

                        while(guerreroOne.estaVivo() && magoTwo.estaVivo()){
                            LoQueSeImprime += guerreroOne.atacar(magoTwo);
                            if (!magoTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el guerrero " + guerreroOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += magoTwo.atacar(guerreroOne);
                            if (!guerreroOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago "+ magoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Guerrero" -> {
                        Personaje guerreroTwo = new GuerreroImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime += (guerreroOne.mostrarInformacion()+"\n");
                        txtDisplay.setText(guerreroTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n***************************************\n";

                        while(guerreroOne.estaVivo() && guerreroTwo.estaVivo()){
                            LoQueSeImprime += guerreroOne.atacar(guerreroTwo);
                            if (!guerreroTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el guerrero " + guerreroOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += guerreroTwo.atacar(guerreroOne);
                            if (!guerreroOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el guerrero "+ guerreroTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Elfo" -> {
                        Personaje elfoTwo = new ElfoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        txtDisplay.setText(guerreroOne.mostrarInformacion()+"\n");
                        txtDisplay.setText(elfoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime += "\n***************************************\n";

                        while(guerreroOne.estaVivo() && elfoTwo.estaVivo()){
                            LoQueSeImprime += guerreroOne.atacar(elfoTwo);
                            if (!elfoTwo.estaVivo()) {
                                LoQueSeImprime += ("\n** el guerrero " + guerreroOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime += elfoTwo.atacar(guerreroOne);
                            if (!guerreroOne.estaVivo()) {
                                LoQueSeImprime += ("\n** el mago "+ elfoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    default -> System.out.println("No furula combatiente 2");
                }
            }
            default -> System.out.println("No furula la entrada al usuario uno");
        }
        
        txtDisplay.setText(LoQueSeImprime);
    }//GEN-LAST:event_btnCombatirActionPerformed

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
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCombatir;
    private javax.swing.JComboBox<String> cbEspecieOne;
    private javax.swing.JComboBox<String> cbEspecieTwo;
    private javax.swing.JComboBox<String> cbManaOne;
    private javax.swing.JComboBox<String> cbManaTwo;
    private javax.swing.JComboBox<String> cbNivelOne;
    private javax.swing.JComboBox<String> cbNivelTwo;
    private javax.swing.JComboBox<String> cbVidaOne;
    private javax.swing.JComboBox<String> cbVidaTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtDisplay;
    private javax.swing.JTextField txtNombreOne;
    private javax.swing.JTextField txtNombreTwo;
    // End of variables declaration//GEN-END:variables
}
