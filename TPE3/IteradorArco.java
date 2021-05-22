package tp3;

import java.util.Iterator;

    public class IteradorArco<T> implements Iterator<String> {

        private Iterator<Arco<T>> it;

        public IteradorArco(Iterator<Arco<T>> iteratorArcos) {
            this.it = iteratorArcos;
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public String next() {
            return it.next().getVerticeDestino();
        }
    }

