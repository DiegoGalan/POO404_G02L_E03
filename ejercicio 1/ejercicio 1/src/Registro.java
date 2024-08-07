import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre= "";
        String apellido= "";
        String sexo = "";
        int edad;

        //Solicitar nombre
        System.out.print("Ingrese su nombre");
        nombre = reader.nextLine();
        //ingrese su apellido
        System.out.print("Ingrese su apellido");
        apellido = reader.nextLine();
        //Solicitar sexo
        System.out.print("Ingrese su sexo");
        sexo = reader.nextLine();
        //Se ingresa el su edad
        System.out.print("Ingrese su edad ");
        edad = reader.nextInt();

        //resultado de imprimir
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido es " + apellido);
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu sexo es " + sexo);

        //Se valida que sitiene mas de 30 diga ms y si es menos de 30 amigo
        if (edad < 30) {
            System.out.print("Hola amig@ " + nombre + apellido);
        }
        else if (edad > 30) {
            System.out.print("Buenos dias mr/ms " + nombre + apellido);
        }

    }
}
