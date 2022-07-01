import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Clases.claseGato;

public class ProyectoManguito extends JPanel {

    public static void main(String[] args) throws IOException {
        JFrame ventana = new JFrame("El mundo de Manguito");

        // Interfaz objInterfaz = new Interfaz();
        // claseGato objGato = new claseGato();

        // ventana.add(objInterfaz);
        ventana.getContentPane().add(new claseGato());

        ventana.setSize(1200, 700);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().setBackground(new Color(0, 255, 204));
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
