
package proyecto.gym;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


public class ManejoArchivoUsuario {
    public String GuardarDatos (String id_usuario,String contraseña,String nivel,String nombre,String apellido, String correo) throws
            IOException
    {
        String Mensaje1 = null;
        File F1= new File("c:archivoUsuario.txt");
        BufferedWriter escribir = null;
        escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(F1,true), "utf-8"));
        try
        {
            if (!F1.exists())
            {
                F1.createNewFile();
            }
            escribir.write(id_usuario + ";" + contraseña + ";" + nivel + ";" + nombre + ";" + apellido + ";" + correo + "\n");
            escribir.close();
        } catch (Exception ex) {
            Mensaje1=("Error al grabar Archivo " + ex);
        }
        return (Mensaje1) ;
    } //Fin metodo guardarDatos
    
    public ArrayList LeerDatos(String id_usuario) throws FileNotFoundException,
            UnsupportedEncodingException, IOException
    {
        boolean encontrado=false;
        int cod=Integer.parseInt(id_usuario);
        ArrayList<String> ArrayListArchivo = new ArrayList<String>();
        File F1 = new File("e:archivoUsuario.txt");
        try {
            if(!F1.exists())
            {
                F1.createNewFile();
            }
            try (Scanner s = new Scanner(F1)) {
                while (s.hasNextLine() && !encontrado) {
                    String linea = s.nextLine();
                    Scanner sl = new Scanner(linea);
                    sl.useDelimiter("\\s*;\\s*");
                    int codigoArc = Integer.parseInt(sl.next());
                    if(cod==codigoArc)
                    {
                        encontrado=true;
                        String contraseña=sl.next();
                        String nivel=sl.next();
                        String nombre=sl.next();
                        String apellido=sl.next();
                        String correo=sl.next();
                        ArrayListArchivo.add("1");
                        ArrayListArchivo.add(contraseña);
                        ArrayListArchivo.add(nivel);
                        ArrayListArchivo.add(nombre);
                        ArrayListArchivo.add(apellido);
                        ArrayListArchivo.add(correo);
                    }
                    /*else
                    ArrayListArchivo.add("0");*/
                }
                // fin while
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Error al leer Archivo " + e1);

        }
        return(ArrayListArchivo);
    } // Fin metodo LeerDatos
    
    public void ModificaDatos(String id_usuario, String contraseña, String nivel, String nombre, String apellido, String correo)
    {
        boolean encontrado=false;
        File fNuevo= new File("e:archivoUsuario1.txt");
        File fAntiguo= new File("e:archivoUsuario.txt");
        String aCadena=(id_usuario + ";" + contraseña + ";" +nivel + ";" + nombre +";"+apellido +";" + correo);
        String nCadena=(id_usuario + ";" + contraseña + ";" +nivel + ";" + nombre +";"+apellido +";" + correo);
        int cod=Integer.parseInt(id_usuario);
// Declaro un nuevo buffer de lectura
//BufferedReader br;
    try
    {
        if(fAntiguo.exists())
        {
// br = new BufferedReader(new FileReader(fAntiguo));
        String linea;
        try (Scanner s = new Scanner(fAntiguo)) {
            while (s.hasNextLine()) {
                linea = s.nextLine();
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
// Cierro el buffer de lectura
        }
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
    
    public void Escribir(File fFichero,String cadena)
    {
// Declaramos un buffer de escritura
        BufferedWriter bw;
        try
        {
// Comprobamos si el archivo no existe y si es asi creamos uno nuevo.
            if(!fFichero.exists())
            {
                fFichero.createNewFile();
            }
// Luego de haber creado el archivo procedemos a escribir dentro de el.
bw = new BufferedWriter(new FileWriter(fFichero,true));
bw.write(cadena+"\r\n");
bw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    } // fin metedo escribir archivo
    
    public void borrar (File Ffichero)
    {
        try
    {
// Comprovamos si el fichero existe de ser así procedemos a borrar el archivo
        if(Ffichero.exists())
        {
            Ffichero.delete();
            System.out.println("Ficherro Borrado");
        }
    }catch(Exception e)
    {
        System.out.println(e);
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
