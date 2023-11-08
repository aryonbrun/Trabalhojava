//5. Elabore um programa em Java que leia o valor da altura e o raio de uma lata
//de óleo, e então calcule o seu volume, utilizando a fórmula

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Altura:");
        double altura = scanner.nextDouble();

        System.out.println("Digite o Raio:");
        double raio = scanner.nextDouble();

        double volume = 3.14159 * (raio * 2) * altura;

        System.out.println("o volume é: " + volume);
    }
}
