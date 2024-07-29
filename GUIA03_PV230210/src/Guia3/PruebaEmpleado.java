package Guia3;

import javax.swing.JOptionPane;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado emp = new Empleado(); //OBJETO DE TIPO EMPLEADO
        Profesor pro = new Profesor(); //OBJETO DE TIPO PROFESOR
        JOptionPane.showMessageDialog(null, "CLASEEMPLEADO");

        //UTILIZANDO LOS METODOS DE EMPLEADO
        emp.ingresoDatos();
        emp.mostrarDatos();

        JOptionPane.showMessageDialog(null,"CLASE PROFESOR");

        //UTILIZANDO LOS METODOS DE PROFESOR
        pro.ingreso2();
        pro.mostrar2();
    }
}
