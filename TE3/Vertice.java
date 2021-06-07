package tp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vertice<T> {

    private Ciudad ciudad;
    private T value;
    private ArrayList<Arco<T>> arcos;


    public Vertice(Ciudad ciudad) {
        this.arcos = new ArrayList<>();
        this.ciudad=ciudad;
    }

    public Vertice(Ciudad ciudad, T value) {
        this.ciudad=ciudad;
        this.value = value;
        this.arcos = new ArrayList<>();
    }
    // Complejidad: O(n) n->cantidadDeArcos
    public void addArco(Ciudad ciudad,T etiqueta) {
        if(!existeArco(ciudad)) {
            arcos.add(new Arco(this.ciudad, ciudad, etiqueta));
        }
    }
    // Complejidad: O(n) n->cantidadDeArcos
    public boolean existeArco(Ciudad ciudadDestino) {
        for(int i = 0; arcos.size() >i; i++){
            if (arcos.get(i).getVerticeDestino().equals(ciudadDestino.getId())){
                return true;
            }
        }
        return false;
    }
    // Complejidad: O(n) n->cantidadDeArcos
    public void removeArc(Ciudad ciudadDestino) {
        Arco arcoAux= new Arco(this.ciudad, ciudadDestino,null);
        for(int i = 0; arcos.size() >i; i++){
            if(arcos.get(i).equals(arcoAux)){
                arcos.remove(i);
            }
        }
    }

    public Ciudad getCiudad(){
        return this.ciudad;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Arco<T>> getArcos() {
        List<Arco<T>> listArcos = arcos;
         return listArcos;
    }

    // Complejidad: O(n) n->cantidadDeArcos
    public Iterator<String> getVertexOfArcs() {
        List arcosD = new ArrayList();
        for (Arco<T> arc: arcos){
            arcosD.add(arc.getVerticeDestino());
        }
        return arcosD.iterator();
    }

    // Complejidad: O(n) n->cantidadDeArcos
    public Arco getArco(Ciudad ciudad) {
        for(int i = 0; arcos.size() >i; i++){
            if (arcos.get(i).getVerticeDestino().equals(ciudad)){
                return arcos.get(i);
            }
        }
        return null;
    }

    public int getEstacionesServicio() {
        return ciudad.getEstacionesServicio();
    }

    public boolean isBalanza() {
        return ciudad.isBalanza();
    }

    public boolean isRadares() {
        return ciudad.isRadares();
    }

    public int getTalleresMecanicos() {
        return ciudad.getTalleresMecanicos();
    }

    public int getArcoSize() {
        return this.arcos.size();
    }

}
