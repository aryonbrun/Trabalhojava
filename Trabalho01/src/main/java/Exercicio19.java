// Entrar com 20 números e imprimir a soma dos positivos e o total de números
//negativos

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        for(int i = 0; i < 20; i++) {
            System.out.println("digite o numero");
            int numero = scanner.nextInt();

            if(numero > 0){
                positivos +=numero;
            } else if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("a soma de positivos" + positivos);
        System.out.println("numero negativos" + negativos);
    }
}
