package proyecto.gym;

import java.io.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class MantenimientoUsuario extends javax.swing.JFrame {

   /* public JTextField Login_Usuario;*/
    /**
     * Creates new form MantenimientoUsuario
     */
    public MantenimientoUsuario() {
        initComponents();
       /* Login_Usuario= new JTextField();
        Login_Usuario.setBounds(150,20,100,30);
        jPanel1.add(Login_Usuario);*/
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pass_Usuario = new javax.swing.JTextField();
        jLabel_NivelAcceso = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nombre_Usuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Apeliidos_Usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Correo_Usuario = new javax.swing.JTextField();
        Login_Usuario = new javax.swing.JTextField();
        NivelAcceso_Usuario = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 110));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento-web.png"))); // NOI18N
        jLabel1.setText("Mantenimiento Cliente");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Login Usuario:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel_NivelAcceso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_NivelAcceso.setText("Nivel de acceso:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Apellidos:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Correo:");

        Login_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_UsuarioActionPerformed(evt);
            }
        });

        Status.setEnabled(false);

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel1)
                        .addGap(91, 91, 91)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel_NivelAcceso))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Correo_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(Login_Usuario)
                                    .addComponent(Pass_Usuario)
                                    .addComponent(Nombre_Usuario)
                                    .addComponent(Apeliidos_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(NivelAcceso_Usuario)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(302, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)))
                .addGap(40, 40, 40)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pass_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(NivelAcceso_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 33, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel_NivelAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Nombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Apeliidos_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Correo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(Limpiar)
                        .addGap(18, 18, 18)
                        .addComponent(Borrar)
                        .addGap(18, 18, 18)
                        .addComponent(Guardar)))
                .addGap(721, 721, 721))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Boolean crear = false;
   public static String Satigualinea="";
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Login_Usuario.setText("");
        Pass_Usuario.setText("");
        NivelAcceso_Usuario.setText("");
        Nombre_Usuario.setText("");
        Apeliidos_Usuario.setText("");
        Correo_Usuario.setText("");
        Status.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String login="";
        String pass="";
        String nivelacceso="";
        String nombre="";
        String apellidos="";
        String correo="";
        String Snuevalinea="";

        ManejoArchivoUsuario MAU=new ManejoArchivoUsuario();
        login=Login_Usuario.getText();
        pass=Pass_Usuario.getText();
        nivelacceso=NivelAcceso_Usuario.getText();
        nombre=Nombre_Usuario.getText();
        apellidos=Apeliidos_Usuario.getText();
        correo=Correo_Usuario.getText();

        try {

            if (crear==false)
            {
                MAU.GuardarDatos (login,pass,nivelacceso,nombre,apellidos,correo);
            }
            else
            {
                Snuevalinea=(login + "; " + pass + "; " + nivelacceso + "; " + nombre + "; " + apellidos + "; " + correo);
                MAU.ModificaDatos(Satigualinea,Snuevalinea);
            }
            Login_Usuario.setText("");
            Pass_Usuario.setText("");
            NivelAcceso_Usuario.setText("");
            Nombre_Usuario.setText("");
            Apeliidos_Usuario.setText("");
            Correo_Usuario.setText("");
            Status.setText("");
            //Salida.setText("");
        } // fin try
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void Login_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_UsuarioActionPerformed
        // TODO add your handling code here:
         
        int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(Login_Usuario.getText());

        Scanner s;

        try {
            File f=new File("C:archivo01.txt");
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
                            Pass_Usuario.setText(sl.next());
                            NivelAcceso_Usuario.setText(sl.next());
                            Nombre_Usuario.setText(sl.next());
                            Apeliidos_Usuario.setText(sl.next());
                            Correo_Usuario.setText(sl.next());

                            encontrado=true;
                            crear = true;
                            Satigualinea=(Login_Usuario.getText() + "; " +Pass_Usuario.getText()+ "; " +NivelAcceso_Usuario.getText()+ "; " + Nombre_Usuario.getText()+ "; " +Apeliidos_Usuario.getText()+ "; " + Correo_Usuario.getText());
                            Status.setText("Modificando");
                        }
                        else
                        {  //Salida.setText("Este registro no existe");
                            Pass_Usuario.setText("");
                            NivelAcceso_Usuario.setText("");
                            Nombre_Usuario.setText("");
                            Apeliidos_Usuario.setText("");
                            Correo_Usuario.setText("");
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
        

    }//GEN-LAST:event_Login_UsuarioActionPerformed

    
 


   
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
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoUsuario().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apeliidos_Usuario;
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Correo_Usuario;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Login_Usuario;
    private javax.swing.JTextField NivelAcceso_Usuario;
    private javax.swing.JTextField Nombre_Usuario;
    private javax.swing.JTextField Pass_Usuario;
    private javax.swing.JTextField Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_NivelAcceso;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

