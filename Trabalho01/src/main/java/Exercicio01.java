//  Ler nome, endereço e telefone e imprimi-los. Utilizar String para
//  desenvolvimento do exercício

import java.util.Scanner;
public class Exercicio01
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome");
        String nome = scanner.nextLine();

        System.out.println("digite o endereço");
        String endereco = scanner.nextLine();

        System.out.println("digite o telefone");
        String telefone = scanner.nextLine();

        System.out.println("nome: " + nome);
        System.out.println("endereco: " + endereco);
        System.out.println("telefone: " + telefone);
    }

}
