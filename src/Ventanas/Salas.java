/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import static Ventanas.MantenimientoUsuario.Satigualinea;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import proyecto.gym.ManejoArchivoSala;


/**
 *
 * @author Jhoan
 */
public class Salas extends javax.swing.JFrame {

    /**
     * Creates new form Salas
     */
    public Salas() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID_Sala = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ID_Localizacion_Sala = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Nombre_Sala = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion_Sala = new javax.swing.JTextArea();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(790, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 488));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento-web.png"))); // NOI18N
        jLabel1.setText("Salas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Descripción Sala");
        jLabel2.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 120, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ID Localización Sala");
        jLabel4.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 130, -1));

        ID_Sala.setBackground(new java.awt.Color(204, 204, 204));
        ID_Sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_SalaActionPerformed(evt);
            }
        });
        jPanel1.add(ID_Sala, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 220, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Comprobador");
        jLabel3.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 100, -1));

        Status.setBackground(new java.awt.Color(204, 204, 204));
        Status.setEnabled(false);
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 160, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Nombre Sala");
        jLabel5.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, -1));

        ID_Localizacion_Sala.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ID_Localizacion_Sala, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 450, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("ID Sala");
        jLabel6.setPreferredSize(new java.awt.Dimension(91, 17));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 60, -1));

        Nombre_Sala.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Nombre_Sala, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 440, 30));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 90, 30));

        Descripcion_Sala.setBackground(new java.awt.Color(204, 204, 204));
        Descripcion_Sala.setColumns(20);
        Descripcion_Sala.setRows(5);
        jScrollPane1.setViewportView(Descripcion_Sala);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 450, 100));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 80, 30));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String id_sala="";
        String nombre_sala="";
        String descripcion="";
        String id_localizacion_sala="";
        String Snuevalinea="";

        ManejoArchivoSala MAS=new ManejoArchivoSala();
        id_sala=ID_Sala.getText();
        nombre_sala=Nombre_Sala.getText();
        descripcion=Descripcion_Sala.getText();
        id_localizacion_sala=ID_Localizacion_Sala.getText();
        ;

        try {

            if (crear==false)
            {
                MAS.GuardarDatos (id_sala,nombre_sala,descripcion,id_localizacion_sala);
            }
            else
            {
                Snuevalinea=(id_sala + "; " + nombre_sala + "; " + descripcion + "; " + id_localizacion_sala);
                MAS.ModificaDatos(Satigualinea,Snuevalinea);
            }
            ID_Sala.setText("");
            Nombre_Sala.setText("");
            Descripcion_Sala.setText("");
            ID_Localizacion_Sala.setText("");
            Status.setText("");
            //Salida.setText("");
        } // fin try
        catch (IOException e1)
        {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void ID_SalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_SalaActionPerformed
        // TODO add your handling code here:
                 
        int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(ID_Sala.getText());

        Scanner s;

        try {
            File f=new File("C:archivoSala1.txt");
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
                            Nombre_Sala.setText(sl.next());
                            Descripcion_Sala.setText(sl.next());
                            ID_Localizacion_Sala.setText(sl.next());


                            encontrado=true;
                            crear = true;
                            Satigualinea=(ID_Sala.getText() + "; " +Nombre_Sala.getText()+ "; " +Descripcion_Sala.getText()+ "; " + ID_Localizacion_Sala.getText());
                            Status.setText("Modificando");
                        }
                        else
                        {  //Salida.setText("Este registro no existe");
                            Nombre_Sala.setText("");
                            Descripcion_Sala.setText("");
                            ID_Localizacion_Sala.setText("");

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
        
    }//GEN-LAST:event_ID_SalaActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        ID_Sala.setText("");
        Nombre_Sala.setText("");
        Descripcion_Sala.setText("");
        ID_Localizacion_Sala.setText("");
        Status.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Descripcion_Sala;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField ID_Localizacion_Sala;
    private javax.swing.JTextField ID_Sala;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nombre_Sala;
    private javax.swing.JTextField Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
