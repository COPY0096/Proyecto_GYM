/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gym;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class ManejoArchivoEntrenador {
    
    public void GuardarDatos (String id_Entrenador,String nombre,String apellido,String telef, String correo) throws IOException
    {
    
        try
        {
            FileWriter F1=new FileWriter("c:archivo01Entrenador.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id_Entrenador +";"+ nombre +";"+apellido +";"+telef +";"+ correo );
            pw.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar archivo"+ ex);
        }
        
    } //Fin metodo guardarDatos
    
    void Escribir(File fFichero, String cadena)
    {
        BufferedWriter bw;
        
        try
        {
            if(!fFichero.exists())
            {
                fFichero.createNewFile();
            }
                bw=new BufferedWriter(new FileWriter(fFichero, true));
                bw.write(cadena+"\r\n");
                bw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al procesar."+ e);
        }
    }
    
    public void ModificaDatos(String LineaAntigua, String LineaNueva )
    {
        
        File fNuevo= new File("c:archivo02Entrenador.txt");
        File fAntiguo= new File("c:archivo01Entrenador.txt");
        
        String aCadena=LineaAntigua;
        String nCadena=LineaNueva;
        
        
// Declaro un nuevo buffer de lectura
//BufferedReader br;
    BufferedReader br;
    try
    {
        if(fAntiguo.exists())
        {
        br = new BufferedReader(new FileReader(fAntiguo));
        String linea;
        
            while ((linea=br.readLine()) !=null) {
                
                
                if(linea.equals(aCadena))
                {
                    Escribir(fNuevo,nCadena);
                }
                else
                {
                    Escribir(fNuevo,linea);
                }
            } // fin while
// Cierro el buffer de lectura
        br.close();
// Capturo el nombre del fichero antiguo
        String nAntiguo = fAntiguo.getName();
// Borro el fichero antiguo
        borrar(fAntiguo);
//Renombro el fichero auxiliar con el nombre del fichero antiguo
        fNuevo.renameTo(fAntiguo);
    }
    else
    {
        System.out.println("Fichero no Existe");
    }
}catch(Exception e)
{
    System.out.println(e);
}
    } //Fin metodo modifica datos
    
    
    
    public void borrar (File Ffichero)
    {
        try
        {
// Comprovamos si el fichero existe de ser así procedemos a borrar el archivo
            if(Ffichero.exists())
            {
                Ffichero.delete();
                JOptionPane.showMessageDialog(null,"Ficherro Borrado.");
            }
        }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error al Borrar." + e);
    }

    } // fin metodo borrar
    
    public void Delay(long milis)
    {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // fin metodo delay
    
}
