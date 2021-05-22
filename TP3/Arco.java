package tp3;


/*
 * La clase arco representa un arco del grafo. Contiene un vertice origen, un vertice destino y una etiqueta.
 * Nota: Para poder exponer los arcos fuera del grafo y que nadie los modifique se hizo esta clase inmutable
 * (Inmutable: una vez creado el arco no es posible cambiarle los valores).
 */
public class Arco<T> {

	private String verticeOrigen;
	private String verticeDestino;
	private T etiqueta;

	public Arco(String verticeOrigen, String verticeDestino, T etiqueta) {
		this.verticeOrigen = verticeOrigen;
		this.verticeDestino = verticeDestino;
		this.etiqueta = etiqueta;
	}

	public String getVerticeOrigen() {
		return verticeOrigen;
	}
	
	public String getVerticeDestino() {
		return verticeDestino;
	}

	public T getEtiqueta() {
		return etiqueta;
	}

	@Override
	public boolean equals(Object o){
		Arco a = (Arco) o;
		return a.getVerticeOrigen().equals(this.verticeOrigen) && a.getVerticeDestino().equals(this.getVerticeDestino());
	}

	@Override
	public String toString(){
		return "origen: "+ verticeOrigen + "- con destino: "+ verticeDestino;
	}

}
