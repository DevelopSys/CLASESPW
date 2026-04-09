package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // sera el patron singleton
    private static Connection connection;

    public static Connection getConnection(){
        if(connection == null){
            // la creo
            createConnection();
        }
        return connection;
    }

    private static void createConnection(){
        String user = "root";
        String pass = "root";
        String database = "tienda_thepw";
        try {
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/"+database,user,pass);
        } catch (SQLException e){
            System.out.println("Error en la conexion con la base de datos");
            System.out.println(e.getMessage());
        }
    }
}
