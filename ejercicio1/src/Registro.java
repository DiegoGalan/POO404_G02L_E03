
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner ingreso = new Scanner(System.in);

        String nombre = "";
        String apellido = "";
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
        System.out.print("Ingrese su fecha de nacimiento dd/mm/yyyy");
        fechaNacimiento = ingreso.nextLine();

        //resultado de imprimir
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido es " + apellido);
        System.out.println("Tu sexo es " + sexo);
        System.out.println("Tu fecha de nacimiento es " + fechaNacimiento);

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formatter);
            LocalDate fechaActual = LocalDate.now();
            Period periodo = Period.between(fechaActual, fechaNac);
            System.out.printf(" y tienes: %s años, %s meses y %s días",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
        }
        catch (Exception e) {
            System.out.print("La fecha no tiene el formato correcto dd/mm/yyyy");
        }
        

    }
}



