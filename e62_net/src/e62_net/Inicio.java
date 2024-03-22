package e62_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;

public class Inicio {
    public static void main(String[] args) {
        try {            
            String urlString = "https://www.google.com";
            URI uri = new URI(urlString);
            URL url = uri.toURL();		
            		
            // Abrir la conexión
            URLConnection conexion = url.openConnection();
            
            // Crear un lector para leer el contenido de la URL
            BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
            
            // Leer el contenido línea por línea e imprimirlo en la consola
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            
            // Cerrar el lector
            lector.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}