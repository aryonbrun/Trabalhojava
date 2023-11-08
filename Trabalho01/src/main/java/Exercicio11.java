// Ler um número e imprimir se ele é igual a 5, a 200, a 400, se está no intervalo
//entre 500 e 1000, inclusive, ou se ele está fora dos escopos anteriores

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o numero: ");
        int num = scanner.nextInt();

        if (num == 5) {
            System.out.println("numero igual a 5");
        } else if (num == 200) {
            System.out.println("numero igual a 200");
        } else if (num == 400) {
            System.out.println("numero igual 400");
        } else if (num >= 500 && num <= 1000){
            System.out.println("numero esta entre eles");
        } else {
            System.out.println("numero fora do escopo");
        }
    }
}
