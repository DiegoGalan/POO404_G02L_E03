package coleccionesjava;

import java.util.*;
public class EjemploList {

    public static void main(String[] args) {
        ArrayList <String> listaPersona = new ArrayList<>();

        //AGREAGANDO ELEMENTOS
        listaPersona.add("MARIE CURIE");
        listaPersona.add("BENJAMIN FRANKLIN");
        listaPersona.add("LEONEL MESSI");
        listaPersona.add(1, "CRISTIANO RONALDO");

        //MOSTRAR CONTENIDO DE ArrayList
        System.out.println("USO DE ARRAYLIST");
        System.out.println("CONTENIDO DE LISTAPERSONA: " + listaPersona + "\n");

        //OBTENIENDO POSICION DE UN ELEMENTO
        int pos = listaPersona.indexOf("BENJAMIN FRANKLIN");
        System.out.println("EL INDICE DE BENJAMIN FRANKLIN ES: " + pos);

        //VERIFICANDO SI LA LISTA ESTA VACIA
        boolean check = listaPersona.isEmpty();
        System.out.println("VERIFICANDO SI ARRAYLIST ESTA VACIO: " + check);

        //OBTENIENDO TAMAÑO DE LISTA
        int size = listaPersona.size();
        System.out.println("EL TAMAÑO DE LISTAPERSONA ES: " + size);

        //VERIFICANDO SI UN ELEMENTO ESTA INCLUIDO EN LA LISTA
        boolean elemento = listaPersona.contains("LEONEL MESSI");
        System.out.println("VERIFICANDO SI 'LEONEL MESSI' ESTA INCLUIDO EN LISTAPERSONA: " + elemento);

        //OBTENIENDO ELEMENTO DE UNA POSICION ESPECEFICA
        String item = listaPersona.get(0);
        System.out.println("ELEMENTO CON INDICE 0 ES: " + item);

        //RECUPERANDO ELEMENTO DE ARRAYLIST
        //PRIMERA FORMA: USANDO LAZO FOR
        System.out.println("\nRECUPERANDO ELEMENTO DE ARRAYLIST CON FOR");

        for (int i = 0; i < listaPersona.size(); i++) {
            System.out.println("INDICE: " + i + "- ELEMENTO: " + listaPersona.get(i));
        }

        //SEGUNDA FORMA: USANDO LAZO FOREACH
        System.out.println("\nRECUPERANDO ELEMENTOS DEL ARRAYLIST CON FOREACH");

        for (String persona : listaPersona) {
            System.out.println("ELEMENTO: " + persona);
        }

        //TERCER FORMA: USANDO ITERATOR
        //hasNext(): DEVUELVE TRUE SI HAY MAS ELEMENTOS
        //next(): DEVUELVE EL SIGUIENTE ELEMENTO
        System.out.println("\nRECUPERANDO ELEMENTOS DEL ARRAYLIST CON ITERATOR");

        for (Iterator <String> it = listaPersona.iterator(); it.hasNext();) {
            System.out.println("ELEMENTO: " + it.next());
        }

        //REMPLAZANDO UN ELEMENTO
        listaPersona.set(1, "TONI KROOS");
        System.out.println("\nARRAYLIST DESPUES DE REEMPLAZO: " + listaPersona);

        //ELIMINANDO ELEMENTO EN POSICION 0
        listaPersona.remove(0);
        System.out.println("\nARRAYLIST DESPUES DE ELIMINAR ELEMENTO 0: " + listaPersona);

        //CONVIRTIENDO ARRAYLIST EN ARRAY
        String[] simpleArray = listaPersona.toArray(new String[listaPersona.size()]);
        System.out.println("\nEL OBJETO ARRY CREADO ES: " + Arrays.toString(simpleArray));
    }
}
