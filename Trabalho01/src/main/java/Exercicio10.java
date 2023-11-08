//Entrar com 5 números e imprimir o maior e menor (suponha números
//diferentes)


import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE; // Inicializado com o menor valor possível
        int menor = Integer.MAX_VALUE; // Inicializado com o maior valor possível

        for (int i = 0; i < 5; i++) {
            System.out.println("digite um numero: ");
            int num = scanner.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor){
                menor = num;
            }

        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}
