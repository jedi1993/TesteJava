package br.com.abc.Projeto;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexão {
    public static AutoCloseable getConexao() {
        String url = "jdbc:mysql://localhost:3306/concessionaria?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(AutoCloseable connection, String sigaBemEntrada) {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}