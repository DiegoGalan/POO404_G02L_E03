package sv.edu.udb.persona;

import javax.swing.JOptionPane;
import java.sql.*;
import sv.edu.udb.util.*;

public class IngresoDatos {
    private int id;
    private String ids;
    private String nombre;
    private int edad;
    private String edads;
    private String telefono;
    private String sexo;
    private int idocupacion;
    private String idocupacions;
    private String fechanac;

    private Connection conexion;
    private ResultSet rs;
    private Statement s;

    public IngresoDatos(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personabdd", "root", "");
            s = conexion.createStatement();
            ingreso();
            s.executeUpdate("Insert into persona values ("+ id +",\"" + nombre +"\","+ edad +",\""+ telefono +"\",\""+ sexo +"\","+ idocupacion +",\""+ fechanac +"\")");

            JOptionPane.showMessageDialog(null, "PERSONA INGRESADA CORRECTAMENTE");
        }
        catch (ClassNotFoundException e1) {
            System.out.println("ERROR:NO ENCUENTRO EL DRIVE DE LA BD: " + e1.getMessage());
            System.exit(0);
        }
        catch (SQLException e2) {
            System.out.println("ERROR:FALLO EN SQL: " + e2.getMessage());
            System.exit(0);
        }
    }

    public void obtenerOcupacion() throws SQLException {
        rs = s.executeQuery("select count(*) from ocupaciones");
        int tamanio = 0;
        while (rs.next()) {
            tamanio = rs.getInt(1);
        }
        String[] options2 = new String[tamanio];
        int contador = 0;
        rs = s.executeQuery("select * from ocupaciones");
        String texto = "";

        while (rs.next()) {
            options2[contador] = rs.getString("ocupacion");
            contador++;
        }
        idocupacions = (String) JOptionPane.showInputDialog(null, "SELECCIONE UN ACUPACION", "OCUPACION PERSONA", JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
        rs = s.executeQuery("select id_ocupacion from ocupaciones where ocupacion = '" + idocupacions + "'");
        while (rs.next()) {
            idocupacion = rs.getInt(1);
        }
    }

    public void ingreso()throws SQLException {
        ids = JOptionPane.showInputDialog("INGRESE EL ID");
        id = Integer.parseInt(ids);
        nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE");
        edads = JOptionPane.showInputDialog("INGRESE LA EDAD");
        edad = Integer.parseInt(edads);
        telefono = JOptionPane.showInputDialog("INGRES SU TELEFONO");

        do {
            if ( MatchTelephone.compareTelephone(telefono) == true) {
                break;
            } else  {
                JOptionPane.showMessageDialog(null, "NUMERO DE TELEFONO INVALIDO");
                telefono = JOptionPane.showInputDialog("INGRESE SU TELEFONO");
            }
        } while (true);

        String[] options = {"Femenino", "Masculino"};
        sexo = (String) JOptionPane.showInputDialog(null, "¿INGRESE EL SEXO?", "Sexo persona", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        obtenerOcupacion();
        fechanac = JOptionPane.showInputDialog("INGRESE LA FECHA DE NACIMIENTO");

        do {
            if (MatchDate.compareDate(fechanac) == true) {
                break;
            }else {
                JOptionPane.showMessageDialog(null,"Formato fecha invalida");
                fechanac = JOptionPane.showInputDialog("Ingrese la fecha nacimiento");
            }
        }while (true);
    }
    public void mostrarDatos() throws SQLException {
        rs = s.executeQuery("select * from persona");
        while (rs.next()) {
            JOptionPane.showMessageDialog(null, "ID: " + rs.getString("id_persona") +
                    "\nNombre: " + rs.getString("nombre_persona") +
                    "\nEdad: " + rs.getInt("edad_persona") +
                    "\nSexo: " + rs.getString("telefono_persona"));
        };
    }

    public void cierreConexion() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        IngresoDatos ing = new IngresoDatos();
        ing.mostrarDatos();
        ing.cierreConexion();
    }
}

