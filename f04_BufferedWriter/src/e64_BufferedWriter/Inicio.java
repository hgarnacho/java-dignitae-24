package e64_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Inicio {
    public static void main(String[] args) {
        // Definimos el nombre del archivo
        String nombreArchivo = "resources/archivo.txt";

        try {
            // Creamos un objeto FileWriter para escribir en el archivo
            FileWriter escritorArchivo = new FileWriter(nombreArchivo);

            // Creamos un objeto BufferedWriter para escribir en el archivo de manera eficiente
            BufferedWriter escritorBufferizado = new BufferedWriter(escritorArchivo);

            // Escribimos texto en el archivo
            escritorBufferizado.write("¡Hola, mundo!\n");
            escritorBufferizado.write("Este es un ejemplo de BufferedWriter en Java.\n");

            // Cerramos el BufferedWriter (automáticamente se cierra el FileWriter)
            escritorBufferizado.close();

            System.out.println("Se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
        