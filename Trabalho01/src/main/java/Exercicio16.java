//Chico tem 1.50m de altura e cresce 2cm por ano, enquanto Juca tem 1,10m
//e cresce 3cm por ano. Construir um algoritmo que calcule e imprima quantos
//anos serão necessários para que Juca seja maior que Chico

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alturaChico = 1.50;
        double alturajuca = 1.10;

        int anos = 0;

        while (alturajuca <= alturaChico) {
            alturaChico += 0.02;
            alturajuca +=0.03;
            anos++;
        }

        System.out.println("sera: " + anos);
    }
}
