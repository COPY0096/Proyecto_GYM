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
import proyecto.gym.ManejoArchivoEstadoReserva;


/**
 *
 * @author Jhoan
 */
public class EstadoReserva extends javax.swing.JFrame {

    /**
     * Creates new form EstadoReserva
     */
    public EstadoReserva() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ID_Estado_Reserva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Estado = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(790, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(1110, 488));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mantenimiento-web.png"))); // NOI18N
        jLabel1.setText("Estado Reserva");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("ID Estado Reserva");
        jLabel2.setMaximumSize(new java.awt.Dimension(95, 17));
        jLabel2.setMinimumSize(new java.awt.Dimension(95, 17));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 20));

        ID_Estado_Reserva.setBackground(new java.awt.Color(204, 204, 204));
        ID_Estado_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_Estado_ReservaActionPerformed(evt);
            }
        });
        jPanel1.add(ID_Estado_Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Estado");
        jLabel3.setMaximumSize(new java.awt.Dimension(95, 17));
        jLabel3.setMinimumSize(new java.awt.Dimension(95, 17));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 40, 20));

        Estado.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 410, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Comprobador");
        jLabel4.setMaximumSize(new java.awt.Dimension(95, 17));
        jLabel4.setMinimumSize(new java.awt.Dimension(95, 17));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 90, 20));

        Status.setBackground(new java.awt.Color(204, 204, 204));
        Status.setEnabled(false);
        jPanel1.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 180, -1));

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 80, 30));

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

    private void ID_Estado_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_Estado_ReservaActionPerformed
        // TODO add your handling code here:
        int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(ID_Estado_Reserva.getText());

        Scanner s;

        try {
            File f=new File("C:archivoEstadoReserva1.txt");
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
                            Estado.setText(sl.next());
                            

                            encontrado=true;
                            crear = true;
                            Satigualinea=(ID_Estado_Reserva.getText() + "; " +Estado.getText());
                            Status.setText("Modificando");
                        }
                        else
                        {  //Salida.setText("Este registro no existe");
                            Estado.setText("");  
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
    }//GEN-LAST:event_ID_Estado_ReservaActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        String id_estado_reserva="";
        String estado="";
        String Snuevalinea="";

        ManejoArchivoEstadoReserva MAER=new ManejoArchivoEstadoReserva();
        id_estado_reserva=ID_Estado_Reserva.getText();
        estado=Estado.getText();
        

        try {

            if (crear==false)
            {
                MAER.GuardarDatos (id_estado_reserva,estado);
            }
            else
            {
                Snuevalinea=(id_estado_reserva + "; " + estado);
                MAER.ModificaDatos(Satigualinea,Snuevalinea);
            }
            ID_Estado_Reserva.setText("");
            Estado.setText("");
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
        ID_Estado_Reserva.setText("");
        Estado.setText("");
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
            java.util.logging.Logger.getLogger(EstadoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadoReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstadoReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Estado;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField ID_Estado_Reserva;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
