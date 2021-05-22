package tp3;

public class Main {
	public static void main(String[] args) {

		GrafoNoDirigido<Integer> ciudades = new GrafoNoDirigido<>();


		ciudades.agregarVertice("Pehuajo",true,true,3,5);
		ciudades.agregarVertice("Ayacucho",false,false,1,2);
		ciudades.agregarVertice("Olavarria",true,false,9,17);
		ciudades.agregarVertice("Rauch",false,true,1,0);
		ciudades.agregarVertice("Bolivar",false,false,7,4);
		ciudades.agregarVertice("Tandil",true,true,2,5);
		ciudades.agregarVertice("Azul",false,true,4,4);
		ciudades.agregarVertice("Mar del plata",true,false,15,12);


		ciudades.agregarArco("Azul", "Bolivar", 100);
		ciudades.agregarArco("Bolivar", "Olavarria", 140);
		ciudades.agregarArco("Tandil", "Olavarria", 130);
		ciudades.agregarArco("Bolivar", "Pehuajo", 70);
		ciudades.agregarArco("Pehuajo", "Ayacucho", 540);
		ciudades.agregarArco("Ayacucho", "Tandil", 70);
		ciudades.agregarArco("Ayacucho", "Rauch", 50);
		ciudades.agregarArco("Rauch", "Tandil", 60);
		ciudades.agregarArco("Rauch", "Olavarria", 210);
		ciudades.agregarArco("Tandil", "Mar del plata", 200);


		findPath Camino1 = new findPath(ciudades, "Azul", "Ayacucho");
		findPath Camino2 = new findPath(ciudades, "Rauch", "Mar del plata");
		findPath Camino3 = new findPath(ciudades, "Mar del plata", "Pehuajo");
		System.out.println(Camino1.encontrarCamino());
		System.out.println(Camino2.encontrarCamino());
		System.out.println(Camino3.encontrarCamino());
		ciudades.borrarVertice("Ayacucho");
		ciudades.borrarArco("Tandil","Rauch");
		findPath Camino4 = new findPath(ciudades, "Mar del plata", "Pehuajo");
		System.out.println(Camino4.encontrarCamino());

		/*
		origen: Azul - destino: Ayacucho
		origen: Rauch - destino: Mar del plata
		origen: Mar del plata - destino: Pehuajo
		eliminar la ciudad Ayacucho.
		eliminar la ruta Tandil - Rauch
		origen: Mar del plata - destino Pehuajo
		 */
	}

}
