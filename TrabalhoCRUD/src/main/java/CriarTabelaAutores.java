import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//codigo criado a partir da fabrica conexao
public class CriarTabelaAutores {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS autores ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nome VARCHAR(100) NOT NULL,"
                + "nacionalidade VARCHAR(100)"
                + ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }
}
