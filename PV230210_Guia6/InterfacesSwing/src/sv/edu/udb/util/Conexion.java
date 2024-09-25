package sv.edu.udb.util;

import java.security.PublicKey;
import java.sql.*;

public class Conexion {
    //VALORES DE CONEXION A MYSQL
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost:3306/personabdd";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "";
    private static Driver driver = null;

    public static synchronized Connection getConnection()
            throws SQLException {
        Connection con = null;

        if (driver == null) {
            try {
                //SE REGISTRA EL DRIVE
                Class.forName(JDBC_DRIVER);
            } catch (Exception e) {
                System.out.println("FALLO AL CARGAR EL DRIVER JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    //CIERRE DEL RESULTSET
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    //CIERRE DEL PREPARESTATEMENT
    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    //CIERRE DE LA CONEXION
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}


