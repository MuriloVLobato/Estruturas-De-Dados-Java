package com.data.Estruturas.Pilhas;

import java.util.PriorityQueue;

public class PilhaPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.offer(30);
        filaPrioridade.offer(10);
        filaPrioridade.offer(20);
        filaPrioridade.offer(5);
        System.out.println(filaPrioridade.poll());
    }
}
