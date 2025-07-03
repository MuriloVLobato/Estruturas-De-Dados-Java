package com.data.Estruturas.Heap;

import java.util.PriorityQueue;

public class MainTarefa {
    public static void main(String[] args) {

        PriorityQueue<Tarefa> filaTarefa = new PriorityQueue<>();
        filaTarefa.add(new Tarefa("Responder E-mails", 3));
        filaTarefa.add(new Tarefa("Corrigir Bugs", 1));
        filaTarefa.add(new Tarefa("Planejamento Sprint", 2));
        filaTarefa.add(new Tarefa("Subir Git", 5));
        filaTarefa.add(new Tarefa("Documentar", 4));

        System.out.println("Tarefa por ordem de prioridade");
        while (!filaTarefa.isEmpty()){
            System.out.println(filaTarefa.poll());
        }

    }

}
