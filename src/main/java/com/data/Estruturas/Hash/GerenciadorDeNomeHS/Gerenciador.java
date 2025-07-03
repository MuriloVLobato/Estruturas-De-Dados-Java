package com.data.Estruturas.Hash.GerenciadorDeNomeHS;

import java.util.HashSet;
import java.util.Scanner;

public class Gerenciador {

    private HashSet<String> hashNomes;

    public Gerenciador() {
        this.hashNomes = new HashSet<>();
    }

    public void adicionarNome(final String nome){
        if (hashNomes.add(nome)) {
            System.out.println("Nome adicionado com sucesso!");
        } else if (nome.equals(nome)) {
            System.out.println("Nome duplicado! Adicione outro");
        }
    }

    public void existeNome(final String nome) {
        if (hashNomes.contains(nome)) {
            System.out.println("O nome está na lista.");
        } else {
            System.out.println("O nome não está na lista.");
        }
    }


    public String removerNome(final String nome) {
        if (hashNomes.remove(nome)) {
            return "Nome removido da lista.";
        } else {
            return "Nome nao encontrado para remover.";
        }
    }

    public void exibirTodosNomes(){
        if (hashNomes.isEmpty()) {
            System.out.println("Lista de nomes vazia.");
        } else {
                for (String s : hashNomes){
                    System.out.println("Nome: "+s);
                }
        }
    }
}
