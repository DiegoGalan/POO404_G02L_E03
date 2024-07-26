package complementaria;

import java.util.*;

public class InformacionBasica {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String nombre = "";
        String apellido = "";
        String carrera = "";
        int edad;

        System.out.print("INGRESE SU NOMBRE: ");
        nombre = reader.nextLine();

        System.out.print("INGRESE SU APELLIDO:");
        apellido = reader.nextLine();

        System.out.print("INGRESE SU CARRERA: ");
        carrera = reader.nextLine();

        System.out.print("INGRESE SU EDAD: ");
        edad = reader.nextInt();


        //IMPRIMIR LA INFORMACION EN CONSOLA
        System.out.println("\nINFORMACION BASICA");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("APELLIDO: " + apellido);
        System.out.println("CARRERA: " + carrera);
        System.out.println("EDAD: " + edad);


    }
}
