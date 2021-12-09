/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import proyecto.gym.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_MUsuario = new javax.swing.JMenuItem();
        MEntrenador = new javax.swing.JMenuItem();
        MLocalizacion = new javax.swing.JMenuItem();
        MSalas = new javax.swing.JMenuItem();
        jMenuItem_MActividades = new javax.swing.JMenuItem();
        jMenuItem_MHorarioActividades = new javax.swing.JMenuItem();
        jMenuItem_MClientes = new javax.swing.JMenuItem();
        jMenuItem_MEstadoReservas = new javax.swing.JMenuItem();
        jMenuItem_MReservas = new javax.swing.JMenuItem();
        jMenuItem_MReversaActividades = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Bienvenida.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 640));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo de Bienvenida.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, -1, 40, 640));

        jMenu1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento-web.png"))); // NOI18N
        jMenu1.setText("Mantenimientos");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jMenuItem_MUsuario.setText("De Usuario");
        jMenuItem_MUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_MUsuario);

        MEntrenador.setText("De Entrenador");
        MEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEntrenadorActionPerformed(evt);
            }
        });
        jMenu1.add(MEntrenador);

        MLocalizacion.setText("De Localizacion");
        MLocalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLocalizacionActionPerformed(evt);
            }
        });
        jMenu1.add(MLocalizacion);

        MSalas.setText("De Salas");
        MSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSalasActionPerformed(evt);
            }
        });
        jMenu1.add(MSalas);

        jMenuItem_MActividades.setText("De Actividades");
        jMenuItem_MActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MActividadesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_MActividades);

        jMenuItem_MHorarioActividades.setText("De Horarios Actividades");
        jMenu1.add(jMenuItem_MHorarioActividades);

        jMenuItem_MClientes.setText("Clientes");
        jMenuItem_MClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MClientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_MClientes);

        jMenuItem_MEstadoReservas.setText("Estado Reservas");
        jMenuItem_MEstadoReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_MEstadoReservasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_MEstadoReservas);

        jMenuItem_MReservas.setText("De Reservas");
        jMenu1.add(jMenuItem_MReservas);

        jMenuItem_MReversaActividades.setText("Reversa Actividades");
        jMenu1.add(jMenuItem_MReversaActividades);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuota.png"))); // NOI18N
        jMenu2.setText("Movimientos");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jMenuItem11.setText("Cuota");
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/procesamiento-por-lotes.png"))); // NOI18N
        jMenu3.setText("Procesos");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jMenuItem12.setText("Generar Cobro");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Reversar Cobro");
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Actualiza Cuota");
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        jMenu5.setText("Consultas");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jMenuItem15.setText("De Usuario");
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("De Entrenador");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("De Localización");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setText("De Salas");
        jMenu5.add(jMenuItem18);

        jMenuItem19.setText("De Actividades");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("De Horarios Actividades");
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("De Cobro por Rango de Fecha");
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("De Cobro por Cliente");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("De Cuota por Fecha");
        jMenu5.add(jMenuItem23);

        jMenuItem24.setText("De Cuota por Clientes");
        jMenu5.add(jMenuItem24);

        jMenuItem25.setText("De Clientes");
        jMenu5.add(jMenuItem25);

        jMenuItem26.setText("De Clientes con Balance pendiente");
        jMenu5.add(jMenuItem26);

        jMenuBar1.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jMenu4.setText("Cerrar sesion");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenu4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenu4MouseReleased(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem_MUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MUsuarioActionPerformed
        // TODO add your handling code here:
        new MantenimientoUsuario().setVisible(true);
    }//GEN-LAST:event_jMenuItem_MUsuarioActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed

    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseExited

    }//GEN-LAST:event_jMenu4MouseExited

    private void jMenu4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseReleased

    }//GEN-LAST:event_jMenu4MouseReleased

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
        // TODO add your handling code here:
        setVisible(false);
        new InicioSesion().setVisible(true);
    }//GEN-LAST:event_jMenu4MousePressed

    private void MLocalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLocalizacionActionPerformed
        // TODO add your handling code here:
        new Localizacion().setVisible(true);
    }//GEN-LAST:event_MLocalizacionActionPerformed

    private void MSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSalasActionPerformed
        // TODO add your handling code here:
        new Salas().setVisible(true);
    }//GEN-LAST:event_MSalasActionPerformed

    private void jMenuItem_MActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MActividadesActionPerformed
        // TODO add your handling code here:
        new Actividades().setVisible(true);
    }//GEN-LAST:event_jMenuItem_MActividadesActionPerformed

    private void MEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEntrenadorActionPerformed
        // TODO add your handling code here:
        new Entrenador().setVisible(true);
    }//GEN-LAST:event_MEntrenadorActionPerformed

    private void jMenuItem_MEstadoReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MEstadoReservasActionPerformed
        // TODO add your handling code here:
        new EstadoReserva().setVisible(true);
    }//GEN-LAST:event_jMenuItem_MEstadoReservasActionPerformed

    private void jMenuItem_MClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_MClientesActionPerformed
        // TODO add your handling code here:
        new Cliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem_MClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MEntrenador;
    private javax.swing.JMenuItem MLocalizacion;
    private javax.swing.JMenuItem MSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem_MActividades;
    private javax.swing.JMenuItem jMenuItem_MClientes;
    private javax.swing.JMenuItem jMenuItem_MEstadoReservas;
    private javax.swing.JMenuItem jMenuItem_MHorarioActividades;
    private javax.swing.JMenuItem jMenuItem_MReservas;
    private javax.swing.JMenuItem jMenuItem_MReversaActividades;
    private javax.swing.JMenuItem jMenuItem_MUsuario;
    // End of variables declaration//GEN-END:variables
}
