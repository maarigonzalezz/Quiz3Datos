public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        // Insertar los mismos elementos en ambas estructuras
        int n = 10000; // Número de elementos

        // Insertar elementos en la lista enlazada
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        long linkedListInsertTime = System.nanoTime() - startTime;

        // Insertar elementos en el árbol binario de búsqueda
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            binarySearchTree.insert(i);
        }
        long binarySearchTreeInsertTime = System.nanoTime() - startTime;

        // Realizar búsqueda en la lista enlazada y medir el tiempo
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.contains(i);
        }
        long linkedListSearchTime = System.nanoTime() - startTime;

        // Realizar búsqueda en el árbol binario de búsqueda y medir el tiempo
        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            binarySearchTree.search(i);
        }
        long binarySearchTreeSearchTime = System.nanoTime() - startTime;

        // Imprimir los tiempos de ejecución
        System.out.println("Tiempo de inserción en lista enlazada: " + linkedListInsertTime + " ns");
        System.out.println("Tiempo de inserción en árbol binario de búsqueda: " + binarySearchTreeInsertTime + " ns");
        System.out.println("Tiempo de búsqueda en lista enlazada: " + linkedListSearchTime + " ns");
        System.out.println("Tiempo de búsqueda en árbol binario de búsqueda: " + binarySearchTreeSearchTime + " ns");
    }
}