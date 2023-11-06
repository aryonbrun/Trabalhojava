//Elabore um programa em Java que leia dois valores inteiros e apresente o
//quociente e o resto da divisão entre eles.

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int num1 = scanner.nextInt();

        System.out.println("digite mais um numero");
        int num2 = scanner.nextInt();

        int resultado1 = num1 / num2;
        int resultado2 = num1 % num2;
        System.out.println("resultado 1: " + resultado1 + "resultado 2: " + resultado2);

    }
}
