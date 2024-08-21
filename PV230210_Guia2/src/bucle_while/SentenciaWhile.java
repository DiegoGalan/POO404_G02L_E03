package bucle_while;

import javax.swing.*;

public class SentenciaWhile {

    public static void main(String[] args) {

        //TODO code application logic here
        String leer;
        double sueldo, mayor = 0, menor = 10000;
        int i = 1, contador = 0;

        while (i <= 5) {
            leer = JOptionPane.showInputDialog("INGRESE EL SUELDO DEL EMPLEADO: " + i);
            sueldo = Double.parseDouble(leer);

            if (sueldo > 300)
                contador = contador + 1;

            if (sueldo > mayor)
                mayor = sueldo;

            if (sueldo < menor)
                menor = sueldo;

            i = i +1;
        }

        JOptionPane.showMessageDialog(null, "EL SUELDO MAYOR ES DE $: " + mayor + "\nEL SUELDO MENOR ES DE $: "
        + menor + "\n" + contador + " EMPLEADOS TIENE UN SUELDO MAYOR DE $300");
    }
}
