//Criar um algoritmo que imprima a tabela de conversão de graus Celsius-
//Fahrenheit para o intervalo desejado pelo usuário. O algoritmo deve solicitar
//ao usuário o limite superior, o limite inferior do intervalo e o decremento.
//Fórmula de conversão: C = 5 (F – 32) / 9

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite inferior (em Celsius): ");
        double limiteInferior = scanner.nextDouble();

        System.out.print("Digite o limite superior (em Celsius): ");
        double limiteSuperior = scanner.nextDouble();

        System.out.print("Digite o decremento (em Celsius): ");
        double decremento = scanner.nextDouble();

        for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += decremento) {
            double fahrenheit = conversao(celsius);
            System.out.printf("%.2f       |   %.2f\n", celsius, fahrenheit);
        }

        scanner.close();
    }
    private static double conversao(double celsius) {
        return (celsius * (9/5)) + 32;
    }
}
