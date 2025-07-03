package com.data.Estruturas.Vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(final int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(final String elemento) throws Exception {
        aumentaCapacidade();
        if (tamanho < elementos.length){
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public void aumentaCapacidade() {
        if (tamanho == elementos.length) {
            String[] elementosNovos = new String[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

}
