package com.data.Estruturas.Pilhas;

import java.util.LinkedList;
import java.util.Queue;

public class PilhaQueue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        fila.offer("Cliente 2");
        fila.offer("Cliente 4");
        System.out.println(fila.poll());

    }
}
