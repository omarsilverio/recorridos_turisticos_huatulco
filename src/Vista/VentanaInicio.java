package Vista;

import Controlador.ConeccionBDD;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

/**
 *
 * @author omarsilverio
 */
public class VentanaInicio extends javax.swing.JFrame {  
    
    private String usuario;
    private String contrasena;
    private ConeccionBDD conexion;
    public VentanaInicio(String usuario, String contrasena) {       
        this.usuario = usuario;
        this.contrasena = contrasena;        
        initComponents(); 
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogoCreditos = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaCreditos = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        dialogoAgregarHorario = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        btnAceptarCambios = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        dialogoConsultarHorario = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnAgregarReservacion = new javax.swing.JButton();
        btnConsultarReservaciones = new javax.swing.JButton();
        btnAgregarRecorrido = new javax.swing.JButton();
        btnConsultarRecorridos = new javax.swing.JButton();
        btnConsultarHorarios = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarHorario = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etiCreditos = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        selecInicio = new javax.swing.JMenu();
        selexConsultas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        dialogoCreditos.setModal(true);
        dialogoCreditos.setResizable(false);
        dialogoCreditos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dialogoCreditosWindowClosing(evt);
            }
        });

        areaCreditos.setColumns(20);
        areaCreditos.setRows(5);
        areaCreditos.setText("Programa creado por:\nAnaya Carreño Claudia\nLopez de la Rosa Mariam Daniela\nMendez Martinez Jennifer\nSilverio Ibañez Omar\n\nVersión: 1.0\nCreado para la empresa de recorridos\nturisticos Omega ubicada en Huatulco.");
        areaCreditos.setEnabled(false);
        jScrollPane1.setViewportView(areaCreditos);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogoCreditosLayout = new javax.swing.GroupLayout(dialogoCreditos.getContentPane());
        dialogoCreditos.getContentPane().setLayout(dialogoCreditosLayout);
        dialogoCreditosLayout.setHorizontalGroup(
            dialogoCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCreditosLayout.createSequentialGroup()
                .addGroup(dialogoCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoCreditosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoCreditosLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnAceptar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        dialogoCreditosLayout.setVerticalGroup(
            dialogoCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoCreditosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        dialogoAgregarHorario.setModal(true);

        btnAceptarCambios.setText("Aceptar");
        btnAceptarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCambiosActionPerformed(evt);
            }
        });
        jPanel3.add(btnAceptarCambios);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar);

        dialogoAgregarHorario.getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        dialogoConsultarHorario.setModal(true);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        dialogoConsultarHorario.getContentPane().add(jPanel4, java.awt.BorderLayout.SOUTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setExtendedState(6);

        panelBotones.setLayout(new java.awt.GridBagLayout());

        btnAgregarReservacion.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarReservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuaderno.png"))); // NOI18N
        btnAgregarReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarReservacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.ipady = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 787, 0, 0);
        panelBotones.add(btnAgregarReservacion, gridBagConstraints);

        btnConsultarReservaciones.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarReservaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reserva-en-linea.png"))); // NOI18N
        btnConsultarReservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarReservacionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 787, 0, 0);
        panelBotones.add(btnConsultarReservaciones, gridBagConstraints);

        btnAgregarRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarRecorrido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/distancia-a-recorrer-entre-dos-puntos.png"))); // NOI18N
        btnAgregarRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRecorridoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        panelBotones.add(btnAgregarRecorrido, gridBagConstraints);

        btnConsultarRecorridos.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarRecorridos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ruta.png"))); // NOI18N
        btnConsultarRecorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarRecorridosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 84;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        panelBotones.add(btnConsultarRecorridos, gridBagConstraints);

        btnConsultarHorarios.setBackground(new java.awt.Color(255, 255, 255));
        btnConsultarHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario.png"))); // NOI18N
        btnConsultarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHorariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 804);
        panelBotones.add(btnConsultarHorarios, gridBagConstraints);

        jLabel2.setText("Agendar una reservación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 825, 0, 0);
        panelBotones.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Agregar un nuevo recorrido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 52, 0, 0);
        panelBotones.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Agregar un horario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 74, 0, 0);
        panelBotones.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Consultar reservaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 838, 91, 0);
        panelBotones.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Consultar recorridos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 83, 91, 0);
        panelBotones.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Consultar horarios");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 85, 91, 0);
        panelBotones.add(jLabel7, gridBagConstraints);

        btnAgregarHorario.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj.png"))); // NOI18N
        btnAgregarHorario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHorarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 81;
        gridBagConstraints.ipady = 71;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 804);
        panelBotones.add(btnAgregarHorario, gridBagConstraints);

        getContentPane().add(panelBotones, java.awt.BorderLayout.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huatulco.jpeg"))); // NOI18N
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        etiCreditos.setText("Programa creado por: Anaya Claudia, Lopez de la Rosa Mariam, Mendez Martinez Jennifer, Silverio Ibañez Omar");
        jPanel2.add(etiCreditos);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        selecInicio.setText("Inicio");
        selecInicio.setEnabled(false);
        barraMenu.add(selecInicio);

        selexConsultas.setText("Consultas");
        selexConsultas.setEnabled(false);

        jMenuItem4.setText("Consultar Reservas");
        selexConsultas.add(jMenuItem4);

        jMenuItem5.setText("Consultar Recorridos");
        selexConsultas.add(jMenuItem5);

        barraMenu.add(selexConsultas);

        jMenu3.setText("Agregar");
        jMenu3.setEnabled(false);

        jMenuItem6.setText("Agendar una reservación");
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator1);

        jMenuItem7.setText("Agregar un recorrido");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Agregar un horario");
        jMenu3.add(jMenuItem8);

        barraMenu.add(jMenu3);

        jMenu5.setText("Salir");
        jMenu5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu5StateChanged(evt);
            }
        });
        barraMenu.add(jMenu5);

        jMenu4.setText("Acerca de");
        jMenu4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jMenu4StateChanged(evt);
            }
        });
        barraMenu.add(jMenu4);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu5StateChanged
        System.exit(0);
    }//GEN-LAST:event_jMenu5StateChanged

    private void jMenu4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jMenu4StateChanged
        this.setEnabled(false);
        dialogoCreditos.setSize(400,300);
        dialogoCreditos.setVisible(true);        
    }//GEN-LAST:event_jMenu4StateChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        this.setEnabled(true);
        dialogoCreditos.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void dialogoCreditosWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogoCreditosWindowClosing
        this.setEnabled(true);
        dialogoCreditos.setVisible(false);
    }//GEN-LAST:event_dialogoCreditosWindowClosing

    private void btnAgregarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHorarioActionPerformed
        FormularioAgregarHorario v = new FormularioAgregarHorario(usuario, contrasena);        
        v.iniciarVentana();
        
                
    }//GEN-LAST:event_btnAgregarHorarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHorariosActionPerformed
        horarios v = new horarios(usuario,contrasena);         
        v.iniciarVentana();
        
    }//GEN-LAST:event_btnConsultarHorariosActionPerformed

    private void btnAceptarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCambiosActionPerformed
        
    }//GEN-LAST:event_btnAceptarCambiosActionPerformed

    private void btnConsultarRecorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarRecorridosActionPerformed
      recorridos v = new recorridos(usuario,contrasena);
      v.iniciarVentana();
        
        
        
    }//GEN-LAST:event_btnConsultarRecorridosActionPerformed

    private void btnAgregarReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarReservacionActionPerformed
        cliente v = new cliente(usuario,contrasena);
        v.inicializarVentana();
    }//GEN-LAST:event_btnAgregarReservacionActionPerformed

    private void btnAgregarRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRecorridoActionPerformed
        AgregarRecorrido v = new AgregarRecorrido(usuario,contrasena);
        v.inicializarVentana();
    }//GEN-LAST:event_btnAgregarRecorridoActionPerformed

    private void btnConsultarReservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarReservacionesActionPerformed
        ConsultarReservcion v = new ConsultarReservcion(usuario, contrasena);
        v.iniciarVentana();
    }//GEN-LAST:event_btnConsultarReservacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public void iniciarVentana(String usuario,String contrasena){
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio(usuario,contrasena).setVisible(true);
            }
        });
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCreditos;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptarCambios;
    private javax.swing.JButton btnAgregarHorario;
    private javax.swing.JButton btnAgregarRecorrido;
    private javax.swing.JButton btnAgregarReservacion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarHorarios;
    private javax.swing.JButton btnConsultarRecorridos;
    private javax.swing.JButton btnConsultarReservaciones;
    private javax.swing.JDialog dialogoAgregarHorario;
    private javax.swing.JDialog dialogoConsultarHorario;
    private javax.swing.JDialog dialogoCreditos;
    private javax.swing.JLabel etiCreditos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JMenu selecInicio;
    private javax.swing.JMenu selexConsultas;
    // End of variables declaration//GEN-END:variables
}
