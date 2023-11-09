//Criar um algoritmo que imprima a tabela de conversão de graus Celsius-
//Fahrenheit para o intervalo desejado pelo usuário. O algoritmo deve solicitar
//ao usuário o limite superior, o limite inferior do intervalo e o decremento.
//Fórmula de conversão: C = 5 (F – 32) / 9

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double conversao = (celsius * (9/5)) + 32;

        System.out.print("Valor em Farenheit: " + conversao);

        scanner.close();
    }
}
