package e61_awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RectanguloRojo extends Frame {
    
    public RectanguloRojo() {
        setTitle("Rectángulo Rojo");
        setSize(300, 200);
        setVisible(true);
        
        // Manejador para cerrar la ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Liberar recursos al cerrar la ventana
            }
        });
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 100); // Dibujar un rectángulo rojo en las coordenadas (50,50) con ancho 200 y altura 100
    }

}