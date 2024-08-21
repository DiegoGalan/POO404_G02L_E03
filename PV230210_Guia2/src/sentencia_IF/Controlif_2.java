package sentencia_IF;

import javax.swing.*;

public class Controlif_2 {

    public static void main(String[] args) {

        String v1 = "";

        v1 = JOptionPane.showInputDialog("INGRESE SU VALOR");

        if (v1 == null) {
            JOptionPane.showMessageDialog(null, "APRETASTE CANCELAR");
        }
        else {
            if (v1.equals("")) {
                JOptionPane.showMessageDialog(null, "NO INGRESASTE NADA");
            }else {
                JOptionPane.showMessageDialog(null, "EL VALOR DE V1 ES: " + v1);
            }
        }
    }
}
