package Guia3;

import javax.swing.JOptionPane;

public class PruebaTiempo1 {

    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1(); //LLAMAR AL CONSTRUCTOR DE Tiempo1

        //ANEXAR VERSION STRING DE TIEMPO A SALIDA STRING
        String salida = "LA HORA UNIVERSAL INICIAL ES: " + tiempo.aStringUniversal() + "\nLA HORA ESTANDAR INICIAL ES: " + tiempo.aStringEstandar();

        //CAMBIAR TIEMPO Y ANEXAR HORA ACTUALIZADA A SALIDA
        tiempo.establecerHora(13, 27, 6);
        salida += "\n\nLA HORA UNIVERSAL DESPUES DE establecerHora ES: " + tiempo.aStringUniversal() +
                "\nLA HORA ESTANDAR DESPUES DE ESTABLECERHORA ES: " + tiempo.aStringEstandar();

        //ESTABLECER TIEMPO CON VALORES INVALIDOS; ANEXAR HORA ACTUALIZADA A SALIDA
        tiempo.establecerHora(99, 99, 99);
        salida += "\n\nDESPUES DE INTENTAR AJUSTES INVALIDOS: " + "\nHORA UNIVERSAL: " + tiempo.aStringUniversal() + "\nHORA ESTANDAR: " + tiempo.aStringEstandar();
        JOptionPane.showMessageDialog(null, salida, "PRUEBA DE LA CLASE TIEMPO1",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
