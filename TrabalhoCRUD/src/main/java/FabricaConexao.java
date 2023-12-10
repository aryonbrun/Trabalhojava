import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//a classe fabricaconexao vai direcionar a conexao para da database
//adicionando o localhost/biblioteca
//sempre instanciar a fabricaconexao nas clasess
public class FabricaConexao {
    public static Connection getConexao() {
        try {
            final String url = "";
            final String usuario = "root";
            final String senha = "root";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
