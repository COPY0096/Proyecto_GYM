/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class Seguridad {
    
    public void ValidarUsuario(String Usuarios[], String user, String pwd){
        boolean encontrado=false;
        
        for(int i = 0; i < Usuarios.length; i++ ){
            String [] word = Usuarios[i].split(";");
            if(word[0].equals(user) && word[1].equals(pwd)){
                encontrado=true;
                InicioSesion IS =new InicioSesion();
                JOptionPane.showMessageDialog(null, "Bienvenido", "Inicio de sesion.", JOptionPane.INFORMATION_MESSAGE);
                
                if(word[2].equals("0")){
                    IS.setVisible(false);
                    new MenuPrincipal().setVisible(true);
                }else{
                   IS.setVisible(false);
                    //new MenuPrincipal().setVisible(true);
                }
            }
        }
        if(encontrado==false){
            JOptionPane.showMessageDialog(null, "Clave y/o Usuarios erroneos.", "Inicio de sesion.", JOptionPane.ERROR_MESSAGE);
        } 
    }
}
