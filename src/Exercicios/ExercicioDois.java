package Exercicios;

import java.util.Scanner;

public class ExercicioDois {

    public void calcularDesconto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        double valorProduto = scanner.nextDouble();

        double desconto = valorProduto * 0.15;
        double valorComDesconto = valorProduto - desconto;

        System.out.printf("O valor total do produto é: %.2f%n", valorProduto);
        System.out.printf("O desconto de 15%% é: %.2f%n", desconto);
        System.out.printf("O valor do produto com desconto é: %.2f%n", valorComDesconto);
    }
}
