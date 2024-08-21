package Guia3;

import javax.swing.*;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String edad;

    //CONSTRUCTOR POR SIN PARAMETROS
    //SE UTILIZA AL INSTANCIAR EL OBJETO

    public Persona() {
        nombre = "RAFAEL";
        apellido = "TORRES";
        edad = "23";
    }

    //CONSTRUCTOR CON PARAMETROS
    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //PERMITE DEFINIR DATOS A LOS ATRIBUTOS
    public void ingresosDatos() {
        nombre = JOptionPane.showInputDialog("INGRESE SU NOMBRE: ");
        apellido = JOptionPane.showInputDialog("INGRESE SU APELLIDO: ");
        edad = JOptionPane.showInputDialog("INGRESE SU EDAD: ");
    }

    //PERMITE IMPRIMIR LOS VALORES DE LOS ATRIBUTOS
    public void mostrarDatos() {
        System.out.println("SU NOMBRE ES: " + nombre);
        System.out.println("SU APELLIDO ES: " + apellido);
        System.out.println("SU EDAD ES: "+ edad);
        System.out.println("*****************************************");
    }

    public static void main (String[] args) {
        //INSTANCIA DEL OBJETO obj1
        Persona obj1 = new Persona();

        //INSTANCIA DEL OBJETO P2
        Persona obj2 = new Persona("MANUEL", "VALDEZ", "25");

        //LLAMAMOS A EL METODO MOSTRAR DATOS DE obj1
        obj1.mostrarDatos();

        //CAMBIAMO VALOR A LOS ATRIBUTOS DE obj1
        obj1.ingresosDatos();

        //LLAMAMOS A EL METODO MOSTRARDATOS DE obj1
        obj1.mostrarDatos();

        //LLAMAMOS A EL METODO MOSTRARDATOS DE obj2
        obj2.mostrarDatos();
        obj1.apellido = "SANCHEZ";
        obj1.mostrarDatos();
    }
}
