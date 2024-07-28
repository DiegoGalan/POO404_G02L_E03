package sentencia_IF;

import javax.swing.*;
import java.awt.*;

public class Controlif_3 {

    public static void main(String[] args) {

        int result = JOptionPane.showConfirmDialog(null, "REPLACE EXISTING SELECTION?");

        System.out.println("EL NUMERO DEVUELTO ES: " + result);

        if (result == JOptionPane.YES_OPTION) {
            System.out.println("YES");
        } else if (result == JOptionPane.NO_OPTION) {
            System.out.println("NO");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            System.out.println("CANCEL");
        } else if (result == JOptionPane.CLOSED_OPTION) {
            System.out.println("CLOSED");
        }
    }
}
