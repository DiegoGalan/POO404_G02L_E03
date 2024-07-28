package bucle_for;

import javax.swing.*;

public class For {

    public static void main(String[] args) {

        int numero;
        int valor;

        String strnumero = JOptionPane.showInputDialog("INGRESE UN NUMERO");
        numero = Integer.parseInt(strnumero);
        valor = numero;

        //LONG resultado = 1;
        for (int i = 1; i < valor; i++) {
            numero = numero * i;
            System.out.println(numero);
        }

        JOptionPane.showMessageDialog(null, "EL FACTORIAL DE " + valor + " ES "
        + numero, "RESPUESTA",JOptionPane.INFORMATION_MESSAGE);
        System.out.println("EL FACTORIAL ES " + numero);
    }
}
