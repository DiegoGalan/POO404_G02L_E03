
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;;
public class Registro {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner ingreso = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Hola Bienvenido Usuario");
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";


        //Solicitar el nombre
        System.out.print("Ingrese su nombre");
        nombre = reader.nextLine();

        //ingrese el apellido
        System.out.print("Ingrese su apellido");
        apellido = reader.nextLine();

        //Solicitar el sexo
        System.out.print("Ingrese su sexo H/h = hombre M/m = Mujer");
        char sexo = teclado.next().charAt(0);


        //Fecha de nacimiento
        System.out.print("Ingrese su fecha de nacimiento use el metodo dd/mm/yyyy con barras");
        fechaNacimiento = ingreso.nextLine();

        //resultado
        // se encarga de para darle una bienvenida de pendiendo del sexo elegido
        if(sexo=='H'){
            System.out.println("Hola amigo " + nombre + apellido + " aqui esta tu registro");
        }else if (sexo=='M'){
            System.out.println("Hola amiga " + nombre + apellido + " aqui esta tu registro");
        }
        if(sexo=='h') {
            System.out.println("Hola amigo " + nombre + apellido + " aqui esta tu registro");
        } else if (sexo=='m') {
            System.out.println("Hola amiga " + nombre + apellido + " aqui esta tu registro");
        }
        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tu apellido es " + apellido);
        //Se encargar de indentificar si es hombre o mujer
        if(sexo=='H'){
            System.out.println("Tu Eres un Hombre ");
        }else if (sexo=='M'){
            System.out.println("Eres una Mujer ");
        }
        if(sexo=='h') {
            System.out.println("Tu Eres un Hombre ");
        } else if (sexo=='m') {
            System.out.println("Eres una Mujer ");
        }
        System.out.println("Tu fecha de nacimiento es " + fechaNacimiento);

        //se encarga de calcular la fecha de nacimiento para dar la edad
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



