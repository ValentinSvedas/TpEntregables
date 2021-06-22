package resolucion;

import entidad.Empleado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class Backtracking {

    private int mejorDiferencia=-1;
    private ArrayList<Empleado> mejorGrupo;
    private ArrayList<Empleado> visitados;
    private ArrayList<Empleado> todosEmpleados;

    public Backtracking(){
        visitados = new ArrayList<>();

    }
    public ArrayList<ArrayList<Empleado>> resolverBacktracking(ArrayList<Empleado> empleados){
        int i =0;
        ArrayList<ArrayList<Empleado>> mejorSolucion = new ArrayList();
        ArrayList<Empleado> g1 = new ArrayList<>();
        todosEmpleados = empleados;
        while (i < todosEmpleados.size()){ // considera todos los empleados
        resolverBacktracking(todosEmpleados.get(i), g1);
        i++;
        }
        g1 = mejorGrupo;
        mejorSolucion.add(g1);
        mejorSolucion.add(findGrupo2(g1));
        return mejorSolucion;
    }


    private void resolverBacktracking(Empleado e, ArrayList<Empleado> solucionG1) {
        ArrayList<Empleado> g2 = findGrupo2(solucionG1);
        int fuerzaGrupoRestate=getFuerzaTrabajo(g2);
        if (es_estado_final(e, solucionG1, fuerzaGrupoRestate)) { //Si esta equitativo
                if(mejor_solucion(fuerzaGrupoRestate, solucionG1)){//Si es la mejor solución
                    operar_solucion(solucionG1);
                }
            } else {
                Iterator<Empleado> it = generarEstado(); // obtengo los empleados
                while (it.hasNext()) { // por cada empleado
                    Empleado siguiente = it.next();
                    if (!visitados.contains(siguiente) && !solucionG1.contains(siguiente)) { // restricción de re-visita
                        solucionG1.add(siguiente);// aplicó cambios lo agrego al grupo1 y lo eliminó de empleado
                        visitados.add(siguiente);
                        resolverBacktracking(siguiente, solucionG1); // Llamar recursivamente
                        solucionG1.remove(siguiente);// deshago los cambios, vuelvo a agregar al empleado en empleados y eliminar de grupo 1
                        }
                    }
                }
        visitados.clear();
    }

    private Iterator<Empleado> generarEstado() {
        ArrayList<Empleado> empleados = todosEmpleados;
        return empleados.iterator();
    }

    private ArrayList<Empleado> findGrupo2(ArrayList<Empleado> mejorGrupo) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.addAll(todosEmpleados);
        empleados.removeAll(mejorGrupo);
        return empleados;
    }

    private boolean es_estado_final(Empleado empleado,ArrayList<Empleado> grupo1, int fG2){
        if (Objects.nonNull(empleado)){
            int auxSuma = getFuerzaTrabajo(grupo1)+empleado.getFuerzaDeTrabajo();
            if(auxSuma>fG2){
                return true;
            }else
                return false;
        }else
            return false;
    }

    private boolean mejor_solucion (int fG2,ArrayList<Empleado> grupo1){
        int fuerzaGrupo1 = getFuerzaTrabajo(grupo1);
        int diferencia = fG2 - fuerzaGrupo1;
        if (diferencia < 0){
            diferencia = fuerzaGrupo1 - fG2;
        }
        if(mejorDiferencia>diferencia || mejorDiferencia == -1){
            mejorDiferencia = diferencia;
            return true;
        }
        return false;
    }

    private void operar_solucion(ArrayList<Empleado> grupo1){
            mejorGrupo = new ArrayList<>();
            mejorGrupo.addAll(grupo1);
    }

   public Integer getFuerzaTrabajo(List<Empleado> empleados) {
        Integer suma = 0;
        for (Empleado emplado: empleados) {
            suma += emplado.getFuerzaDeTrabajo();
        }
        return suma;
    }


}