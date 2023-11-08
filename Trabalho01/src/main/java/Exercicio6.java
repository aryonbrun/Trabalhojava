//Ler um número e indicar se ele está ou não entre o intervalo de 20 a 90


import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if (numero >= 20 ) {
            System.out.println("o numero esta certo");
        } else if (numero < 90){
            System.out.println("o numero nao esta ai");
        }
        scanner.close();
    }
}

//professor, eu tinha tentando fazer so com else e nao deu
