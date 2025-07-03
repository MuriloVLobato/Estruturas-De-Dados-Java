package com.data.Estruturas.Vetor;

public class VetorTest {
    public static void main(String[] args) {

        try {
            Vetor nomes = new Vetor(5);
            nomes.adicionar("Anna");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
