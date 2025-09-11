package _20_Interfaces_Graficas_Swing;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _2001_Interfaces_Graficas_Funciones {

    public static void main(String[] args) {

    }

    // FUNCIONES Interfaces Graficas
    // 01-Codigo Boton, mostrar un mensaje en un nuevo Panel
    // 02-Codigo Boton, mostrar un mensaje en un nuevo Panel con Simbolo de Warning
    // 03-Codigo Boton, cerrar programa
    // 04-Codigo Boton, desactivar un boton
    // 05-Codigo Boton, cambiar color fondo boton
    // 06-Codigo Boton, seleccionar texto de un JTextField y ponerlo en un jLabel
    // 07-Codigo Boton, eliminar texto de un JTextField y de un jLabel
    // 
    // 
    /**
     * 01-Codigo Boton, mostrar un mensaje en un nuevo Panel
     */
    private void jButton_saludarActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Saludos a todos");
    }

    /**
     * 02-Codigo Boton, mostrar un mensaje en un nuevo Panel con Simbolo de
     * Warning
     */
    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Se borrarán todos los archivos", "Alerta", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * 03-Codigo Boton, cerrar programa
     */
    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Seguo que deseas cerar el sisyema?");
        System.exit(0);
    }

    /**
     * 04-Codigo Boton, desactivar un boton
     */
    private void jButton_desactivarActionPerformed(java.awt.event.ActionEvent evt) {
        jButton_desactivar.setText("desactivado");
        jButton_desactivar.setEnabled(false);
    }

    /**
     * 05-Codigo Boton, cambiar color fondo boton
     */
    private void jButton_amarilloActionPerformed(java.awt.event.ActionEvent evt) {
        jButton_amarillo.setBackground(Color.YELLOW);
    }

    /**
     * 06-Codigo Boton, seleccionar texto de un JTextField y ponerlo en un
     * jLabel
     */
    private void jButton_mostrarActionPerformed(java.awt.event.ActionEvent evt) {
        String nombe = jTextField_nombre.getText();
        jLabel_nombre.setText(nombe);
    }

    /**
     * 07-Codigo Boton, eliminar texto de un JTextField y de un jLabel
     */
    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {
        jTextField_nombre.setText("");
        jLabel_nombre.setText("");
    }

}
