package com.data.AlgoritmoDeDijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class TesteDijkstra {

    private static final int S1 = 0;
    private static final int S2 = 1;
    private static final int S3 = 2;
    private static final int S4 = 3;
    private static final int S5 = 4;
    private static final int S6 = 5;
    private static final int S7 = 6;
    private static final int S8 = 7;
    private static final int S9 = 8;
    private static final int S10 = 9;
    private static final int S11 = 10;
    private static final int S12 = 11;
    private static final int S13 = 12;
    private static final int S14 = 13;
    private static final int S15 = 14;
    private static final int S16 = 15;
    private static final int S17 = 16;
    private static final int S18 = 17;
    private static final int S19 = 18;
    private static final int S20 = 19;

    private static final String[] ESTACOES = {
            "1 - Union Station", "\n2 - Dupont Circle", "\n3 - National Mall", "\n4 - Casa Branca",
            "\n5 - Capitólio", "\n6 - Lincoln Memorial", "\n7 - Smithsonian Castle", "\n8 - Museu do Ar e Espaço",
            "\n9 - Museu de História Natural", "\n10 - Gallery Place-Chinatown", "\n11 - Aeroporto Nacional Reagan",
            "\n12 - L'Enfant Plaza", "\n13 - Pentágono", "\n14 - Cemitério de Arlington", "\n15 - Georgetown",
            "\n16 - U Street", "\n17 - Navy Yard", "\n18 - Judiciary Square", "\n19 - Metro Center", "\n20 - Aeroporto Internacional Dulles"
    };


    public static void main(String[] args) {

        AlgoritimoDijkstra dijkstra = new AlgoritimoDijkstra(20);

        //linha vermelha
        dijkstra.criarAresta(S1, S2, 16);
        dijkstra.criarAresta(S2, S3, 14);
        dijkstra.criarAresta(S3, S4, 12);
        dijkstra.criarAresta(S4, S5, 12);
        dijkstra.criarAresta(S5, S6, 14);

        // Linha verde
        dijkstra.criarAresta(S7, S8, 15);
        dijkstra.criarAresta(S8, S9, 11);
        dijkstra.criarAresta(S9, S10, 13);
        dijkstra.criarAresta(S10, S11, 16);
        dijkstra.criarAresta(S11, S6, 15);

        // Linha Amarela
        dijkstra.criarAresta(S12, S8, 11);
        dijkstra.criarAresta(S8, S2, 8);
        dijkstra.criarAresta(S2, S15, 7);
        dijkstra.criarAresta(S15, S16, 7);
        dijkstra.criarAresta(S16, S17, 12);
        dijkstra.criarAresta(S17, S18, 9);

        // Linha Azul
        dijkstra.criarAresta(S12, S9, 17);
        dijkstra.criarAresta(S9, S13, 7);
        dijkstra.criarAresta(S13, S14, 9);
        dijkstra.criarAresta(S14, S5, 9);
        dijkstra.criarAresta(S5, S17, 10);

        // Linha Roxa
        dijkstra.criarAresta(S10, S13, 11);
        dijkstra.criarAresta(S13, S3, 13);
        dijkstra.criarAresta(S3, S16, 11);
        dijkstra.criarAresta(S16, S19, 13);
        dijkstra.criarAresta(S19, S20, 12);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de metrô de Washington, D.C.");
        System.out.println("-------------------------------------------------");
        exibirEstacoes();

        while (true) {

            System.out.println("\n-------------------------------------------------");
            System.out.println("\nPor favor digite o local de origem");
            int origem = lerEstacao("Origem", scanner);
            System.out.println("\nPor favor digite o local de destino");
            int destino = lerEstacao("Destino", scanner);

            for (Integer estacao : dijkstra.caminhoMinimo(origem, destino)) {
                System.out.print((estacao+1) +" --> ");
            }

            System.out.println("FIm da rota");

        }
    }

    public static int lerEstacao(String mensagem, Scanner in) {
        System.out.print(mensagem + ": ");
        while (!in.hasNextInt()) {
            System.out.print("Entrada inválida. Digite um número inteiro para " + mensagem + ": ");
            in.next();
        }
        return in.nextInt() - 1;
    }

    public static void exibirEstacoes(){
        System.out.printf(Arrays.toString(ESTACOES));
    }

}

