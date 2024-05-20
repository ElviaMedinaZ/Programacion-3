package models;

import java.sql.*;

public class AuthModel {

    public AuthModel() {
        // Constructor vacío
    }

    public boolean login(String username, String password) {
        System.out.println("Consultando datos...");
        try {
            String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_actividad";
            String userdb = "freedb_elvia";
            String passworddb = "g6VuCF*AAW&x6SR";

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, userdb, passworddb);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

            // si coinciden los muestran
            if (rs.next()) {
                do {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                } while (rs.next());
            } else {
                System.out.println("No se encontraron datos.");
            }
            
            //Cierra la conexion
            con.close();
            return true;

        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
