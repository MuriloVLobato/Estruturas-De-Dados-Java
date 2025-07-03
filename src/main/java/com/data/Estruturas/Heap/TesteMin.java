package com.data.Estruturas.Heap;

import java.util.PriorityQueue;

import static java.util.Collections.reverseOrder;

public class TesteMin {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);
        System.out.println(minHeap.poll());


        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(reverseOrder());
        maxHeap.add(40);
        maxHeap.add(50);
        maxHeap.add(200);
        maxHeap.add(60);
        System.out.println(maxHeap.poll());

    }
}
