package main;

import resolucion.Greedy;
import datos.DatosEmpleados;
import entidad.Empleado;
import java.util.ArrayList;

public class MainGreedy {
    public static void main(String[] args) {
        Greedy greedy = new Greedy();
        DatosEmpleados dEmpleados = new DatosEmpleados();
        ArrayList<Empleado> empleados = dEmpleados.cargarEmpleados();

        ArrayList<Empleado> Entrada= new ArrayList<>();
        Entrada.add(empleados.get(0));
        Entrada.add(empleados.get(1));
        Entrada.add(empleados.get(2));
        Entrada.add(empleados.get(3));
        Entrada.add(empleados.get(4));
        Entrada.add(empleados.get(5));
        System.out.println("Fuerza total Entrada 1: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> r = greedy.resolveGreedy(Entrada);
        r.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(6));
        Entrada.add(empleados.get(3));
        Entrada.add(empleados.get(7));
        Entrada.add(empleados.get(14));
        System.out.println("Fuerza total Entrada 2: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E2 = greedy.resolveGreedy(Entrada);
        E2.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(18));
        Entrada.add(empleados.get(11));
        Entrada.add(empleados.get(10));
        Entrada.add(empleados.get(12));
        System.out.println("Fuerza total Entrada 3: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E3 = greedy.resolveGreedy(Entrada);
        E3.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(18));
        Entrada.add(empleados.get(17));
        Entrada.add(empleados.get(13));
        Entrada.add(empleados.get(15));
        System.out.println("Fuerza total Entrada 4: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E4 = greedy.resolveGreedy(Entrada);
        E4.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(6));
        Entrada.add(empleados.get(7));
        Entrada.add(empleados.get(19));
        Entrada.add(empleados.get(2));
        Entrada.add(empleados.get(15));
        System.out.println("Fuerza total Entrada 5: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E5 = greedy.resolveGreedy(Entrada);
        E5.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(5));
        Entrada.add(empleados.get(14));
        Entrada.add(empleados.get(16));
        Entrada.add(empleados.get(12));
        Entrada.add(empleados.get(15));
        Entrada.add(empleados.get(9));
        System.out.println("Fuerza total Entrada 6: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E6 = greedy.resolveGreedy(Entrada);
        E6.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(16));
        Entrada.add(empleados.get(1));
        Entrada.add(empleados.get(18));
        Entrada.add(empleados.get(19));
        Entrada.add(empleados.get(3));
        Entrada.add(empleados.get(11));
        Entrada.add(empleados.get(14));
        System.out.println("Fuerza total Entrada 7: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E7 = greedy.resolveGreedy(Entrada);
        E7.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
//Entrada 7: [ e17, e2, e19, e20, e4, e12, e15 ]
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(11));
        Entrada.add(empleados.get(13));
        Entrada.add(empleados.get(17));
        Entrada.add(empleados.get(5));
        Entrada.add(empleados.get(1));
        Entrada.add(empleados.get(8));
        Entrada.add(empleados.get(9));
        Entrada.add(empleados.get(15));
        System.out.println("Fuerza total Entrada 8: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E8 = greedy.resolveGreedy(Entrada);
        E8.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        Entrada= new ArrayList<>();
        Entrada.addAll(empleados);
        System.out.println("Fuerza total Entrada 9: "+ greedy.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E9 = greedy.resolveGreedy(Entrada);
        E9.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + greedy.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");

    }
/*


 */
}
