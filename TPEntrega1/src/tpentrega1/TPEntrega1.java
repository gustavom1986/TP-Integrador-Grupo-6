/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpentrega1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
        String ubicacionArchivoEquipos = "C:\\tpintegradorgrupo6\\equipos.csv";

        // Trayendo el archivo EQUIPOS.CSV a través del método PATH
        Path pathEquipos = Paths.get(ubicacionArchivoEquipos);

        // Creando lista de equipos
        List<Equipos> listaEquipos = new ArrayList<>();
        // Leyendo cada línea del archivo EQUIPOS.CSV e instanciando objetos Equipos
        for (String equipo : Files.readAllLines(pathEquipos)) {
            Equipos equipos = new Equipos(equipo);
            listaEquipos.add(equipos);
        }
        //Asigno variables y rutas de acceso a resultados.csv y pronosticos.csv
        String ruta2 = "C:\\tpintegradorgrupo6\\resultados.csv";
        String ruta3 = "C:\\tpintegradorgrupo6\\pronosticos.csv";
        Path archivo2 = Paths.get(ruta2);
        Path archivo3 = Paths.get(ruta3);

//Creando lista de partidos
        List<Partidos> listaPartidos = new ArrayList<>();
        //Leyendo el archivo resultados.csv desde la segunda linea, instanciando Partidos, determina resultado
        for (String linea2 : Files.readAllLines(archivo2).subList(1, Files.readAllLines(archivo2).size())) {
            String[] split = linea2.split(";");
            Partidos partido = new Partidos(split[0], split[1], split[4], Integer.parseInt(split[2]), Integer.parseInt(split[3]));
            listaPartidos.add(partido);
        }
//Creando lista de pronósticos 
        List<Pronosticos> listaPronosticos = new ArrayList<>();
        //Leyendo el archivo pronosticos.csv desde la segunda linea, instanciando Pronosticos, determina resultado
        for (String linea3 : Files.readAllLines(archivo3).subList(1, Files.readAllLines(archivo3).size())) {
            String[] split = linea3.split(";");
            if ("true".equals(split[2])) {
                Pronosticos pronostico = new Pronosticos(split[0], Resultados.ResultadosEnum.GANA_EQUIPO_1);
                listaPronosticos.add(pronostico);
            } else if ("true".equals(split[3])) {
                Pronosticos pronostico = new Pronosticos(split[0], Resultados.ResultadosEnum.EMPATE);
                listaPronosticos.add(pronostico);
            } else if ("true".equals(split[4])) {
                Pronosticos pronostico = new Pronosticos(split[0], Resultados.ResultadosEnum.GANA_EQUIPO_2);
                listaPronosticos.add(pronostico);
            }
        }
// Compara los objetos "pronosticos" con los objetos "partidos" y si el codigo es el mismo calcula el puntaje para dicho pronostico
        for (Pronosticos iterar1 : listaPronosticos) {
            for (Partidos iterar2 : listaPartidos) {
                if (iterar1.getCodigo().equals(iterar2.getCodigo())) {
                    iterar1.calculaPuntosPronostico(iterar1.getResultado(), iterar2.getResultado());
                } else {
                }
            }
        }

        //Suma los puntos obtenidos en cada pronostico y los imprime en pantalla
        int puntajetotal = 0;
        for (Pronosticos iterar1 : listaPronosticos) {
            puntajetotal = puntajetotal + iterar1.getPuntos();
        }
        System.out.println("El puntaje total obtenido es " + puntajetotal);

    }
}
