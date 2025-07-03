package com.data.AlgoritmosDeOrdenacao;

public class MergeSort {

    public static void quickSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particionar(arr, inicio, fim);
            quickSort(arr, inicio, posicaoPivo - 1);
            quickSort(arr, posicaoPivo + 1, fim);
        }
    }

    public static int particionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr[j] < pivo) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fim];
        arr[fim] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] numeros = {29, 10, 14, 37, 13};

        System.out.println("Antes da ordenação:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        quickSort(numeros, 0, numeros.length - 1);

        System.out.println("\nDepois da ordenação:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

}
