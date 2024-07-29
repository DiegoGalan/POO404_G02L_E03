package Guia3;

class Clase {
    static int contador;

    Clase() { //CONSTRUCTOR
        contador ++;
    }

    int getContador() { //OBTENEMOS EL VALOR DE CONTADOR
        return contador;
    }

}

public class Codigo {

    public static void main(String[] args) {

        Clase uno = new Clase();
        Clase dos = new Clase();
        Clase tres = new Clase();
        Clase cuatro = new Clase();
        System.out.println("HEMOS DECLARADO " + dos.getContador() + " OBJETOS.");
    }

}
