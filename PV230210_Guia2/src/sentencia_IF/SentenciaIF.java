package sentencia_IF;

import javax.swing.*;
import java.awt.*;

public class SentenciaIF {

    public static void main(String[] args) {

        String datos;
        double sueldo, afp = 0, isss, totalre, nsueldo, renta;

        datos = JOptionPane.showInputDialog("INGRESE EL SUELDO DEL EMPLEADO/A");
        sueldo = Double.parseDouble(datos);

        if (sueldo > 300) {
            afp = (sueldo * 0.0625);
        }

        JOptionPane.showMessageDialog(null, "ESTE EMPLEADO TIENE UN SUELDO DE " + sueldo + " y EL DESCUENTO DEL AFP ES " + afp);
        datos = (String) JOptionPane.showInputDialog(null, "INGRESE EL SEXO:\nSI ES MACULINO (M)\nSI ES FEMEMINO (F)",
                "SEXO DEL EMPLEADO", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"M", "F"},"F");

        if (datos == "M") {
            isss = sueldo * 0.03;
            renta = sueldo * 0.10;
            totalre = afp + isss + renta;
            nsueldo = sueldo - totalre;

            JOptionPane.showMessageDialog(null, "A ESTE EMPLEADO SE LE DETIENE " + isss + " EN CONCEPTO DE ISSS\nADEMAS SE LE RETIENE: "
            + renta + "EN CONCEPTO DE RENTA\nLO QUE HACE UN TOTAL DE " + totalre + "\nY SU NUEVO SUELDO ES DE: " + nsueldo);
        }
    }
}
