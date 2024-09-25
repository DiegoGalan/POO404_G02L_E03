package sv.edu.udb.nulos;

import sv.edu.udb.util.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertNulos {
    public static void main(String[] args) throws SQLException {
        Conexion conn = new Conexion();
        String sql1 = "insert into empleados values(8,'','Valdivieso', null)";
        conn.setQuery(sql1);

        String sql = "select nombre from empleados";
        ResultSet rs;

        conn.setRs(sql);
        rs = conn.getRs();

        String nombre;

        while (rs.next()) {
            nombre = rs.getString(1);

            if (nombre == null) {
                System.out.println("Nombre 'NULL': " + nombre);
            } else if (nombre.equals("")) {
                System.out.println("Nombre Vacio: " + nombre);
            } else {
                System.out.println("Nombre Con Datos: " + nombre);
            }
        }
        conn.cerrarConexion();
    }
}
