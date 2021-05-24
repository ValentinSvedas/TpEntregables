package tp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class findPath {
	
	private Grafo<?> grafo;
	private HashMap<String, String> colores;
	private String origen;
	private String destino;
	private int kmRecorridos=0;


	public findPath(Grafo<?> grafo, String origen, String destino) {
		this.grafo = grafo;
		this.colores = new HashMap<>();
		this.origen = origen;
		this.destino = destino;
	}


	public ArrayList<String> encontrarCamino() {

		Iterator<String> it = this.grafo.obtenerVertices();
		while (it.hasNext()) {
			String verticeId = it.next();
			colores.put(verticeId, "blanco");
		}
		ArrayList<ArrayList<String>> caminoFinal= encontrarCamino(this.origen,kmRecorridos,0);
		if (kmRecorridos != 0)System.out.println("Kilometros recorridos de "+origen +" a "+destino +": "+ kmRecorridos);
		else System.out.println("Camino no encotrado o con más de 1 balanza");
		return caminoFinal.isEmpty()?null:caminoFinal.get(caminoFinal.size()-1);
	}

	private ArrayList<ArrayList<String>> encontrarCamino(String vertice,int kms,int balanza) {
		ArrayList<ArrayList<String>> resultado = new ArrayList<>();
		colores.put(vertice, "amarillo");
		if ((vertice.equals(this.destino)) && balanza<=1) {//Comprueba que sea el destino y que no se haya pasado con la condicion de balanzas
			if (((kmRecorridos >= kms) || (kmRecorridos ==0))){//Comprueba que no haya más recorridos con menos KMs
			ArrayList<String> unicoCamino = new ArrayList<>();
			unicoCamino.add(vertice);
			resultado.add(unicoCamino);
			kmRecorridos = kms;
			}
		}else {
			Iterator<String> it = this.grafo.obtenerAdyacentes(vertice);
			while (it.hasNext()) { //Mientras tenga adyacentes
				String adyacente = it.next();
				if (colores.get(adyacente).equals("blanco")) {
				kms += this.grafo.obtenerKMs(vertice,adyacente);//Obtiene los km por la etiqueta del arco
				if (this.grafo.isBalanza(vertice)){ if(!vertice.equals(origen)){balanza++;}}//Suma si la ciudad tiene balanza, exepto que sea la ciudad de origen
					ArrayList<ArrayList<String>> caminosParciales = encontrarCamino(adyacente,kms,balanza);
					kms -=this.grafo.obtenerKMs(vertice,adyacente);//Resta los KMs volviendo, así no se acumulan
					if (this.grafo.isBalanza(vertice)){//Resta las balanzas cuando vuelve, así no se acumulan
						balanza--;
					}
					if (kms<=kmRecorridos && !caminosParciales.isEmpty()){
						for (ArrayList<String> caminoParcial: caminosParciales){
							ArrayList<String> caminoCompleto = new ArrayList<>();
							caminoCompleto.add(vertice);
							caminoCompleto.addAll(caminoParcial);
							resultado.add(caminoCompleto);
						}
					}
				}
			}
		}
		colores.put(vertice, "blanco");
		return resultado;
	}

}
