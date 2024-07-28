package coleccionesjava;

import java.util.ArrayList;
import  java.util.Collection;

public class EjemploCollection {

    public static void main(String[] args) {

        Collection listaMarcasCoches = new ArrayList<String>(); //EL TIPO DE listaMarcasCoche ES COLLECTION

        //AGREGANDO INFORMACION
        listaMarcasCoches.add("AUDI");
        listaMarcasCoches.add("PORSCHE");
        listaMarcasCoches.add("SUBARU");
        listaMarcasCoches.add("FERRARI");
        listaMarcasCoches.add("MERCEDES");
        listaMarcasCoches.add("BMW");

        System.out.println("NUMERO ELEMENTOS ANTES DE ELIMINAR: " + listaMarcasCoches.size()); //OBTENER TAMAÑO DE COLLECTION

        System.out.println("ELEMENTOS: " + listaMarcasCoches.toString());
        listaMarcasCoches.remove("BMW"); //REMOVIENDO ELEMENTO POR NOMBRE
        listaMarcasCoches.remove("SUBARU"); //ROMOVIENDO ELEMENTO POR NOMBRE
        System.out.println("NUMERO ELEMENTOS DESPUES DE ELIMINAR BMW Y SUBARU: " + listaMarcasCoches.size());
        System.out.println("ELEMENTOS: " + listaMarcasCoches.toString());
    }
}
