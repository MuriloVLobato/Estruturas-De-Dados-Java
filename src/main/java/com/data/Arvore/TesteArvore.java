package com.data.Arvore;

public class TesteArvore {
    public static void main(String[] args) {

        Arvore arvore = new Arvore(new Folha(20));
        arvore.inserir(new Folha(3));
        arvore.inserir(new Folha(21));
        arvore.inserir(new Folha(31));
        arvore.inserir(new Folha(8));
        arvore.inserir(new Folha(1));
        arvore.inserir(new Folha(0));
        arvore.inserir(new Folha(7));
        arvore.inserir(new Folha(30));
        arvore.inserir(new Folha(40));


        //Exemplo da arovre.
//               20
//             /    \
//            /      \
//           /        \
//          3          21
//         / \           \
//        /   \           \
//       1     8           31
//      /     /           /  \
//     /     /           /    \
//    0     7           30     40
    }
}
