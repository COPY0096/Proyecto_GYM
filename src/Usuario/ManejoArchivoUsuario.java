
package Usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManejoArchivoUsuario {
    public void GuardarDatos (String id_usuario,String contraseña,String nivel,String nombre,String apellido, String correo) throws IOException
    {
    
        try
        {
            FileWriter F1=new FileWriter("c:archivoUsuario1.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id_usuario +";"+ contraseña +";"+ nivel +";"+ nombre +";"+apellido +";"+ correo );
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
    
    public void ModificaDatos(String LineaAntigua, String LineaNueva,String id_usuario )
    {
        
        File fNuevo= new File("c:archivoUsuario2.txt");
        File fAntiguo= new File("c:archivoUsuario1.txt");
        
        boolean encontrado = false;
        String aCadena=LineaAntigua;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id_usuario); 
        

       
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
        cabeceras.addElement("Login");
        cabeceras.addElement("Password");
        cabeceras.addElement("Nivel Acceso");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Email");
        
        DefaultTableModel MTabla = new DefaultTableModel(cabeceras,0);
        
        try{
            FileReader fr = new FileReader("c:archivoUsuario1.txt");
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
