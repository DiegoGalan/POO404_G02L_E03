package bucle_while;

import javax.swing.*;

public class CuadroDialog1 {

    /**
     * @PARAM ARGS THE COMMAND LINE ARGUMENTS
     */

    public static void main(String[] args) {

        //TODO code application logic here
        while (true) {
            try {
                String nombre = JOptionPane.showInputDialog("COMO TE LLAMAS?");
                String entrada = JOptionPane.showInputDialog("CUANTOS AÑOS TIENES?");
                int edad = Integer.parseInt(entrada);

                JOptionPane.showMessageDialog(null, "HOLA, " + nombre + ". EL AÑO QUE VIENE TENDRAS " + (edad + 1) +
                        " AÑOS","RESULTADO", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e) {
                System.out.println("ERROR EN ALGUN DATO DE ENTRADA");
                JOptionPane.showMessageDialog(null, "ERROR EN ALGUN DATO DE ENTRADA","ERROR",JOptionPane.ERROR_MESSAGE);
                String seleccion = (String) JOptionPane.showInputDialog(null, "DESEA SALIR", "SELECCIONE UNA OPCION",
                        JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI","NO"}, "SI");

                if (seleccion.equals("SI")) {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
