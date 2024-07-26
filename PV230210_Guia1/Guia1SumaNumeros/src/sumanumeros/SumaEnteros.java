package sumanumeros;

import javax.swing.JOptionPane; //GENERA CUADRO DE DIALOGOS PARA USUARIO

public class SumaEnteros {

    public static void main (String[] args) {

        //DECLARA A 2 VARIABLES DE TIPO CADENA (STRING)
        String primernumero;
        String segundonumero;

        //DECLARA A 3 VARIABLES DE TIPO ENTERO (INT)
        int numero1, numero2, suma;

        System.out.println("APLICACION PARA SUMAR 2 NUMEROS ENTEROS\n");

        //GENERA CUADROS DE DIALOGO PARA INGRESAR NUMEROS (COMO STRING)
        primernumero = JOptionPane.showInputDialog("DIGITE EL PRIMER NUMERO: ");
        segundonumero = JOptionPane.showInputDialog("DIGITE EL SEGUNDO NUMERO: ");

        //CONVIERTE CADA STRING A UN NUMERO ENTERO
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);

        //VALIDAR SI LOS NUMEROS SON NEGATIVOS
        if (numero1 < 0 || numero2 < 0) {
            JOptionPane.showMessageDialog(null, "NO SE PERMITEN NUMEROS NEGATIVOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        System.out.println("LOS NUMEROS INGRESADOS SON " + numero1 + " Y " + numero2);

        //REALIZA LA OPERACION DE SUMAR LOS 2 NUMEROS ENTEROS INGRESADOS POR USUARIO
        suma = numero1 + numero2;

        //GENERA UN CUADRO DE DIALOGO PARA PRESENTAR EL RESULTADO DE LA SUMA REALIZADA
        JOptionPane.showMessageDialog(null, "LA SUMA DE " + numero1 + " Y " + numero2 + " ES DE " + suma, "RESULTADO DE LA SUMA", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
