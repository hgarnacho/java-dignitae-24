package e59_lecturaFicheroTextoBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inicio {
    public static void main(String[] args) {
        // Nombre del archivo que deseas leer
        String nombreArchivo = "resources/ejemplo.txt";

        try {
            // Crear un objeto FileReader
            FileReader fileReader = new FileReader(nombreArchivo);

            // Crear un objeto BufferedReader para leer líneas de texto
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leer líneas del archivo hasta que lleguemos al final
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea); // Imprimir cada línea leída
            }

            // Cerrar el BufferedReader después de su uso
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}