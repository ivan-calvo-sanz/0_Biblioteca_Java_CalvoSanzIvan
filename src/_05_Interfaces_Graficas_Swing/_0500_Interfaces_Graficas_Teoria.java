package _05_Interfaces_Graficas_Swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0500_Interfaces_Graficas_Teoria {

    // pagina web info
    // CONCEPTOS BASICOS INTERFACES GRAFICAS
    public static void main(String[] args) {

        // CREAR UNA VENTANA CON UN PANEL
        JFrame ventana = new JFrame("Programa Contabilidad");
        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        ventana.add(panel);

        ventana.setSize(400, 700);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        

    }

}
