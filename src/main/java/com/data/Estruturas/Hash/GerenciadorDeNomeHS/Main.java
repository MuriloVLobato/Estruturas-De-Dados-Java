package com.data.Estruturas.Hash.GerenciadorDeNomeHS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gerenciador gerenciadorDeNomes = new Gerenciador();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------Gerenciador De Nomes-------");
            System.out.println("1. Adicionar Nomes.");
            System.out.println("2. Buscar nome.");
            System.out.println("3. Exibir todos os nomes.");
            System.out.println("4. Remover nome.");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("Qual nome deseja adicionar na lista?");
                    System.out.println("---------------------------");
                    String nomeDigitado = scanner.nextLine();
                    gerenciadorDeNomes.adicionarNome(nomeDigitado);
                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("Qual nome deseja verificar se está na lista?");
                    System.out.println("---------------------------");
                    String nomeProcurar = scanner.nextLine();
                    gerenciadorDeNomes.existeNome(nomeProcurar);
                    break;
                case 3:
                    System.out.println("---------------------------");
                    gerenciadorDeNomes.exibirTodosNomes();
                    System.out.println("---------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------");
                    System.out.println("Qual nome deseja remover?");
                    System.out.println("---------------------------");
                    String nomeRemover = scanner.nextLine();
                    System.out.println(gerenciadorDeNomes.removerNome(nomeRemover));
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 0);
        scanner.close();
    }
}
