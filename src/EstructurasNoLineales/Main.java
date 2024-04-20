package EstructurasNoLineales;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Arbol binarySearchTree = new Arbol();

        // Insertar los mismos elementos en ambas estructuras
        int n = 10000; // Número de elementos

        // Insertar elementos en la lista enlazada

        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        // Insertar elementos en el árbol binario de búsqueda
        for (int i = 0; i < n; i++) {
            binarySearchTree.insertar(i);
        }

        // Realizar búsqueda en la lista enlazada y medir el tiempo
        System.nanoTime();
        long startTime;
        startTime = System.nanoTime();
        linkedList.contains(9999);
        long linkedListSearchTime = System.nanoTime() - startTime;

        // Realizar búsqueda en el árbol binario de búsqueda y medir el tiempo
        System.nanoTime();
        long starttTime;
        starttTime = System.nanoTime();

        binarySearchTree.search(9999);

        long binarySearchTreeSearchTime = System.nanoTime() - starttTime;

        // Imprimir los tiempos de ejecución

        System.out.println("Tiempo de búsqueda en lista enlazada: " + linkedListSearchTime + " ns");
        System.out.println("Tiempo de búsqueda en árbol binario de búsqueda: " + binarySearchTreeSearchTime + " ns");
    }
}