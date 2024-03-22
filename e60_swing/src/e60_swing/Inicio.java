package e60_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Inicio {

	public static void main(String[] args) {
        // Crear un nuevo frame (ventana)
        JFrame frame = new JFrame("Ejemplo de Swing");
        
        // Configurar el tamaño de la ventana
        frame.setSize(400, 300);
        
        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un nuevo botón
        JButton button = new JButton("Haz clic");
        
        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha pulsado el botón.");
            }
        });
        
        // Agregar el botón al panel de contenido de la ventana
        frame.getContentPane().add(button);
        
        // Mostrar la ventana
        frame.setVisible(true);

	}

}




