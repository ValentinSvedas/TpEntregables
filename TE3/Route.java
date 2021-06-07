package tp3;

public class Route {
    Grafo ciudades;

    public Route(){
        this.ciudades  = new GrafoNoDirigido<>();
    }

    public void crearGrafo(){

        Ciudad pehuajo = new Ciudad("Pehuajo",true,true,3,5);
        Ciudad ayacucho = new Ciudad("Ayacucho",false,false,1,2);
        Ciudad olavarria = new Ciudad("Olavarria",true,false,9,17);
        Ciudad rauch = new Ciudad("Rauch",false,true,1,0);
        Ciudad bolivar = new Ciudad("Bolivar",false,false,7,4);
        Ciudad tandil = new Ciudad("Tandil",true,true,2,5);
        Ciudad azul = new Ciudad("Azul",false,true,4,4);
        Ciudad mardelplata = new Ciudad("Mar del plata",true,false,15,12);

        ciudades.agregarVertice(pehuajo);
        ciudades.agregarVertice(ayacucho);
        ciudades.agregarVertice(olavarria);
        ciudades.agregarVertice(rauch);
        ciudades.agregarVertice(bolivar);
        ciudades.agregarVertice(tandil);
        ciudades.agregarVertice(azul);
        ciudades.agregarVertice(mardelplata);


        ciudades.agregarArco(azul, bolivar, 100);
        ciudades.agregarArco(bolivar, olavarria, 140);
        ciudades.agregarArco(tandil, olavarria, 130);
        ciudades.agregarArco(bolivar, pehuajo, 70);
        ciudades.agregarArco(pehuajo, ayacucho, 540);
        ciudades.agregarArco(ayacucho, tandil, 70);
        ciudades.agregarArco(ayacucho, rauch, 50);
        ciudades.agregarArco(rauch, tandil, 60);
        ciudades.agregarArco(rauch, olavarria, 210);
        ciudades.agregarArco(tandil, mardelplata, 200);



        findPath Camino1 = new findPath(ciudades, azul, ayacucho);
        findPath Camino2 = new findPath(ciudades, rauch, mardelplata);
        findPath Camino3 = new findPath(ciudades, mardelplata, pehuajo);
        System.out.println(Camino1.encontrarCamino());
        System.out.println(Camino2.encontrarCamino());
        System.out.println(Camino3.encontrarCamino());
        ciudades.borrarVertice(ayacucho);
        ciudades.borrarArco(tandil,rauch);
        findPath Camino4 = new findPath(ciudades, mardelplata, pehuajo);
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
