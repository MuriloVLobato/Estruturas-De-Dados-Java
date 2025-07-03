# Estruturas de Dados em Java

Este repositório contém uma coleção de exemplos de implementações de várias estruturas de dados e algoritmos em Java.

## Estruturas

### Árvore

* **`Arvore.java`**: Representa uma estrutura de dados de árvore binária de busca. Permite a inserção de novos nós (`Folha`).
* **`Folha.java`**: Representa um nó (folha) na árvore, contendo um valor inteiro.
* **`TesteArvore.java`**: Classe de teste para a `Arvore`, demonstrando a inserção de várias folhas e a estrutura resultante.

### Hash

* **`GerenciadorDeEstoqueSimplesHM/Gerenciador.java`**: Gerencia um inventário de produtos usando um `HashMap` para associar nomes de produtos a quantidades.
* **`GerenciadorDeEstoqueSimplesHM/Main.java`**: Classe principal que interage com o utilizador para gerir o inventário de produtos, utilizando a classe `Gerenciador`.
* **`GerenciadorDeNomeHS/Gerenciador.java`**: Gerencia uma coleção de nomes únicos utilizando um `HashSet`.
* **`GerenciadorDeNomeHS/Main.java`**: Classe principal que permite ao utilizador adicionar, procurar, exibir e remover nomes, utilizando a classe `Gerenciador`.
* **`TesteHashMap.java`**: Demonstra o uso básico do `HashMap` para armazenar pares chave-valor.
* **`TesteHashSet.java`**: Demonstra o uso básico do `HashSet` para armazenar elementos únicos.

### Heap

* **`Tarefa.java`**: Representa uma tarefa com um nome e uma prioridade. Implementa a interface `Comparable` para ser usada numa `PriorityQueue`.
* **`MainTarefa.java`**: Demonstra o uso de uma `PriorityQueue` para ordenar tarefas com base na sua prioridade.
* **`TesteMin.java`**: Demonstra o uso de `PriorityQueue` como um min-heap (ordem natural) e um max-heap (ordem inversa).

### Pilhas

* **`PilhaArray.java`**: Implementa uma estrutura de dados de pilha (stack) usando um array.
* **`PilhaPriorityQueue.java`**: Demonstra o comportamento de uma `PriorityQueue`.
* **`PilhaQueue.java`**: Demonstra o comportamento de uma `Queue` (fila), usando uma `LinkedList`.
* **`PilhaStack.java`**: Demonstra o uso da classe `Stack` do Java.

### Vetor

* **`Vetor.java`**: Implementa um vetor (array dinâmico) que pode aumentar a sua capacidade conforme necessário.
* **`VetorTest.java`**: Classe de teste para a classe `Vetor`.

## Algoritmos

### Dijkstra

* **`AlgoritimoDijkstra.java`**: Implementa o algoritmo de Dijkstra para encontrar o caminho mais curto entre nós num grafo.
* **`TesteDijkstra.java`**: Classe de teste para o `AlgoritimoDijkstra`, simulando um sistema de metro.

### Ordenação

* **`BubbleSort.java`**: Implementa o algoritmo de ordenação Bubble Sort.
* **`MergeSort.java`**: Contém uma implementação do algoritmo Quick Sort, embora o nome do arquivo seja `MergeSort.java`.
* **`QuickSort.java`**: Implementa o algoritmo de ordenação Quick Sort.
* **`SelectionSort.java`**: Implementa o algoritmo de ordenação Selection Sort.

## Exemplos de Complexidade

* **`ArrayELinked/ArrayELinked.java`**: Compara o tempo de acesso a elementos em `ArrayList` e `LinkedList`.
* **`OdeN/VetorLongTest.java`**: Demonstra a complexidade de tempo O(n²) através de loops aninhados que percorrem um array.
* **`OdeUm/HashMapTest.java`**: Demonstra a complexidade de tempo O(1) para aceder a elementos num `HashMap`.

## Aplicação Principal

* **`Application.java`**: A classe principal que inicia a aplicação Spring Boot.
