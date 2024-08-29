package Exercicios.ListaDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDesafio {

    public void serieFibonacci() {
        int a = 0, b = 1;
        System.out.print("Série de Fibonacci até 500: ");
        while (a <= 500) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    public void valoresConjunto(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número fornecido.");
            return;
        }

        int menor = numeros.get(0);
        int maior = numeros.get(0);
        int soma = 0;

        for (int num : numeros) {
            if (num < menor) menor = num;
            if (num > maior) maior = num;
            soma += num;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
    }

    public void valoresConjuntoValido(List<Integer> numeros) {
        List<Integer> numerosValidos = new ArrayList<>();
        for (int num : numeros) {
            if (num >= 0 && num <= 1000) {
                numerosValidos.add(num);
            }
        }
        valoresConjunto(numerosValidos);
    }

    public void validarInformacoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome (maior que 3 caracteres):");
        String nome = scanner.nextLine();
        while (nome.length() <= 3) {
            System.out.println("Nome inválido. Digite novamente (maior que 3 caracteres):");
            nome = scanner.nextLine();
        }

        System.out.println("Digite a idade (entre 0 e 150):");
        int idade = scanner.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade inválida. Digite novamente (entre 0 e 150):");
            idade = scanner.nextInt();
        }

        System.out.println("Digite o salário (maior que zero):");
        double salario = scanner.nextDouble();
        while (salario <= 0) {
            System.out.println("Salário inválido. Digite novamente (maior que zero):");
            salario = scanner.nextDouble();
        }

        System.out.println("Digite o sexo (M/F):");
        char sexo = scanner.next().charAt(0);
        while (sexo != 'M' && sexo != 'F') {
            System.out.println("Sexo inválido. Digite novamente (M/F):");
            sexo = scanner.next().charAt(0);
        }

        System.out.println("Digite o estado civil (S/C/V/D):");
        char estadoCivil = scanner.next().charAt(0);
        while (estadoCivil != 'S' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'D') {
            System.out.println("Estado civil inválido. Digite novamente (S/C/V/D):");
            estadoCivil = scanner.next().charAt(0);
        }

        System.out.println("Informações validadas com sucesso!");
    }

    public void verificarNumeroPrimo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
            return;
        }

        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
