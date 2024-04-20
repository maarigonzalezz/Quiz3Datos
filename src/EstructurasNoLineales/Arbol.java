package EstructurasNoLineales;

public class Arbol {
    NodoArbol inicial;

    public Arbol(){
        this.inicial=null;
    }

    public void insertar(int valor){
        if(this.inicial == null){
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }

    public boolean search(int key) {
        return searchRecursive(inicial, key);
    }

    private boolean searchRecursive(NodoArbol nodo, int key) {
        if (nodo == null || nodo.getValor() == key)
            return nodo != null;

        if (nodo.getValor() < key)
            return searchRecursive(nodo.getNodoDerecho(), key);

        return searchRecursive(nodo.getNodoIzq(), key);
    }

    public void dispararPreorden(){
        this.preorden(this.inicial);
    }

    public void preorden(NodoArbol nodo){
        if(nodo == null){
            return; //Detener recursividad caso base
        } else {
            System.out.print(nodo.getValor()+ ", ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDerecho());
        }
    }

    public void dispararEnOrden(){
        this.EnOrden(this.inicial);
    }

    public void EnOrden(NodoArbol nodo){
        if(nodo == null){
            return; //Detener recursividad caso base
        } else {
            EnOrden(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+ ", ");
            EnOrden(nodo.getNodoDerecho());
        }
    }

    public void dispararPostOrden(){
        this.PostOrden(this.inicial);
    }

    public void PostOrden(NodoArbol nodo){
        if(nodo == null){
            return; //Detener recursividad caso base
        } else {
            PostOrden(nodo.getNodoIzq());
            PostOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+ ", ");
        }
    }
}
