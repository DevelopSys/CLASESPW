package dao;

import database.DBConnection;
import database.SchemDB;
import model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// permite ejecuciones CRUD sobre base de datos
public class ClienteDAO {
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ClienteDAO() {
        connection = DBConnection.getConnection();
    }

    //TODO metodos CRUD
    public int insertarUsuario(Cliente cliente) {
        // 1 - Conection
        // 2 - Query
        // INSERT INTO clientes (nombre, apellido, correo, saldo, id_perfil) VALUES (cliente.getNombre)
        // String query = "INSERT INTO clientes (nombre, apellido, correo, saldo, id_perfil) VALUES ('"+cliente.getNombre()+"','"+cliente.getApellido()+"'"+cliente.getSaldo()+")";
        String query = String.format("INSERT INTO %s (%s, %s, %s, %s, %s) VALUES ('%s','%s','%s',%d,%d)",
                SchemDB.TAB_CLIENTES,
                SchemDB.COL_NAME, SchemDB.COL_SURNAME, SchemDB.COL_MAIL, SchemDB.COL_PRICE, SchemDB.COL_PROFILE,
                cliente.getNombre(), cliente.getApellido(), cliente.getCorreo(), cliente.getSaldo(), cliente.getIdPerfil()
        );
        // 3. crear statement
        try {
            statement = connection.createStatement();
            // 4. ejecuta

            return statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("Error en la ejecucion");
            System.out.println(e.getMessage());
        }
        return -1;
    }

    public boolean insertarUsuarioPS(Cliente cliente) throws SQLException {

        String query = String.format("INSERT INTO %s ( %s, %s, %s, %s, %s ) VALUES (?,?,?,?,?)",
                SchemDB.TAB_CLIENTES,
                SchemDB.COL_NAME, SchemDB.COL_SURNAME, SchemDB.COL_MAIL, SchemDB.COL_PRICE, SchemDB.COL_PROFILE);

        System.out.println(query);
        // 3. crear statement

        preparedStatement = connection.prepareStatement(query);
        // 4. parametriza datos
        preparedStatement.setString(1, cliente.getNombre());
        preparedStatement.setString(2, cliente.getApellido());
        preparedStatement.setString(3, cliente.getCorreo());
        preparedStatement.setInt(4, cliente.getSaldo());
        preparedStatement.setInt(5, cliente.getIdPerfil());

        // 5. ejecuta
        return preparedStatement.execute();

    }

    public int actualizarUsuario(String correo, String nombre) {
        String query = String.format("UPDATE %s SET %s=? WHERE %s=?",
                SchemDB.TAB_CLIENTES, SchemDB.COL_NAME, SchemDB.COL_MAIL);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, correo);
            return preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en la query");
        }
        return -1;
    }

    public List<Cliente> obtenerClientes() {

        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM " + SchemDB.TAB_CLIENTES;
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            //   V
            //   r r r r r r r r r r r
            while (resultSet.next()) {
                String nombre = resultSet.getString(SchemDB.COL_NAME);
                String apellido = resultSet.getString(SchemDB.COL_SURNAME);
                String correo = resultSet.getString(SchemDB.COL_MAIL);
                int saldo = resultSet.getInt(SchemDB.COL_PRICE);
                int idPerfil = resultSet.getInt(SchemDB.COL_PROFILE);
                clientes.add(new Cliente(nombre, apellido, correo, saldo, idPerfil));
            }

        } catch (SQLException e) {
            System.out.println("Error en la SQL");
            System.out.println(e.getMessage());
        }

        return clientes;
    }
}
