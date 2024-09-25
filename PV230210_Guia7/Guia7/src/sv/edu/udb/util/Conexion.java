package sv.edu.udb.util;

import java.sql.*;

public class Conexion {
    private Connection conexion = null;
    private Statement s = null;
    private ResultSet rs = null;
    private String ingresoempleados = "";

    //CONSTRUCTOR
    public Conexion() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/personabdd", "root", "");
            s = conexion.createStatement();

            System.out.println("CONEXION EXITOSA");
        }
        catch (ClassNotFoundException e1) {
            System.out.println("ERROR:NO ENCUENTRO EL DRIVER DE LA BD: " + e1.getMessage());
        }
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(String sql) {
        try {
            this.rs = s.executeQuery(sql);
        } catch (SQLException e2) {
            System.out.println("ERROR:FALLO EN SQL: " + e2.getMessage());
        }
    }

    public void setQuery(String sql) throws SQLException {
        this.s.executeUpdate(sql);
    }

    public void cerrarConexion() throws SQLException {
        conexion.close();
    }
}
