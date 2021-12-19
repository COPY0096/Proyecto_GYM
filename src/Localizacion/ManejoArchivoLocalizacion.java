/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Localizacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jerem
 */
public class ManejoArchivoLocalizacion {
    public void GuardarDatos (String id_localizacion,String tipo) throws IOException
    {
    
        try
        {
            FileWriter F1=new FileWriter("c:archivoLocalizacion1.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id_localizacion +";"+ tipo);
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
    
    public void ModificaDatos(String LineaAntigua, String LineaNueva, String id_localizacion )
    {
        
        File fNuevo= new File("c:archivoLocalizacion2.txt");
        File fAntiguo= new File("c:archivoLocalizacion1.txt");
        
        boolean encontrado = false;
        String aCadena=LineaAntigua;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id_localizacion); 
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
    public DefaultTableModel listaUsuarios(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("ID Localizacion");
        cabeceras.addElement("Tipo");
        
        DefaultTableModel MTabla = new DefaultTableModel(cabeceras,0);
        
        try{
            FileReader fr = new FileReader("c:archivoLocalizacion1.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,";");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                MTabla.addRow(x);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
        return MTabla;
    }

}
