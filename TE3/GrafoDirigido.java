package tp3;

import java.util.*;

public class GrafoDirigido<T> implements Grafo<T> {
	private ArrayList<Vertice<T>> listVertices; //clave valor donde clave es String(lugar) valor(adyacentes)


	public GrafoDirigido() {
		listVertices = new ArrayList<>();
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public void agregarVertice(Ciudad ciudad) {
		Vertice vertc = new Vertice(ciudad);
		if (!listVertices.contains(getVertice(ciudad))) {
			listVertices.add(vertc);
		}

	}

	//Complejidad: O(n) n->cantidadDeArcos
	@Override
	public void borrarVertice(Ciudad ciudad) {
		Iterator<Ciudad> it = obtenerAdyacentes(ciudad);
		while (it.hasNext()) {
			this.borrarArco(ciudad, it.next());
		}
		listVertices.remove(getVertice(ciudad));
	}

	//Complejidad: O(n + O(2)) n->cantidadDeVertices
	@Override
	public void agregarArco(Ciudad c1, Ciudad c2, T etiqueta) {
		if (Objects.nonNull(getVertice(c1)) && Objects.nonNull(getVertice(c2))) {
			getVertice(c1).addArco(c2, etiqueta);
		}
	}

	//Complejidad: O(n) n->cantidadDeVertices
	private Vertice getVertice(Ciudad c) {
		for (int i = 0; listVertices.size() > i; i++) {
			if (listVertices.get(i).getCiudad().equals(c)) {
				return listVertices.get(i);
			}
		}
		return null;
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public void borrarArco(Ciudad c1, Ciudad c2) {
		getVertice(c1).removeArc(c2);
	}

	//Complejidad: O(n + O(2)) n->cantidadDeVertices
	@Override
	public boolean contieneVertice(Ciudad c1) {
		if (Objects.nonNull(getVertice(c1))) {
			return true;
		}
		return false;
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public boolean existeArco(Ciudad c1, Ciudad c2) {
			return getVertice(c1).existeArco(c2);
	}

	// Complejidad: O(n + k) n->cantidadDeVertices k->cantidadDeArcos
	@Override
	public T obtenerArco(Ciudad c1, Ciudad c2) {
		return (T) getVertice(c1).getArco(c2).getEtiqueta();
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
	public Iterator<Ciudad> obtenerVertices() {
		Iterator<Vertice<T>> verticesIT = listVertices.iterator();
		return new IteradorVertice(verticesIT);
	}

	//Complejidad: O(n) n->cantidadDeVertices
	@Override
	public Iterator<Ciudad> obtenerAdyacentes(Ciudad ciudad) {
		Vertice vertice = getVertice(ciudad);
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
	public Iterator<Arco<T>> obtenerArcos(Ciudad ciudad) {
		Iterator aOfVertice = getVertice(ciudad).getArcos().iterator();
		return new IteradorArco(aOfVertice);
	}

}
