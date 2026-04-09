import database.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Connection connection1 = DBConnection.getConnection();
        try {
            System.out.println(connection1.getCatalog());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
