package TE1.lista;


public class DoublyLinkedList implements Iterable<Integer> {
    protected TE1.lista.Node first;
    protected Node last;
    private int size;

    public DoublyLinkedList() {
        first = null;
        last = null;
        size=0;
    }
    public TE1.lista.MyIterator iterator(){
        return new TE1.lista.MyIterator(first);
    }//O1

    public void insertFront(Integer o) {  //Complejidad O(1)
        TE1.lista.Node tmp = new TE1.lista.Node(o, null, null);
        if (isEmpty()){
            tmp.setNext(tmp);
            tmp.setPrev(tmp);
            first = tmp;
            last = first;
        }else{
            tmp.setPrev(last);//El Nodo nuevo apunta al ultimo nodo
            last.setNext(tmp);//El ultimo apunta al nodo nuevo
            first.setPrev(tmp);
            tmp.setNext(first);
            first = tmp;
        }
        size++;
    }

    public Integer extractFront(){ //Complejidad O(1)
        if (!isEmpty()){
        Integer tmp = first.getInfo();
        first = first.getNext();
        first.setPrev(last);
        last.setNext(first);
        size--;
        return tmp;
        }else return null;
    }

    public boolean isEmpty(){ //Complejidad O(1)
        return size==0;
    }

    public int size(){
        return this.size;
    }

    public Integer get(int index) { //Complejidad O(n) N = tamaño de TE1.lista
        int t = size();
        MyIterator it = iterator();
        for (int i = 0 ; t>0; i++){
           if (it.next().equals(index));
                return it.next();
        }
        return null;
    }
    public void print(int n){ // O(n) n = tamaño maximo de la lista
        if(n<=size && n>0){
            MyIterator it = iterator();
            it.prev();
            for(int i = 0; i<n; i++){
                System.out.println(it.prev());
            }
        }
    }
    @Override
    public String toString() { //Complejidad: O(n) n = cantidad de elementos
        StringBuilder retorno = new StringBuilder();
        retorno.append("[");
        Node current = last;
        Integer aux = size;
        while (aux != 0) {
            retorno.append(current.getInfo());
            current = current.getPrev();
            aux--;
            if (aux != 0) {
                retorno.append(", ");
            }
        }
        retorno.append("]");
        return retorno.toString();
    }

}
