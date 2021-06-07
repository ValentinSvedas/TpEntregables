package tp3;

public class GrafoNoDirigido<T> extends GrafoDirigido<T> {

	@Override
	public void agregarArco(Ciudad c1, Ciudad c2, T etiqueta) {
		super.agregarArco(c1, c2, etiqueta);
		super.agregarArco(c2, c1, etiqueta);
	}
	
	@Override
	public void borrarArco(Ciudad c1, Ciudad c2) {
		super.borrarArco(c1, c2);
		super.borrarArco(c2, c1);
	}

}
