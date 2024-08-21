package joptionpane;

import javax.swing.JOptionPane;

public class TiposIcono {

    /**
     * @PARAM ARGS THE COMMAND LINE ARGUMENTS
     */

    public static void main(String[] args) {

        //TODO code application logic here
        //default title and icon

        JOptionPane.showMessageDialog(null, "INFORMACION", "MENSAJE DE INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "ADVERTENCIA", "MENSAJE DE ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "ERROR", "MENSAJE DE ERROR",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "SIN ICONO", "MENSAJE DE TEXTO PLANO",JOptionPane.PLAIN_MESSAGE);
    }
}
