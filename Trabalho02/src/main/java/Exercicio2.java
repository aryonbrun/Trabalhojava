import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        //double numero1 = scanner.nextDouble();
        String numero1 = scanner.nextLine();
        System.out.println("digite o numero 2");

        //double numero2 = scanner.nextDouble();
        String numero2 = scanner.nextLine();

        Calculadora calculadora = new Calculadora();
        try {
            System.out.println(calculadora.divide(numero1, numero2));
        } catch (ArithmeticException  e) {
            throw new ArithmeticException("impossivel dividir por zero");
        } catch ( InputMismatchException e){
            throw new InputMismatchException("ferrou de outra forma");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("qualquer coisa");
        }
    }
}


