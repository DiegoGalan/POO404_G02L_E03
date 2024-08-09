import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;
public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Hola Bienvenido al Ejercicio1");
        String nombre= "";
        String apellido= "";
        String sexo = "";
        int edad;

        //Solicitar el nombre
        System.out.print("Ingrese su nombre");
        nombre = reader.nextLine();

        //ingrese el apellido
        System.out.print("Ingrese su apellido");
        apellido = reader.nextLine();

        //Solicitar el sexo
        System.out.print("Ingrese su sexo");
        sexo = reader.nextLine();

        //Se ingresa la edad
        System.out.print("Ingrese su edad ");
        edad = reader.nextInt();

        if (edad < 30){
            System.out.print("Hola amigo " + nombre + apellido);
        }

        else if (edad > 30){
            System.out.print("Buenos dias mr " + nombre + apellido);
        }

        if (edad < 0){
            System.out.println("  Su edad no debe ser negativa");
            return;
        }

        //resultado de imprimir
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido es " + apellido);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu sexo es " + sexo);


    }
}