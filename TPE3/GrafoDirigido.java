package tp3;

import java.util.*;

public class GrafoDirigido<T> implements Grafo<T> {
	private ArrayList<Vertice<T>> listVertices; //clave valor donde clave es String(lugar) valor(adyacentes)


	public GrafoDirigido() {
		listVertices = new ArrayList<>();
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public void agregarVertice(String verticeId, boolean balanza, boolean radares, int estacionesServicio, int talleresMecanicos) {
		Vertice vertc = new Vertice(verticeId, balanza, radares, estacionesServicio, talleresMecanicos);
		if (!listVertices.contains(getVertice(verticeId))) {
			listVertices.add(vertc);
		}

	}

	//Complejidad: O(n) n->cantidadDeArcos
	@Override
	public void borrarVertice(String verticeId) {
		Iterator<String> it = obtenerAdyacentes(verticeId);
		while (it.hasNext()) {
			this.borrarArco(verticeId, it.next());
		}
		listVertices.remove(getVertice(verticeId));
	}

	//Complejidad: O(n + O(2)) n->cantidadDeVertices
	@Override
	public void agregarArco(String verticeId1, String verticeId2, T etiqueta) {
		if (Objects.nonNull(getVertice(verticeId1)) && Objects.nonNull(getVertice(verticeId2))) {
			getVertice(verticeId1).addArco(verticeId2, etiqueta);
		}
	}

	//Complejidad: O(n) n->cantidadDeVertices
	private Vertice getVertice(String vertice) {
		for (int i = 0; listVertices.size() > i; i++) {
			if (listVertices.get(i).getId().equals(vertice)) {
				return listVertices.get(i);
			}
		}
		return null;
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public void borrarArco(String verticeId1, String verticeId2) {
		getVertice(verticeId1).removeArc(verticeId2);
	}

	//Complejidad: O(n + O(2)) n->cantidadDeVertices
	@Override
	public boolean contieneVertice(String verticeId) {
		if (Objects.nonNull(getVertice(verticeId))) {
			return true;
		}
		return false;
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public boolean existeArco(String verticeId1, String verticeId2) {
			return getVertice(verticeId1).existeArco(verticeId2);
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public Arco<T> obtenerArco(String verticeId1, String verticeId2) {
		return getVertice(verticeId1).getArco(verticeId2);
	}

	//O(1)
	@Override
	public int cantidadVertices() {
		return listVertices.size();
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public int cantidadArcos(){
		int size =0;
		for (Vertice vAux: listVertices){
			size+=vAux.getArcoSize();
		}
		return size;
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public Iterator<String> obtenerVertices() {
		Iterator<Vertice<T>> verticesIT = listVertices.iterator();
		return new IteradorVertice(verticesIT);
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public Iterator<String> obtenerAdyacentes(String verticeId) {//Esta dando error porque le estoy pasando un iterador de string en vez de Vectores
		Vertice vertice = getVertice(verticeId);
		if (Objects.nonNull(vertice)) return vertice.getVertexOfArcs();
		else return Collections.emptyIterator();
	}

	// Complejidad: O(n * k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public Iterator<Arco<T>> obtenerArcos() {
		List arcos = new ArrayList<Arco<T>>();
		for (Vertice v: listVertices){//agarro todos los arcos de todos los vertices
			arcos.add(v.getArcos());
		}
 		Iterator<Arco<T>> arcosIT = arcos.iterator();
		return new IteradorArco(arcosIT);
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public Iterator<Arco<T>> obtenerArcos(String verticeId) {
		Iterator<Arco<T>> aOfVertice = getVertice(verticeId).getArcos().iterator();
		return new IteradorArco(aOfVertice);
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public int obtenerKMs(String verticeId1, String verticeId2){
		return (int) obtenerArco(verticeId1,verticeId2).getEtiqueta();
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public boolean isBalanza(String verticeId1){
		return getVertice(verticeId1).isBalanza();
	}

}
