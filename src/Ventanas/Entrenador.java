/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import proyecto.gym.ManejoArchivoEntrenador;


/**
 *
 * @author Jhoan
 */
public class Entrenador extends javax.swing.JFrame {

    /**
     * Creates new form Entrenador
     */
    public Entrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Boolean crear = false;
   public static String Satigualinea="";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Correo_entrenador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ID_entrenador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nombre_entrenador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Apellido_entrenador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Telefono_entrenador = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(790, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 488));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento-web.png"))); // NOI18N
        jLabel1.setText("Entrenador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        Status.setBackground(new java.awt.Color(204, 204, 204));
        Status.setEnabled(false);
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 160, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Correo");
        jLabel3.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 60, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Comprobador");
        jLabel4.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 100, -1));

        Correo_entrenador.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Correo_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 260, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ID Entrenador");
        jLabel5.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 20));

        ID_entrenador.setBackground(new java.awt.Color(204, 204, 204));
        ID_entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_entrenadorActionPerformed(evt);
            }
        });
        jPanel1.add(ID_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 220, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Nombre ");
        jLabel6.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 60, 20));

        Nombre_entrenador.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Nombre_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 220, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Apellido");
        jLabel7.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 60, 20));

        Apellido_entrenador.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Apellido_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 220, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Telefono");
        jLabel8.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 60, 20));

        Telefono_entrenador.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Telefono_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 220, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 90, 30));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_CerrarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String id_Entrenador="";
        String nombre="";
        String telef="";
        String apellidos="";
        String correo="";
        String Snuevalinea="";

        ManejoArchivoEntrenador MAE=new ManejoArchivoEntrenador();
        id_Entrenador=ID_entrenador.getText();
        nombre=Nombre_entrenador.getText();
        apellidos=Apellido_entrenador.getText();
        telef=Telefono_entrenador.getText();
        correo=Correo_entrenador.getText();

        try {

            if (crear==false)
            {
                MAE.GuardarDatos (id_Entrenador,nombre,apellidos,telef,correo);
            }
            else
            {
                Snuevalinea=(id_Entrenador + "; " + nombre + "; " + apellidos + "; " + telef + "; " + correo);
                MAE.ModificaDatos(Satigualinea,Snuevalinea, id_Entrenador);
            }
            ID_entrenador.setText("");
            Nombre_entrenador.setText("");
            Apellido_entrenador.setText("");
            Telefono_entrenador.setText("");
            Correo_entrenador.setText("");
            Status.setText("");
            //Salida.setText("");
        } // fin try
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        ID_entrenador.setText("");
        Nombre_entrenador.setText("");
        Apellido_entrenador.setText("");
        Telefono_entrenador.setText("");
        Correo_entrenador.setText("");
        Status.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void ID_entrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_entrenadorActionPerformed
        // TODO add your handling code here:
        int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(ID_entrenador.getText());

        Scanner s;

        try {
            File f=new File("C:archivo01Entrenador.txt");
            s = new Scanner(f);
            if(!f.exists())
            {
                f.createNewFile();
            }
            else
            {
                while (s.hasNextLine() && !encontrado)
                {
                    String linea = s.nextLine();

                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    try {
                        if(cod==Integer.parseInt(sl.next()))
                        {
                            Nombre_entrenador.setText(sl.next());
                            Apellido_entrenador.setText(sl.next());
                            Telefono_entrenador.setText(sl.next());
                            Correo_entrenador.setText(sl.next());

                            encontrado=true;
                            crear = true;
                            Satigualinea=(ID_entrenador.getText() + "; " +Nombre_entrenador.getText()+ "; " +Apellido_entrenador.getText()+ "; " + Telefono_entrenador.getText()+ "; " +Correo_entrenador.getText());
                            Status.setText("Modificando");
                        }
                        else
                        {  //Salida.setText("Este registro no existe");
                            Nombre_entrenador.setText("");
                            Apellido_entrenador.setText("");
                            Telefono_entrenador.setText("");
                            Correo_entrenador.setText("");
                            encontrado=false;
                            crear = false;
                            Status.setText("Creando");
                        }
                    } // fin try
                    catch (Exception  e1)
                    {
                       // JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                } // fin while
            }

            s.close();
        } // fin try
        catch (FileNotFoundException e1)

        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
            //e1.printStackTrace();
        }
        catch (IOException e1)
        {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }//GEN-LAST:event_ID_entrenadorActionPerformed

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
            java.util.logging.Logger.getLogger(Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido_entrenador;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField Correo_entrenador;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField ID_entrenador;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nombre_entrenador;
    private javax.swing.JTextField Status;
    private javax.swing.JTextField Telefono_entrenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
