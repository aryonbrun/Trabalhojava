public class APSPROVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManipulacaoUsuarios manipulacaoUsuarios = new ManipulacaoUsuarios();
          
        // Questão 1: Inserir novo usuário. Verificar se o nome não é nulo nem uma string vazia e se a idade não é nula e é maior que zero.
        manipulacaoUsuarios.inserirUsuario("João", 0,"palmeiras" );;
        manipulacaoUsuarios.inserirUsuario("guilherme", 32,"santos");
        manipulacaoUsuarios.inserirUsuario("digao", 25,"bahia");
         manipulacaoUsuarios.inserirUsuario("NULL", 10,"bahia");
       
        // Questão 2: Listar todos os usuários
          manipulacaoUsuarios.listarUsuarios();

        // Questão 3: Atualizar idade do usuário pelo ID. Verificar se o ID e a idade não são nulos e são maiores que zero.
//          manipulacaoUsuarios.atualizarIdadeUsuario(0, 20);



        // Questão 4: Remover usuário pelo ID. Verificar se o ID não é nulo e é maior que zero.
        manipulacaoUsuarios.removerUsuario(0);



        
//        manipulacaoUsuarios.listarUsuarios();
        // Fechar conexão com o banco de dados
        manipulacaoUsuarios.fecharConexao();
    }
}
