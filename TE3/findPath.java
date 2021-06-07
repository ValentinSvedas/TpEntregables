package tp3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class findPath {
	
	private Grafo<?> grafo;
	private HashMap<Ciudad, String> colores;
	private Ciudad origen;
	private Ciudad destino;
	private int kmRecorridos=0;


	public findPath(Grafo<?> grafo, Ciudad cOrigen, Ciudad cDestino) {
		this.grafo = grafo;
		this.colores = new HashMap<>();
		this.origen = cOrigen;
		this.destino = cDestino;
	}


	public ArrayList<String> encontrarCamino() {

		Iterator<Ciudad> it = this.grafo.obtenerVertices();
		while (it.hasNext()) {
			Ciudad verticeId = it.next();
			colores.put(verticeId, "blanco");
		}
		ArrayList<ArrayList<String>> caminoFinal= encontrarCamino(this.origen,kmRecorridos,0);
		if (kmRecorridos != 0)System.out.println("Kilometros recorridos de "+origen +" a "+destino +": "+ kmRecorridos);
		else System.out.println("Camino no encotrado o con más de 1 balanza");
		return caminoFinal.isEmpty()?null:caminoFinal.get(caminoFinal.size()-1);
	}

	private ArrayList<ArrayList<String>> encontrarCamino(Ciudad ciudad,int kms,int balanza) {
		ArrayList<ArrayList<String>> resultado = new ArrayList<>();
		colores.put(ciudad, "amarillo");
		if ((ciudad.equals(this.destino)) && balanza<=1) {//Comprueba que sea el destino y que no se haya pasado con la condicion de balanzas
			if (((kmRecorridos >= kms) || (kmRecorridos ==0))){//Comprueba que no haya más recorridos con menos KMs
			ArrayList<String> unicoCamino = new ArrayList<>();
			unicoCamino.add(ciudad.getId());
			resultado.add(unicoCamino);
			kmRecorridos = kms;
			}
		}else {
			Iterator<Ciudad> it = this.grafo.obtenerAdyacentes(ciudad);
			while (it.hasNext()) { //Mientras tenga adyacentes
				Ciudad adyacente = it.next();
				if (colores.get(adyacente).equals("blanco")) {
				kms += (Integer) this.grafo.obtenerArco(ciudad,adyacente);//Obtiene los km por la etiqueta del arco
				if (ciudad.isBalanza()){ if(!ciudad.equals(origen)){balanza++;}}//Suma si la ciudad tiene balanza, exepto que sea la ciudad de origen
					ArrayList<ArrayList<String>> caminosParciales = encontrarCamino(adyacente,kms,balanza);
					kms -= (Integer) this.grafo.obtenerArco(ciudad,adyacente);//Resta los KMs volviendo, así no se acumulan
					if (ciudad.isBalanza()){//Resta las balanzas cuando vuelve, así no se acumulan
						balanza--;
					}
					if (kms<=kmRecorridos && !caminosParciales.isEmpty()){
						for (ArrayList<String> caminoParcial: caminosParciales){
							ArrayList<String> caminoCompleto = new ArrayList<>();
							caminoCompleto.add(ciudad.getId());
							caminoCompleto.addAll(caminoParcial);
							resultado.add(caminoCompleto);
						}
					}
				}
			}
		}
		colores.put(ciudad, "blanco");
		return resultado;
	}

}
