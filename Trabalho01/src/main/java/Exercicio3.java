//Elabore um programa em Java que leia a base e a altura de um retângulo e
//apresente o perímetro, a área e a diagonal, dada as fórmulas

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Base:");
        double base = scanner.nextDouble();

        System.out.println("Digite a Altura:");
        double altura = scanner.nextDouble();

        double perimetro = (base * altura) * 2;
        double area = base * altura;
        double diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.print("area: " + area);
        System.out.print("Perimetro: " + perimetro);
        System.out.print("Diagonal: " + diagonal);


        scanner.close();
    }
}
