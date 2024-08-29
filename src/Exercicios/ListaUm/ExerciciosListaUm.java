package Exercicios;

import java.util.Scanner;

public class ExerciciosListaUm {

    public void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    public void maiorDeDoisNumeros(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }

    public void vogalOuConsoante(char letra) {
        letra = Character.toLowerCase(letra);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra " + letra + " é uma vogal.");
        } else {
            System.out.println("A letra " + letra + " é uma consoante.");
        }
    }

    public void mediaAluno(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public void maiorDeTresNumeros(int num1, int num2, int num3) {
        int maior = num1;
        if (num2 > maior) maior = num2;
        if (num3 > maior) maior = num3;
        System.out.println("O maior número é: " + maior);
    }

    public void turnoEstudo(char turno) {
        turno = Character.toUpperCase(turno);
        switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }

    public void investigacaoCrime() {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int count = 0;

        for (String pergunta : perguntas) {
            System.out.println(pergunta + " (S/N)");
            char resposta = scanner.next().charAt(0);
            scanner.nextLine();
            if (Character.toUpperCase(resposta) == 'S') {
                count++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }
}