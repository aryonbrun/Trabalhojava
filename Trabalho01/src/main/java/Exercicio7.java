//Faça um algoritmo que receba a idade de uma pessoa e mostre a mensagem
//de maioridade ou não

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("voce ja pode ser preso");
        } else {
            System.out.println("voce e uma criança");
        }
    }
}
