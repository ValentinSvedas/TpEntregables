package TE1.lista;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private TE1.lista.Node cursor;

    public MyIterator(TE1.lista.Node first){
        cursor = first;
    }

    @Override
    public boolean hasNext() {
        return cursor!=null;
    }

    @Override
    public Integer next() {// O(1)
        TE1.lista.Node aux = cursor;
        cursor = cursor.getNext();
        return aux.getInfo();
    }
    public Integer prev(){// O(1)
        TE1.lista.Node aux = cursor;
        cursor = cursor.getPrev();
        return aux.getInfo();
    }
    public Integer getPrev(){ // O(1)
        TE1.lista.Node aux= cursor;
        return aux.getPrev().getInfo();
    }

    public Integer get(){// O(1)
        return cursor.getInfo();
    }//O(1)
    public void move() {
        this.cursor = this.cursor.getNext();
    }//O(1)
}
