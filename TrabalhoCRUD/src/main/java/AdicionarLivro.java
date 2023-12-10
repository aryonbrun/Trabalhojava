import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdicionarLivro {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("informe titulo do Livro: ");
        String titulo = entrada.nextLine();
        System.out.println("informe ano publicacao: ");
        int ano_publicacao = entrada.nextInt();
        System.out.println("informe o id do autor: ");
        int autor_id = entrada.nextInt();

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO livros ( titulo, ano_publicacao, autor_id) VALUE (?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, titulo);
        stmt.setInt(2, ano_publicacao);
        stmt.setInt(3, autor_id);

        stmt.execute();

        System.out.println("livro incluido com sucesso!");


    }
}
