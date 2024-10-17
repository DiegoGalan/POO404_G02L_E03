package Guia1CapturaDatos;
import java.util.*;

public class CapturaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int edad;
        System.out.println("Bienvenido a Intellij IDEA IDEA");
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Usted se llama"+nombre +"y tiene"+edad+"años");
    }
}
