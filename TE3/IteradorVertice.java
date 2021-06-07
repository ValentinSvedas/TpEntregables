package tp3;

import java.util.Iterator;

public class IteradorVertice<T> implements Iterator<Ciudad> {
    private Iterator<Vertice<T>> it;

    public IteradorVertice(Iterator<Vertice<T>> iteratorVertices) {
        this.it = iteratorVertices;
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Ciudad next() {
        return it.next().getCiudad();
    }
}
