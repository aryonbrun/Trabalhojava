import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaLivros {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS livros ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "titulo VARCHAR(200) NOT NULL,"
                + "ano_publicacao YEAR,"
                + "autor_id INT,"
                + "FOREIGN KEY (autor_id) REFERENCES autores(id)"
                + ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }
}
