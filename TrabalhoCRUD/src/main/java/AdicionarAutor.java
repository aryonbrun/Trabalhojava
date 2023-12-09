import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AdicionarAutor {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("informe nome do Autor: ");
        String nome = entrada.nextLine();
        System.out.println("informe a nacionalidade do Autor: ");
        String nacionalidade = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO autores ( nome, nacionalidade) VALUE (?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setString(2, nacionalidade);

        stmt.execute();

        System.out.println("pessoa incluida com sucesso!");


    }
}