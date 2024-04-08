package e58_lecturaFicheroTextoScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        try {
            File archivo = new File("resources/ejemplo.txt");
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}