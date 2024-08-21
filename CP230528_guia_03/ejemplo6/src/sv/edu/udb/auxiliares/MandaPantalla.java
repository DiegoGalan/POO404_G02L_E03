package sv.edu.udb.auxiliares;
import sv.edu.udb.escritura.*;
public class MandaPantalla {
    public static void main(String args[]){
        Pantalla primera=new Pantalla();
        primera.conSalto("Esto es un renglon CON salto de linea");
        primera.conSalto("Esat linea tambien tiene salto");
        primera.sinSalto("Linea continua");
        primera.sinSalto("Linea continua");
        primera.conSalto("Esta linea si tiene salto");
        primera.sinSalto("Termina sin salto");
        System.out.println("Se termina el uso de funciones");
    }
}
