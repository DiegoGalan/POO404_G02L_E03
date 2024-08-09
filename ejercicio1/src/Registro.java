import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre= "";
        String apellido= "";
        String sexo = "";


        //Solicitar el nombre
        System.out.print("Ingrese su nombre");
        nombre = reader.nextLine();

        //ingrese el apellido
        System.out.print("Ingrese su apellido");
        apellido = reader.nextLine();

        //Solicitar el sexo
        System.out.print("Ingrese su sexo");
        sexo = reader.nextLine();



        //resultado de imprimir
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido es " + apellido);
        System.out.println("Tu sexo es " + sexo);


    }
}