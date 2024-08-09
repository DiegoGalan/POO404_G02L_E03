import java.util.Scanner;
import java.util.*;
public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre= "";
        String apellido= "";
        String sexo= "";
        int edad;

        //Solicitar nombre
        System.out.print("Ingrese su nombre");
        nombre = reader.nextLine();
        //ingrese su apellido
        System.out.print("Ingrese su apellido");
        apellido = reader.nextLine();
        //Se ingresa el su edad
        System.out.print("Ingrese su edad ");
        edad = reader.nextInt();
        //Solicitar su sexo
        System.out.print("Ingrese su sexo");
        sexo = reader.nextLine();

        if (edad < 30) {
            System.out.print("Hola amigo " + nombre + apellido);
        }
        else if (edad > 30) {
            System.out.print("Buenos dias mr" + nombre + apellido);
        }


    }
}