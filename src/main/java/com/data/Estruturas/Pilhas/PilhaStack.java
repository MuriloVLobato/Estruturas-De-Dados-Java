package com.data.Estruturas.Pilhas;

import java.util.Stack;

public class PilhaStack {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();
        stack.push("Pagina 1");
        stack.push("Pagina 2");
        stack.push("Pagina 3");
        stack.push("Pagina 4");
        stack.push("Pagina 5");

        System.out.println(stack.pop());


    }
}
