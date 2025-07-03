package com.data.ExemploDeComplexidade.ArrayELinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayELinked {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long inicioArray = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            arrayList.get(i * 100);
        }
        long fimArray = System.currentTimeMillis();



        long incioLinked = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            linkedList.get(i * 100);
        }
        long finalLinked = System.currentTimeMillis();

        System.out.println("ArrayList - Tempo de acesso: "+(fimArray - inicioArray) +" ms");
        System.out.println("LinkedList - Tempo de acesso: "+(finalLinked - incioLinked) +" ms");

    }
}
