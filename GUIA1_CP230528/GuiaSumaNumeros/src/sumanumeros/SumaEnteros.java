package sumanumeros;

import javax.swing.*;

public class SumaEnteros {
    public static void main(String[] args) {
        String primernummero;
        String segundonumero;
        int numero1, numero2, suma;
        System.out.println("Aplicacion para sumar 2 numeros enteros\n");
        primernummero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("digite el segundo numero ");
        numero1 = Integer.parseInt(primernummero);
        numero2 = Integer.parseInt(segundonumero);
        System.out.println("los numeros ingresados son "+numero1 +" y " + numero2);
        suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma de " +numero1+" y "+numero2+" es de "+suma,"Resultado de la suma ",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
