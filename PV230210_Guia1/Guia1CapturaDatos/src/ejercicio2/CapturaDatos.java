package ejercicio2;

import java.util.*;

public class CapturaDatos {

    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        int edad;

        //System.out.print("PRACTICA 1 DE POO404");
        System.out.println("BIENVENIDO A INTELLIJ IDEA IDEA");
        System.out.print("INGRESE SU NOMBRE: ");
        nombre = reader.nextLine();
        System.out.print("INGRESE SU EDAD: ");
        edad = reader.nextInt();
        System.out.println("USTED SE LLAMA " + nombre + " Y TIENE " + edad + " AÑOS");
    }
}
