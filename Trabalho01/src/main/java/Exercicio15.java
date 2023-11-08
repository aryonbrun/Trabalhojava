// Criar um algoritmo que deixe escolher qual a tabuada de multiplicar que se
//deseja imprimir todos os valores de 1 a 10.


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da tabuada que você deseja imprimir: ");
        int numTabuada = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numTabuada * i;
            System.out.println(numTabuada + " x " + i + " = " + resultado);
        }

    }
}
