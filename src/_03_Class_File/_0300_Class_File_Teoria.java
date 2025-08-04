package _03_Class_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_File_Teoria {

    // https://www.w3schools.com/java/java_files.asp
    // CONCEPTOS BASICOS CLASE File
    // CONCEPTOS BASICOS CLASE PrintWriter
    public static void main(String[] args) {
        // CREAR OBJETO DE LA CLASE File
        // La ruta origen se enuentra en la carpeta que contiene las carpetas "src" y "target" donde estamos creando el programa Java
        File f = new File("filename.txt"); // Specify the filename

        // METODOS CLASE File
        // canRead()            Boolean     Comprueba si el archivo se puede leer o no
        // canWrite()           Boolean     Comprueba si en el archivo se puede escribir o no
        // createNewFile()      Boolean     Crea un archivo vacio
        // delete()             Boolean     Borra el archivo
        // exists()             Boolean     Comprueba si el archivo existe
        // getName()            String      Devuelve el nombre del fichero (on la extension)
        // Utilizando split("\\.")[0] nos quedamos solo con la parte del nombe del archivo sin la extension
        File f_Nuevo = new File(f.getName().split("\\.")[0] + "_Nuevo.txt");
        // getAbsolutePath()    String      Devuelve la ruta absoluta del archivo
        // length()             Long        Devuelve el tamaño en bytes del archivo
        // list()               String[]    Devuelve un array de los archivos en el directorio
        // mkdir()              Boolean     Crea un directorio
        // getName()            String      Devuelve el nombre del fichero (on la extension)

        // CREAR OBJETO DE LA CLASE PrintWriter
        try {
            PrintWriter pw = new PrintWriter(f);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(_0300_Class_File_Teoria.class.getName()).log(Level.SEVERE, null, ex);
        }
        // METODOS CLASE PrintWriter
        // canRead()            Boolean     Comprueba si el archivo se puede leer o no
    }

}
