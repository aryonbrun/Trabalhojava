import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RegistrarEmprestimo {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);



        System.out.println("informe o id do livro: ");
        int livro_id = entrada.nextInt();
        entrada.nextLine();

        System.out.println("informe data emprestimo (formato: yyyy-MM-dd): ");
        String data_emprestimo_str = entrada.nextLine();

        System.out.println("informe data devolucao: ");
        String data_devolucao_str = entrada.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date data_emprestimo;
        java.util.Date data_devolucao;

        try {
            data_emprestimo = formatter.parse(data_emprestimo_str);
            data_devolucao =  formatter.parse(data_devolucao_str);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Use o formato yyyy-MM-dd.");
            return;
        }

        Connection conexao = FabricaConexao.getConexao();

        String sql = "INSERT INTO emprestimos ( livro_id, data_emprestimo, data_devolucao) VALUE (?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, livro_id);
        stmt.setString(2, formatter.format(data_emprestimo));
        stmt.setString(3, formatter.format(data_devolucao));

        stmt.execute();

        System.out.println("livro incluido com sucesso!");
        stmt.close();
        conexao.close();
        entrada.close();
    }
}
