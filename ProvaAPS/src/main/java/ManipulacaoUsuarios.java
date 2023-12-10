import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ManipulacaoUsuarios {

    private Connection conexao;

    public ManipulacaoUsuarios() {
        try {
            this.conexao = ConexaoBD.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Questão 1: Inserir novo usuário. Verificar se o nome não é nulo nem uma string vazia e se a idade não é nula e é maior que zero.
    public void inserirUsuario(String nome, int idade, String time) {
        String sql = "INSERT INTO usuarios (nome, idade, time) VALUES (?, ?, ?)";

        try {            
            if (nome != null && nome != "" && idade > 0) {
                // Instanciar o prepared statement
                PreparedStatement stmt = conexao.prepareStatement(sql);
                // setar nome na instancia
                stmt.setString(1, nome);
                // setar idade na instancia
                stmt.setInt(2, idade);
                // setar time de futebol
                stmt.setString(3, time);
                // executar
                stmt.execute();
                System.out.println("Adicionado");              
            } else {
                System.err.println("Não adicionado");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Questão 2: Listar todos os usuários do banco de dados
    public void listarUsuarios() {
        String sql = "SELECT * FROM usuarios";
        try {
            // Instanciar statement
            Statement stmt = conexao.createStatement();
            // Instanciar resultset
            ResultSet resultado = stmt.executeQuery(sql);
            // Criar while para percorrer resultado da pesquisa
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                int idade = resultado.getInt("idade");
                String time = resultado.getString("time");
                System.out.println(id + " " + nome + " " + idade + " " + time + " ");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("usuarios listados com sucesso!!!");

    }

    // Questão 3: Atualizar a idade de um usuário pelo seu ID. Verificar se o ID e a idade não são nulos e são maiores que zero.
    public void atualizarIdadeUsuario(int id, int novaIdade) {
        String sql = "UPDATE usuarios SET idade = ? WHERE id = ?";
        try {
            // Instanciar o prepared statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            // setar nome da instancia
            stmt.setInt(1, novaIdade);
            // setar idade na instancia com retorno de linhas afetadas
            stmt.setInt(2, id);
            // if para ver se mais de uma linha foi afetada
            int contador = stmt.executeUpdate();
            if (contador > 0) {
                System.out.println("linha afetada" + contador);
            } else {
                System.out.println("linha nao afetada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (id == 0) {
            System.out.println("id tem que ser maior");
            return;
        }
        if (novaIdade == 0) {
            System.out.println("idade tem que ser maior que 0");
            return;
        } else {
//                    System.out.println("usuario alterado com sucesso");
        }
    }

    // Questão 4: Remover um usuário pelo seu ID. Verificar se o ID não é nulo e é maior que zero.
    public void removerUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try {
            // Instanciar o prepared statement
            PreparedStatement stmt = conexao.prepareStatement(sql);
            // setar ID na instancia
            stmt.setInt(1, id);
            // if para ver se mais de uma linha foi afetada
            int contador = stmt.executeUpdate();

            if (contador > 0) {
                System.out.println("Pessoa excluida com sucesso!");
            } else {
                System.out.println("Nada feito!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (id == 0) {
            System.out.println("id tem que ser maior 0 para exclusao");
            return;
        } else {
            System.out.println("excluido com sucesso");
        }
    }

    // Método para fechar a conexão com o banco de dados
    public void fecharConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão com o banco de dados fechada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
