/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class ManejoArchivoCliente {
    public void GuardarDatos (String id_cliente,String nombre_cliente
    ,String apellido_p,String apellido_m,String direccion,String celular,String telefono
    ,String fecha_n,String fecha_ingreso,String status_c,String tipo_c,String correo
    ,String balance,String valor_cuota) throws IOException
    {
    
        try
        {
            FileWriter F1=new FileWriter("C:archivoCliente1.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id_cliente +";"+ nombre_cliente +";"+ apellido_p +";"+ apellido_m 
            +";"+direccion +";"+ celular+";"+ telefono+";"+ fecha_n+";"+ fecha_ingreso
            +";"+ status_c+";"+ tipo_c+";"+ correo+";"+ balance+";"+ valor_cuota);
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
    
    public void ModificaDatos(String LineaAntigua, String LineaNueva, String id_cliente )
    {
        
        File fNuevo= new File("C:archivoCliente2.txt");
        File fAntiguo= new File("C:archivoCliente1.txt");
        
       boolean encontrado = false;
        String aCadena=LineaAntigua;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id_cliente); 
        

       
    try
    {
        
        if(fAntiguo.exists())
        {
        Scanner s = new Scanner(fAntiguo);
        
      //  br = new BufferedReader(new FileReader(fAntiguo));
      
        String linea;
        
            while (s.hasNextLine()) {
                
                linea=s.nextLine();
                Scanner sl = new Scanner(linea);
                 sl.useDelimiter("\\s*;\\s*"); 
                int codigoArc = Integer.parseInt(sl.next()); 
             if(cod==codigoArc) 
             { 
            Escribir(fNuevo,nCadena); 
                } 
                else 
                   { 
                     Escribir(fNuevo,linea); 
                   }
            } // fin while

             s.close(); 
             
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
                //JOptionPane.showMessageDialog(null,"Ficherro Borrado.");
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
