package Guia3;

import javax.swing.*;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String edad;

    //Se utiliza la instaciar un objeto
    public Persona (){
        nombre="Rafael";
        apellido="Torres";
        edad="23";
    }
    //Constructor con parametros
    public Persona (String nombre,String apellido,String edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    //Permite definir datos a los atributos
    public void ingresoDatos(){
        nombre= JOptionPane.showInputDialog("ingrese el Nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
        edad=JOptionPane.showInputDialog("Ingrese su Edad");
    }
    public void mostrarDatos(){
        System.out.println("Su nombre es:"+nombre);
        System.out.println("Su appelido es:"+apellido);
        System.out.println("Su edad es:"+edad);
        System.out.println("*********************************");
    }
    public static void main(String args[]){
        Persona obj1=new Persona();
        Persona obj2=new Persona("Manuel","Valdez","25");
        obj1.mostrarDatos();
        obj1.ingresoDatos();
        obj1.mostrarDatos();
        obj2.mostrarDatos();
        obj1.apellido="Sanchez";
        obj1.mostrarDatos();
    }

}
