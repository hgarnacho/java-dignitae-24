package e63_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Inicio {
    public static void main(String[] args) {
        // Definimos el nombre del archivo
        String nombreArchivo = "resources/archivo.txt";

        try {
            // Creamos un objeto FileWriter para escribir en el archivo
            FileWriter escritor = new FileWriter(nombreArchivo);

            // Escribimos texto en el archivo
            escritor.write("¡Hola, mundo!\n");
            escritor.write("Este es un ejemplo de FileWriter en Java.\n");

            // Cerramos el FileWriter
            escritor.close();

            System.out.println("Se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}