import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaEmprestimos {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        //criando query
        String sql = "CREATE TABLE IF NOT EXISTS emprestimos ("
                +  "id INT AUTO_INCREMENT PRIMARY KEY,"
                +  "livro_id INT,"
                +  "data_emprestimo DATE,"
                +  "data_devolucao DATE,"
                +  "FOREIGN KEY (livro_id) REFERENCES livros(id)"
                +  ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql); //executando sql

        System.out.println("Tabela criada com sucesso!");
        conexao.close();//sempre fechando a conexao
    }
}
