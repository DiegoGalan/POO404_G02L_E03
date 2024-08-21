package sentencia_IF;

import java.util.Scanner;

public class Controlif {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int Var1, Var2;

        System.out.print("INGRESE NUMERO 1: ");
        Var1 = reader.nextInt();

        System.out.print("INGRESE EL NUMERO 2: ");
        Var2 = reader.nextInt();

        if (Var1 == Var2) {
            System.out.print("LOS NUMEROS INGRESADOS SON IGUALES");
        }
        else {
            System.out.println("LOS NUMEROS INGRESADOS NO SON IGUALES");
        }

    }
}
