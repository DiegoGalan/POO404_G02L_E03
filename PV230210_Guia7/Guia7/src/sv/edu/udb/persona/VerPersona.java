package sv.edu.udb.persona;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class VerPersona {
    public VerPersona() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personabdd", "root", "");
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from persona");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_persona") +
                        "\nNombre: " + rs.getString("nombre_persona") +
                        "\nEdad: " + rs.getString("edad_persona") +
                        "\nTelefono: " + rs.getString("telefono_persona"));
                System.out.println("**************************************");
            }
            conexion.close();
        }
        catch (ClassNotFoundException e1) {
            System.out.println("ERROR:NO ENCUENTRO EL DRIVER DE LA BD: " + e1.getMessage());
        }
        catch (SQLException e2) {
            System.out.println("ERROR:FALLO EL SQL: " + e2.getMessage());
        }
    }

    public static void main(String[] args) {
        new VerPersona();
    }
}
