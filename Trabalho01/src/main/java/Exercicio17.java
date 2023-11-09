// Ler vários números e informar quantos números entre 100 e 200 foram
//digitados. Quando o valor 0 (zero) for lido, o algoritmo deverá cessar sua
//execução.

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int num;
        do {
            System.out.println("digite o numero");
            num = scanner.nextInt();

            if (num >=100 && num <=200) {
                contador++;
            }
        } while (num != 0);

        System.out.println(contador);
    }
}
