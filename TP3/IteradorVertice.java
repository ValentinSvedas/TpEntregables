package tp3;

import java.util.Iterator;

public class IteradorVertice<T> implements Iterator<String> {
    private Iterator<Vertice<T>> it;

    public IteradorVertice(Iterator<Vertice<T>> iteratorVertices) {
        this.it = iteratorVertices;
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public String next() {
        return it.next().getId();
    }
}
