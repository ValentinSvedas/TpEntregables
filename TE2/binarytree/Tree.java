package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Tree {
    private Node root;

    public Tree(int arr[]){
        addArbol(arr);
    }

    public void addArbol(int arr[]) { //O(n^2) ya que tiene que hacer el recorrido del arreglo más el add al arbol. siendo n en el peor de los casos el tamaño del array
        for(int i=0; i < arr.length;i++){
            add(arr[i]);
        }
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
    public boolean findHasElem(int value) {
        return hasElem(getRoot(), value);
    }
    public void printPreOrder() {
        printPreorder(getRoot());
    }
    public int getHeight(){return getHeight(this.root);}
    public int getMaxElem(){return getMaxElem(this.root);}
    public List longestBranch(){
        List aux = longestBranch(this.root);
        return  aux;}
    public List getElemAtLevel(int value){return getElemAtLevel(value,this.root,0);}
    public List getFrontera(){return getFrontera(this.root);}
    public boolean gethasElem(int v){
        return hasElem(this.root, v);
    }

    /*
        Complejidad: 0(n)
        Siendo n en el peor de los casos la cantidad de nodos que se tendrá que pasar para añadir el nodo, dependiendo de la altura del arbol
     */
    private Node addRecursive(Node current, int value) {
        if (Objects.isNull(current)) {
            return new Node(value);
        }
        if (value < current.getValue()) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.getValue()) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }
    /*
        Complejidad: 0(n)
        Siendo n en el peor de los casos la cantidad de nodos en el arbol a imprimir
     */
    private void printPreorder(Node node) {
        if (node == null) {
            System.out.print("-" + " ");
            return;
        }
        System.out.print(node.value + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    /*
           Complejidad: 0(n)
           Siendo n en el peor de los casos la cantidad de nodos en el arbol a imprimir
        */
    private void printInorder(Node node)
    {
        if (node == null){
            System.out.print("-" + " ");
            return;
        }
        printPostorder(node.left);
        System.out.print(node.value+ " ");
        printPostorder(node.right);
    }
    /*
           Complejidad: 0(n)
           Siendo n en el peor de los casos la cantidad de nodos en el arbol a imprimir
        */
    private void printPostorder(Node node)
    {
        if (node == null){
            System.out.print("-" + " ");
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.value + " ");
    }

    /*
        Complejidad: 0(1)
     */
    public Node getRoot() {
        Node n = this.root;
        return n;
    }
    /*
        Complejidad: O(log n)
        Siendo n en el peor de los casos el nodo encontrado estará al final del arbol y tendrémos que pasar por todos los nodos
     */
    private boolean hasElem(Node n, int value) {
        if (Objects.isNull(n)) {
            return false;
        } else if (Objects.equals(value, n.getValue())) {
            return true;
        } else {
            if (value < n.getValue()){
            return hasElem(n.getLeft(), value);
            }else if(value > n.getValue()){
            return hasElem(n.getRight(), value);
            }else{
                return false;
            }
        }
    }


    //O(1)
    private boolean isEmpty() {
        if (Objects.isNull(getRoot())) return true;
        else return false;
    }

    /*
        Complejidad: O(log n)
        En el peor de los casos el nodo a eliminar estará al final del arbol
     */
    public boolean deleteNode(int nValue) {
        Node n = new Node(nValue);
        Node parent = null;
        Node current = root;
        if (Objects.isNull(root)){
            return false;
        }
        if (Objects.equals(root.getValue(),nValue)){
            root=null;
            return true;
        }
        while (!Objects.isNull(current) && !(current.getValue() == n.getValue())) { //Busca el nodo con el valor pasado por parametro
            parent = current;
            if (n.getValue() < current.getValue()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        if (Objects.isNull(current) ) { //No se encontro el nodo a borrar
            return false;
        }

        if (Objects.isNull(current.getRight()) && Objects.isNull(current.getLeft())) {// Primer caso que no tenga nodos hijos el nodo a eliminar
            if (Objects.equals(parent.getLeft(), current)) {//Si el padre es igual al current lo setea en null
                parent.setLeft(null);
            } else if (Objects.equals(parent.getRight(), current)) {
                parent.setRight(null);
            }
            return true;
        } else if (Objects.nonNull(current.getLeft()) && Objects.nonNull(current.getRight())) {// 3° caso: tiene 2 nodos hijos
            Node nmisd = current.getRight();
            while (nmisd.getLeft() != null) {//buscar el nodo mas izquierdo del subarbol derecho
                nmisd = nmisd.getLeft();
            }
            int value = nmisd.getValue();
            deleteNode(nmisd.getValue());
            current.setValue(value);
            return true;
        } else {//2° caso: tiene 1 nodo hijos
            Node child;
            if (Objects.nonNull(current.getLeft())) {
                child = current.getLeft();
            } else {
                child = current.getRight();
            }

            if (!current.equals(root)) {
                if (current.equals(parent.getLeft())) {
                    parent.setLeft(child);
                } else {
                    parent.setRight(child);
                }
            } else {
                root = child;
            }
            return true;
        }
    }

    /*
            Complejidad: O(n)
            En el peor de los casos se pasaran por todos los nodos para obtener la altura total del arbol
            estando la rama mas larga a la derecha del arbol
        */
    private int getHeight(Node n){
        if(Objects.isNull(n)){
            return 0;
        }else{
            return (1+Math.max(getHeight(n.getLeft()), getHeight(n.getRight())));
        }
    }

    /*
        Complejidad: O(n)
        Siendo la hoja más derecha del arbol la rama más larga
     */
    private List<Integer> longestBranch(Node n){
            ArrayList<Integer> response = new ArrayList<Integer>();
            if (Objects.isNull(n.getLeft()) && Objects.isNull(n.getRight())) {
                response.add(n.getValue());
            } else {
                int hijoDerecho = 0;
                int hijoIzquierdo = 0;
                if (n.getRight() != null)
                    hijoDerecho = getHeight(n.getRight())+1;
                if (n.getLeft() != null)
                    hijoIzquierdo = getHeight(n.getLeft())+1;

                if (hijoDerecho > hijoIzquierdo) {
                    response.add(n.getValue());
                    response.addAll(longestBranch(n.getRight()));
                } else {
                    response.add(n.getValue());
                    response.addAll(longestBranch(n.getLeft()));
                }
            }
            return response;


    }
    /*
        Complejidad: O(n)
        Siendo n la cantidad de nodos a pasar para obtener todos los nodos que pertenezcan a la frotera,
        la cantidad de nodos equivale a la altura del arbol, es decir que la frontera depende de la altura del arbol
     */
    private List getFrontera(Node n){
        List listFrontera = new ArrayList();
        if (Objects.isNull(n)){
            List listRetorno = new ArrayList();
            return listRetorno;
        }
        if(Objects.isNull(n.getLeft()) && Objects.isNull(n.getRight())){
            List listRetorno = new ArrayList();
            listRetorno.add(n.getValue());
            return listRetorno;
        }
        listFrontera.addAll(getFrontera(n.getLeft()));
        listFrontera.addAll(getFrontera(n.getRight()));

        return listFrontera;
    }
    /*
        Complejidad: O(h)
        en el peor de los casos el nodo maximo va a estar al final del arbol siendo h la altura del arbol
        teniendo que pasar por todos sus niveles
     */
   private Integer getMaxElem(Node n){
        int aux =0;
        while(Objects.nonNull(n)){
            aux= n.getValue();
          n = n.getRight();
        }
        return aux;
    }

    /*
        Complejidad: O(n)
        Siendo n la cantidad de nodos a pasar para obtener todos los nodos que pertenezcan al nivel indicado,
        la cantidad de nodos depende de el nivel pasado por parametro, siendo en el peor de los casos la altura maxima del arbol
     */
    private List getElemAtLevel(int num,Node n, int nivel){
        List<Integer> listAux = new ArrayList<>();
        if(Objects.isNull(n)){
            return new ArrayList();
        }
        if(num == 0){
            List aux = new ArrayList();
            aux.add(this.root.getValue());
            return aux;
        }
        if(num == nivel){
            List aux = new ArrayList();
            aux.add(n.getValue());
            return aux;
        }
        listAux.addAll(getElemAtLevel(num,n.getLeft(), nivel+1));
        listAux.addAll(getElemAtLevel(num,n.getRight(), nivel+1));

        return listAux;
    }


}
