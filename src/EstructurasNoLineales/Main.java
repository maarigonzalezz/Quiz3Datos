package EstructurasNoLineales;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        //En Orden
        System.out.println("ENORDEN:  ");
        arbol.dispararEnOrden();
        System.out.println(" ");
        //Post Orden
        System.out.println("POSTORDEN:  ");
        arbol.dispararPostOrden();
        System.out.println(" ");
        // Pre Orden
        System.out.println("PREORDEN:  ");
        arbol.dispararPreorden();
    }
}