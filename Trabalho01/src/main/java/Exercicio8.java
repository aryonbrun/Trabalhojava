//Fazer um algoritmo que calcule a média aritmética das 3 notas de um aluno
//e mostre, além do valor da média do aluno, uma mensagem de "Aprovado",
//caso a média seja igual ou superior a 7, ou a mensagem "Reprovado", caso
//contrário

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite nota 3: ");
        int nota3 = scanner.nextInt();

         int notafinal = (nota1 + nota2 + nota3) / 3;

         if (notafinal >= 7){
             System.out.println("voce passou!!!");
         } else {
             System.out.println("voce reprovou!!!");
         }
    }
}
