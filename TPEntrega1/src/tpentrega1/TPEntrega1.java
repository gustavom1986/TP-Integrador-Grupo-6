/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpentrega1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author grupo6
 */
public class TPEntrega1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        // Asignando variable a la ruta de acceso del archivo EQUIPOS.CSV
        String ubicacionArchivoEquipos = "C:\\Users\\Siscop\\Desktop\\TrabajoPracticoIntegrador\\TP-Integrador-Grupo-6\\equipos.csv";
        
        // Trayendo el archivo EQUIPOS.CSV a través del método PATH
        Path pathEquipos = Paths.get (ubicacionArchivoEquipos);
        
        // Leyendo cada línea del archivo EQUIPOS.CSV
        for (String equipo : Files.readAllLines(pathEquipos)){
            
            // Imprimiendo por consola cada línea de EQUIPOS.CSV a modo de prueba.
            System.out.println(equipo);
        }
    }

}
