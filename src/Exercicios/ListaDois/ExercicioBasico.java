package Exercicios.ListaDois;

import java.util.Scanner;

public class ExercicioBasico {

    public void mostrarNumeros0a100() {
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public void mostrarAteN(int limite) {
        int i = 0;
        while (i <= limite) {
            System.out.println(i);
            i++;
        }
    }

    public void contasAdicao() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite um número:");
            int num1 = scanner.nextInt();
            System.out.println("Digite outro número:");
            int num2 = scanner.nextInt();

            int resultado = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + resultado);

            System.out.println("Deseja realizar mais uma soma? [s/n]");
            char resposta = scanner.next().charAt(0);
            if (Character.toLowerCase(resposta) != 's') {
                continuar = false;
            }
        }
    }
}
