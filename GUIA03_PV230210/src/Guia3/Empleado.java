package Guia3;

import javax.swing.JOptionPane;

public class Empleado {

    private String nombre;
    private String apellido;

    //METODO QUE PERMITE MOSTRAR EL CONTENIDO DE LOS ATRIBUTOS
    public void mostrarDatos() {

       JOptionPane.showConfirmDialog(null, nombre + "" + apellido);
    }

    //METODO QUE PERMITE CAMBIAR LOS DATOS DE LOS ATRIBUTOS
    public void ingresoDatos() {

        nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE: ");
        apellido = JOptionPane.showInputDialog("INGRESE EL APELLIDO: ");
    }

}

//CLASE PROFESOR QUE HEREDA DE EMPLEADO
class Profesor extends Empleado {
    int sueldo;

    public void mostrar2() {

        mostrarDatos(); //METODO HEREDADO DE EMPLEADO
        JOptionPane.showMessageDialog(null, sueldo);
    }

    public void ingreso2() {

        ingresoDatos(); //METODO HEREDADO DE EMPLEADO
        String s = JOptionPane.showInputDialog("INGRESE EL SUELDO: ");
        sueldo = Integer.parseInt(s);
    }
}
