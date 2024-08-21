package Guia3;

public class Arboles {

    //CONSTRUCTOR SIN PARAMETROS
    public Arboles() {
        System.out.println("UN ARBOL GENERICO");
    }

    //CONSTRUCTORES CON UN PARAMETRO STRING
    public Arboles(String tipo) {
        System.out.println("UN ARBOL TIPO " + tipo);
    }

    //CONSTRUCTOR CON UN PARAMETRO INT
    public Arboles(int altura) {
        System.out.println("UN ARBOL DE " + altura + " METROS");
    }

    //CONSTRUCTOR CON DOS PARAMETROS UNO INT Y EL OTRO STRING
    public Arboles(int altura, String tipo) {
        System.out.println("UN " + tipo + " DE " + altura + " METROS");
    }

    public static void main(String[] args) {
        Arboles arbol1 = new Arboles(4); //OBJETO 1
        Arboles arbol2 = new Arboles("ROBLE"); //OBJETO 2
        Arboles arbol3 = new Arboles(); //OBJETO 3
        Arboles arbol4 = new Arboles(5, "PINO"); //OBJETO 4
    }
}
