//Entrar com nomes enquanto forem diferentes de FIM.

import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
//      String Fim = "";
        String palavrinhaoChaveParaEncerrarAplicacao = "Fim";
        System.out.println("digite nomes e para encerrar digite FIM");

        do {
            System.out.println("nome: ");
            nome = scanner.nextLine();

            if (nome !=  palavrinhaoChaveParaEncerrarAplicacao) {
                System.out.println("nome: " + nome);
            }
        }while (nome != palavrinhaoChaveParaEncerrarAplicacao);


        System.out.println("encerrado");
    }
}
