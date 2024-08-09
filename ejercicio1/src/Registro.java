import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String nombre= "";
        String apellido= "";
        String sexo = "";
        String fechaNacimiento = "";


        //Solicitar el nombre
        System.out.print("Ingrese su nombre");
        nombre = reader.nextLine();

        //ingrese el apellido
        System.out.print("Ingrese su apellido");
        apellido = reader.nextLine();

        //Solicitar el sexo
        System.out.print("Ingrese su sexo");
        sexo = reader.nextLine();

        //Fecha de nacimiento
        System.out.print("Ingrese su fecha de nacimiento dd-mm-yyyy");
        fechaNacimiento = reader.nextLine();



        //resultado de imprimir
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido es " + apellido);
        System.out.println("Tu sexo es " + sexo);
        System.out.println("Tu fecha de nacimiento es " + fechaNacimiento);


    }
}