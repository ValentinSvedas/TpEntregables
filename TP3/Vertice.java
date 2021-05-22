package tp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vertice<T> {

    private String id;
    private T value;
    private ArrayList<Arco<T>> arcos;
    private int estacionesServicio;
    private int talleresMecanicos;
    private boolean balanza;
    private boolean radares;

    public Vertice(String id,boolean balanza, boolean radares, int estacionesServicio, int talleresMecanicos) {
        this.id = id;
        this.arcos = new ArrayList<>();
        this.balanza = balanza;
        this.radares = radares;
        this.estacionesServicio = estacionesServicio;
        this.talleresMecanicos = talleresMecanicos;
    }

    public Vertice(String id, T value) {
        this.id = id;
        this.value = value;
        this.arcos = new ArrayList<>();
    }
    // Complejidad: O(n) n->cantidadDeArcos
    public void addArco(String vertice,T etiqueta) {
        if(!existeArco(vertice)) {
            arcos.add(new Arco(this.id, vertice, etiqueta));
        }
    }
    // Complejidad: O(n) n->cantidadDeArcos
    public boolean existeArco(String verticeDestino) {
        for(int i = 0; arcos.size() >i; i++){
            if (arcos.get(i).getVerticeDestino().equals(verticeDestino)){
                return true;
            }
        }
        return false;
    }
    // Complejidad: O(n) n->cantidadDeArcos
    public void removeArc(String verticeDestino) {
        Arco arcoAux= new Arco(this.id, verticeDestino,null);
        for(int i = 0; arcos.size() >i; i++){
            if(arcos.get(i).equals(arcoAux)){
                arcos.remove(i);
            }
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public Arco getArco(String verticeId2) {
        for(int i = 0; arcos.size() >i; i++){
            if (arcos.get(i).getVerticeDestino().equals(verticeId2)){
                return arcos.get(i);
            }
        }
        return null;
    }

    public int getEstacionesServicio() {
        return estacionesServicio;
    }

    public boolean isBalanza() {
        return balanza;
    }

    public boolean isRadares() {
        return radares;
    }

    public int getTalleresMecanicos() {
        return talleresMecanicos;
    }

    public int getArcoSize() {
        return this.arcos.size();
    }

}
