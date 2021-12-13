/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReservaActividades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jerem
 */
public class ManejoArchivoReservaActividades {
    public void GuardarDatos (String id_reserva_actividad,String fecha_reserva,String fecha_baja,
        String id_estado_reserva,String id_cliente,String id_actividad,String id_horario_reserva) throws IOException
    {
    
        try
        {
            FileWriter F1=new FileWriter("C:archivoReservaActividad1.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id_reserva_actividad + ";" + fecha_reserva + ";" + fecha_baja 
            + ";" + id_estado_reserva+ ";" + id_cliente + ";" + id_actividad + ";" + id_horario_reserva);
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
    
    public void ModificaDatos(String LineaAntigua, String LineaNueva, String id_reserva_actividad )
    {
        
        File fNuevo= new File("C:archivoReservaActividad2.txt");
        File fAntiguo= new File("C:archivoReservaActividad1.txt");
        
       boolean encontrado = false;
        String aCadena=LineaAntigua;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id_reserva_actividad); 
        

       
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
