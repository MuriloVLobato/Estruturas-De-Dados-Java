package com.data.Estruturas.Hash;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {
    public static void main(String[] args) {

        Set<String> nomes = new HashSet<>();
        nomes.add("Anna");
        nomes.add("Heloise");
        nomes.add("Thor");
        nomes.add("Matthew");
        System.out.println(nomes.size());

    }
}
