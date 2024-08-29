import Exercicios.ExerciciosListaUm;
import Exercicios.ExercicioUm;
import Exercicios.ExercicioDois;
import Exercicios.ListaDois.ExercicioDesafio;
import Exercicios.ListaDois.ExercicioBasico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExerciciosListaUm programasListaUm = new ExerciciosListaUm();
        ExercicioUm exercicioUm = new ExercicioUm();
        ExercicioDois exercicioDois = new ExercicioDois();
        ExercicioBasico exercicioBasico = new ExercicioBasico();
        ExercicioDesafio exercicioDesafio = new ExercicioDesafio();
        int escolha;

        do {
            System.out.println("Escolha uma opção (ou 0 para sair):");
            System.out.println("1. Exercicio 1 - Calcular a média de três notas");
            System.out.println("2. Exercicio 2 - Calcular desconto de 15% sobre o valor do produto");
            System.out.println("3. Lista 1 de Exercícios");
            System.out.println("4. Lista 2 de Exercícios");
            System.out.println("0. Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    // Chama o método para calcular a média de três notas
                    exercicioUm.calcularMediaTresNotas();
                    break;

                case 2:
                    // Chama o método para calcular o desconto de 15%
                    exercicioDois.calcularDesconto();
                    break;

                case 3:
                    // Menu da Lista 1 de Exercícios
                    int escolhaLista1;

                    do {
                        System.out.println("Escolha o programa da Lista 1 de Exercícios (ou 0 para voltar):");
                        System.out.println("1. Determinar se um número é par ou ímpar");
                        System.out.println("2. Imprimir o maior de dois números");
                        System.out.println("3. Verificar se uma letra é vogal ou consoante");
                        System.out.println("4. Calcular a média de um aluno");
                        System.out.println("5. Mostrar o maior de três números");
                        System.out.println("6. Informar turno de estudo");
                        System.out.println("7. Investigação de crime");
                        System.out.println("0. Voltar");
                        escolhaLista1 = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolhaLista1) {
                            case 1:
                                System.out.println("Digite um número inteiro:");
                                int num1 = scanner.nextInt();
                                scanner.nextLine();
                                programasListaUm.parOuImpar(num1);
                                break;
                            case 2:
                                System.out.println("Digite o primeiro número:");
                                int numero1 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o segundo número:");
                                int numero2 = scanner.nextInt();
                                scanner.nextLine();
                                programasListaUm.maiorDeDoisNumeros(numero1, numero2);
                                break;
                            case 3:
                                System.out.println("Digite uma letra:");
                                char letra = scanner.next().charAt(0);
                                scanner.nextLine();
                                programasListaUm.vogalOuConsoante(letra);
                                break;
                            case 4:
                                System.out.println("Digite a primeira nota:");
                                double notaAluno1 = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.println("Digite a segunda nota:");
                                double notaAluno2 = scanner.nextDouble();
                                scanner.nextLine();
                                programasListaUm.mediaAluno(notaAluno1, notaAluno2);
                                break;
                            case 5:
                                System.out.println("Digite o primeiro número:");
                                int n1 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o segundo número:");
                                int n2 = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("Digite o terceiro número:");
                                int n3 = scanner.nextInt();
                                scanner.nextLine();
                                programasListaUm.maiorDeTresNumeros(n1, n2, n3);
                                break;
                            case 6:
                                System.out.println("Digite o turno que você estuda (M/V/N):");
                                char turno = scanner.next().charAt(0);
                                scanner.nextLine();
                                programasListaUm.turnoEstudo(turno);
                                break;
                            case 7:
                                programasListaUm.investigacaoCrime();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (escolhaLista1 != 0);
                    break;

                case 4:
                    // Menu da Lista 2 de Exercícios
                    int escolhaLista2;

                    do {
                        System.out.println("Escolha o programa da Lista 2 de Exercícios (ou 0 para voltar):");
                        System.out.println("1. Mostrar números de 0 a 100");
                        System.out.println("2. Mostrar números de 0 até N");
                        System.out.println("3. Realizar contas de adição");
                        System.out.println("4. Série de Fibonacci até 500");
                        System.out.println("5. Determinar menor, maior e soma dos valores");
                        System.out.println("6. Determinar menor, maior e soma dos valores (0 a 1000)");
                        System.out.println("7. Validar informações do usuário");
                        System.out.println("8. Verificar se um número é primo");
                        System.out.println("0. Voltar");
                        escolhaLista2 = scanner.nextInt();
                        scanner.nextLine();

                        switch (escolhaLista2) {
                            case 1:
                                exercicioBasico.mostrarNumeros0a100();
                                break;
                            case 2:
                                System.out.println("Digite o limite N:");
                                int limite = scanner.nextInt();
                                scanner.nextLine();
                                exercicioBasico.mostrarAteN(limite);
                                break;
                            case 3:
                                exercicioBasico.contasAdicao();
                                break;
                            case 4:
                                exercicioDesafio.serieFibonacci();
                                break;
                            case 5:
                                System.out.println("Digite a quantidade de números:");
                                int quantidade = scanner.nextInt();
                                scanner.nextLine();
                                List<Integer> numeros = new ArrayList<>();
                                for (int i = 0; i < quantidade; i++) {
                                    System.out.println("Digite um número:");
                                    numeros.add(scanner.nextInt());
                                    scanner.nextLine();
                                }
                                exercicioDesafio.valoresConjunto(numeros);
                                break;
                            case 6:
                                System.out.println("Digite a quantidade de números:");
                                int quantidadeValidacao = scanner.nextInt();
                                scanner.nextLine();
                                List<Integer> numerosValidos = new ArrayList<>();
                                for (int i = 0; i < quantidadeValidacao; i++) {
                                    System.out.println("Digite um número (0 a 1000):");
                                    numerosValidos.add(scanner.nextInt());
                                    scanner.nextLine();
                                }
                                exercicioDesafio.valoresConjuntoValido(numerosValidos);
                                break;
                            case 7:
                                exercicioDesafio.validarInformacoes();
                                break;
                            case 8:
                                exercicioDesafio.verificarNumeroPrimo();
                                break;
                            case 0:
                                System.out.println("Voltando ao menu principal...");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    } while (escolhaLista2 != 0);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
