package tp3;

import java.util.Iterator;

    public class IteradorArco<T> implements Iterator<Ciudad> {

        private Iterator<Arco<T>> it;

        public IteradorArco(Iterator<Arco<T>> iteratorArcos) {
            this.it = iteratorArcos;
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public Ciudad next() {
            return it.next().getVerticeDestino();
        }
    }

