import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String url = "jdbc:mysql://200.17.196.17/aryon_jdbc";
    private static final String usuario = "root";
    private static final String senha = "root";

    public static Connection conectar() throws SQLException {
        // Instanciar e retornar o drive de conexão
        return DriverManager.getConnection(url, usuario, senha);
    }
}
