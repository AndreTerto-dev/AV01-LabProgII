package Exercicios;

import java.util.Scanner;

public class ExercicioUm {

    public void calcularMediaTresNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das três notas é: %.2f%n", media);
    }
}