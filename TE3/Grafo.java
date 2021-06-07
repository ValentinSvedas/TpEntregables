package tp3;

import java.util.Iterator;

public interface Grafo<T> {
	
	// Agrega un vertice 
	public void agregarVertice(Ciudad ciudad);

	// Borra un vertice
	public void borrarVertice(Ciudad ciudad);

	// Agrega un arco con una etiqueta, que conecta el verticeId1 con el verticeId2
	public void agregarArco(Ciudad ciudad, Ciudad ciudad2, T etiqueta);

	// Borra el arco que conecta el verticeId1 con el verticeId2
	public void borrarArco(Ciudad ciudad1, Ciudad ciudad2);

	// Verifica si existe un vertice
	public boolean contieneVertice(Ciudad ciudad);

	// Verifica si existe un arco entre dos vertices
	public boolean existeArco(Ciudad ciudad1, Ciudad ciudad2);

	// Obtener el arco que conecta el verticeId1 con el verticeId2
	public T obtenerArco(Ciudad ciudad1, Ciudad ciudad2);

	// Devuelve la cantidad total de vertices en el grafo
	public int cantidadVertices();

	// Devuelve la cantidad total de arcos en el grafo
	public int cantidadArcos();

	// Obtiene un iterador que me permite recorrer todos los vertices almacenados en el grafo
	public Iterator<Ciudad> obtenerVertices();

	// Obtiene un iterador que me permite recorrer todos los vertices adyacentes a verticeId
	public Iterator<Ciudad> obtenerAdyacentes(Ciudad ciudad);

	// Obtiene un iterador que me permite recorrer todos los arcos del grafo
	public Iterator<Arco<T>> obtenerArcos();

	// Obtiene un iterador que me permite recorrer todos los arcos que parten desde verticeId
	public Iterator<Arco<T>> obtenerArcos(Ciudad ciudad);

	
}
