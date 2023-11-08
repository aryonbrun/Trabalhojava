//Entrar com um número e imprimir a raiz quadrada do número caso ele seja
//positivo e o quadrado do número caso ele seja negativo.
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();

        if (num >= 0) {
            double raiz = Math.sqrt(num);
            System.out.println("a raiz quadrada é: ");
        } else {
            double quadrado = Math.pow(num, 2);
            System.out.println("quadrado é: ");
        }

    }
}
