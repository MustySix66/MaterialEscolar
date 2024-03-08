package IGU;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import logica.ElfoImp;
import logica.GuerreroImp;
import logica.MagoImp;
import logica.Personaje;

public class Grafica extends javax.swing.JFrame {

    private int indice = 0;

    public Grafica() {
        initComponents();
    }
// esto de abajo no se borra por nada del mundo, al hacerlo el editor GUI de netbeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbEspecieOne = new javax.swing.JComboBox<>();
        cbEspecieTwo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
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
        cbVidaOne = new javax.swing.JComboBox<>();
        cbInutil = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 23)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡Escoge tus combatientes!");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rival 1:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
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

        cbVidaTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150", "200", "250", "300", "350", "400", "450" }));
        cbVidaTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVidaTwoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Escoge sus niveles de maná:");

        cbManaOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        cbManaOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbManaOneActionPerformed(evt);
            }
        });

        cbManaTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Selecciona sus niveles:");

        cbNivelTwo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        cbNivelOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        btnCombatir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
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

        cbVidaOne.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "150", "200", "250", "300", "350", "400", "450" }));
        cbVidaOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVidaOneActionPerformed(evt);
            }
        });

        cbInutil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCombatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(cbNivelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbInutil, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbEspecieOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEspecieTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbInutil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbVidaTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbVidaOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbManaOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbManaTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNivelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNivelOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCombatir))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCombatirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombatirActionPerformed
        // Declaramos las variables necesarias para el programa.
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
        
        //Declaramos una lista donde asignaremos todo lo que se va a immprimir en la textArea
        ArrayList<String> LoQueSeImprime = new ArrayList<>();

        // Añadimos un timer que va relacionado a como se despliegan los mensajes en el txtArea
        // Se le asigna como parametro la distancia en segundos entre tics y un actionListener vacio
        Timer timer = new Timer(1000, cbInutil);

        // Generamos un bjeto action listener y le asignamos lo que debe de hacer.
        ActionListener actionListener = (ActionEvent e) -> {
            // Mostrar la siguiente linea en el TextArea
            if (LoQueSeImprime.isEmpty()) {
                timer.stop();
                return;
            }
            String linea = LoQueSeImprime.remove(0);
            txtDisplay.append(linea); // EN CASO DE NECESARIO, REMOVER o AGREGAR UN SALTO DE LINEA
        };

        // se reasigna un actionListener que es el necesario.
        // anteriormente no podia asignarse correctamente debido al orden de la asignacion de objeto y los parametros
        timer.addActionListener(actionListener);
        timer.start();
        
        // Escogemos entre las opciones de combate, añadimos los objetos necesarios y agregamos
        // los valores a imprimir en una lista.
        switch (combatienteOne) {
            case "Mago" -> {
                Personaje magoOne = new MagoImp(nombreOne, vidaOne, manaOne, levelOne);
                switch (combatienteTwo) {
                    case "Mago" -> {
                        Personaje magoTwo = new MagoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(magoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(magoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n*******************************************************\n");
                        while(magoOne.estaVivo() && magoTwo.estaVivo()){
                            
                            LoQueSeImprime.add(magoOne.atacar(magoTwo));
                            if (!magoTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago " + magoOne.getNombre() + " ha vencido!!");
                                break;
                            }
                            LoQueSeImprime.add(magoTwo.atacar(magoOne));
                            if (!magoOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago "+ magoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Guerrero" -> {
                        Personaje guerreroTwo = new GuerreroImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(magoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(guerreroTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n*******************************************************\n");

                        while(magoOne.estaVivo() && guerreroTwo.estaVivo()){
                            LoQueSeImprime.add(magoOne.atacar(guerreroTwo));
                            if (!guerreroTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago " + magoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(guerreroTwo.atacar(magoOne));
                            if (!magoOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el guerrero "+ guerreroTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Elfo" -> {
                        Personaje elfoTwo = new ElfoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(magoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(elfoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n*******************************************************\n");
                        
                        while(magoOne.estaVivo() && elfoTwo.estaVivo()){
                            LoQueSeImprime.add(magoOne.atacar(elfoTwo));
                            if (!elfoTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago " + magoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(elfoTwo.atacar(magoOne));
                            if (!magoOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el elfo "+ elfoTwo.getNombre() + " ha vencido!!");
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
                        LoQueSeImprime.add(elfoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(magoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n***************************************\n");

                        while(elfoOne.estaVivo() && magoTwo.estaVivo()){
                            LoQueSeImprime.add(elfoOne.atacar(magoTwo));
                            if (!magoTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el elfo " + elfoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(magoTwo.atacar(elfoOne));
                            if (!elfoOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago "+ magoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Guerrero" -> {
                        Personaje guerreroTwo = new GuerreroImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(elfoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(guerreroTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n***************************************\n");

                        while(elfoOne.estaVivo() && guerreroTwo.estaVivo()){
                            LoQueSeImprime.add(elfoOne.atacar(guerreroTwo));
                            if (!guerreroTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el elfo " + elfoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(guerreroTwo.atacar(elfoOne));
                            if (!elfoOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el guerrero "+ guerreroTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Elfo" -> {
                        Personaje elfoTwo = new ElfoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(elfoOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(elfoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n***************************************\n");

                        while(elfoOne.estaVivo() && elfoTwo.estaVivo()){
                            LoQueSeImprime.add(elfoOne.atacar(elfoTwo));
                            if (!elfoTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el elfo " + elfoOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(elfoTwo.atacar(elfoOne));
                            if (!elfoOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el elfo "+ elfoTwo.getNombre() + " ha vencido!!");
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
                        LoQueSeImprime.add(guerreroOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(magoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n***************************************\n");

                        while(guerreroOne.estaVivo() && magoTwo.estaVivo()){
                            LoQueSeImprime.add(guerreroOne.atacar(magoTwo));
                            if (!magoTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el guerrero " + guerreroOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(magoTwo.atacar(guerreroOne));
                            if (!guerreroOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago "+ magoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Guerrero" -> {
                        Personaje guerreroTwo = new GuerreroImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(guerreroOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(guerreroTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n***************************************\n");

                        while(guerreroOne.estaVivo() && guerreroTwo.estaVivo()){
                            LoQueSeImprime.add(guerreroOne.atacar(guerreroTwo));
                            if (!guerreroTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el guerrero " + guerreroOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(guerreroTwo.atacar(guerreroOne));
                            if (!guerreroOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el guerrero "+ guerreroTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    case "Elfo" -> {
                        Personaje elfoTwo = new ElfoImp(nombreTwo, vidaTwo, manaTwo, levelTwo);
                        LoQueSeImprime.add(guerreroOne.mostrarInformacion()+"\n");
                        LoQueSeImprime.add(elfoTwo.mostrarInformacion()+"\n");
                        LoQueSeImprime.add("\n***************************************\n");

                        while(guerreroOne.estaVivo() && elfoTwo.estaVivo()){
                            LoQueSeImprime.add(guerreroOne.atacar(elfoTwo));
                            if (!elfoTwo.estaVivo()) {
                                LoQueSeImprime.add("\n** el guerrero " + guerreroOne.getNombre() + " ha vencido!!");
                                break;
                            }

                            LoQueSeImprime.add(elfoTwo.atacar(guerreroOne));
                            if (!guerreroOne.estaVivo()) {
                                LoQueSeImprime.add("\n** el mago "+ elfoTwo.getNombre() + " ha vencido!!");
                                break;
                            }
                        }
                    }
                    default -> System.out.println("No furula combatiente 2");
                }
            }
            default -> System.out.println("No furula la entrada al usuario uno");
        }
    }//GEN-LAST:event_btnCombatirActionPerformed

    private void cbManaOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbManaOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbManaOneActionPerformed

    private void cbVidaTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVidaTwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVidaTwoActionPerformed

    private void cbVidaOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVidaOneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbVidaOneActionPerformed

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
    private javax.swing.JComboBox<String> cbInutil;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtDisplay;
    private javax.swing.JTextField txtNombreOne;
    private javax.swing.JTextField txtNombreTwo;
    // End of variables declaration//GEN-END:variables
}
