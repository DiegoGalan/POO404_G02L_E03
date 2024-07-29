package sv.edu.udb.auxiliares;

import sv.edu.udb.escritura.*; //IMPORTAMOS LA CLASE PANTALLA

public class MandaPantalla {

    public static void main(String[] args) {

        Pantalla primera = new Pantalla();
        primera.conSalto("ESTO ES UN REGLON 'CON' SALTO DE LINEA");
        primera.conSalto("ESTA LINEA TAMBIEN TIENE SALTO");
        primera.sinSaltos("LINEA CONTINUA");
        primera.sinSaltos("LINEA CONTINUA");
        primera.conSalto("ESTA LINEA SI TIENE SALTO!!!");
        primera.sinSaltos("TERMINA SIN SALTO");
        System.out.println("SE TERMINA EL USO DE FUNCIONES");
    }
}
