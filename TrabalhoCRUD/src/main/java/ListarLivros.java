/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aryon.2974
 */
public class ListarLivros {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM livros";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        ResultSet resultado = stmt.executeQuery(sql);
        // Criar while para percorrer resultado da pesquisa
        while (resultado.next()) {
            
            int autor_id = resultado.getInt("id");
            String titulo = resultado.getString("titulo");
            int ano_publicacao = resultado.getInt("ano_publicacao");
            
            
            System.out.println("id do autor: "+ autor_id + "/" + "nome do titulo: " + titulo + "/" + "ano de publicacao:" + ano_publicacao + " ");

        }
     
        stmt.close();
        System.out.println();
        conexao.close();
    }

}
