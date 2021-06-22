package resolucion;

import entidad.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Greedy {

    Integer contadorGreedy;

    public ArrayList<ArrayList<Empleado>> resolveGreedy(ArrayList<Empleado> empleados) {
        contadorGreedy=0;
        ArrayList<ArrayList<Empleado>> solucion = new ArrayList();
        ArrayList<Empleado> empleadosGrupo1 = new ArrayList<>();
        empleados.sort(Empleado::compareTo);
        while (!empleados.isEmpty() && es_solucion(empleadosGrupo1, empleados)) {
            Empleado empleadoSeleccionado = seleccionar(empleados);
            empleados.remove(empleadoSeleccionado);
            empleadosGrupo1.add(empleadoSeleccionado);

            contadorGreedy++;
        }
        if (!es_solucion(empleadosGrupo1,empleados)) {
        solucion.add(empleadosGrupo1);
        solucion.add(empleados);
        System.out.println("Cantidad de veces que entro al while: "+contadorGreedy);
        }
        return solucion;
    }
    private boolean es_solucion(ArrayList<Empleado> grupo1, ArrayList<Empleado> empleadosRestantes){
        if (Objects.nonNull(empleadosRestantes)){
            int auxSuma = getFuerzaTrabajo(grupo1)+empleadosRestantes.get(0).getFuerzaDeTrabajo();
            if(auxSuma<getFuerzaTrabajo(empleadosRestantes)){
                return true;
            }else
                return false;
        }else
            return false;
    }
    public Integer getFuerzaTrabajo(List<Empleado> empleados) {
        Integer suma = 0;
        for (Empleado emplado: empleados) {
            suma += emplado.getFuerzaDeTrabajo();
        }
        return suma;
    }
    private Empleado seleccionar(ArrayList<Empleado> empleados){
        if (!empleados.isEmpty()) {
            return empleados.get(0);
        } else return null;
    }

}
