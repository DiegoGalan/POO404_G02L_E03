package comparaciones;

import javax.swing.JOptionPane;

public class Comparaciones {

    public static void main(String[] args) {

        //DECLARACION DE 3 VARIABLES TIPO String
        String primernumero, segundonumero, resultado;
        int numero1, numero2; //ALMACENA NUMEROS DADOS POR USUARIO

        System.out.println("PROGRAMA PARA USAR OPERADORES RELACIONALES EN JAVA");

        //CAPTURA COMO String A NUMEROS SOLICITADOS A USUARIOS
        primernumero = JOptionPane.showInputDialog("ESCRIBA EL PRIMER ENTERO: ");
        segundonumero = JOptionPane.showInputDialog("ESCRIBA EL SEGUNDO ENTERO: ");

        //CONVIERTE A NUMEROS ENTEROS A String RECIBIDOS POR EL USUARIO
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        resultado = "";

        //UTILIZA OPERADORES RELACIONALES PARA COMPARAR 2 NUMEROS RECIBIDOS
        if (numero1 == numero2) {
            resultado = resultado + numero1 + " IGUAL QUE " + numero2;
        }

        if (numero1 != numero2) {
            resultado = resultado + numero1 + " DISTINTO DE " + numero2;
        }

        if (numero1 < numero2) {
            resultado = resultado + numero1 + " < " + numero2;
        }

        if (numero1 > numero2) {
            resultado = resultado + numero1 + " > " + numero2;
        }

        if (numero1 <= numero2) {
            resultado = resultado + numero1 + " <= " + numero2;
        }

        if (numero1 >= numero2) {
            resultado = resultado + numero1 + " >= " + numero2;
        }

        JOptionPane.showConfirmDialog(null, resultado, "RESULTADO DE LA COMPARACION", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}
