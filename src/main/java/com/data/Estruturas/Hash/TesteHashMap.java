package com.data.Estruturas.Hash;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
    public static void main(String[] args) {

        Map<String, Integer> idade = new HashMap<>();
        idade.put("Anna", 33);
        idade.put("Heloise", 24);
        System.out.println(idade.get("Heloise"));

    }
}
