import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//testando conexao
public class TesteConexao {
    public static void main(String[] args) throws SQLException {

        final String url = "";
        final String usuario = "root";
        final String senha = "root";

        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
