import java.sql.*;

public class Main {
    public static void main(String[] args)  {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tienda_thpw_dam","root","root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
