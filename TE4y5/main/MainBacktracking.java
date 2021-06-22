package main;

import datos.DatosEmpleados;
import entidad.Empleado;
import resolucion.Backtracking;

import java.util.ArrayList;

public class MainBacktracking {
    public static void main(String[] args) {
        Backtracking backtracking;
        DatosEmpleados dEmpleados = new DatosEmpleados();

        ArrayList<Empleado> empleados = dEmpleados.cargarEmpleados();

        ArrayList<Empleado> Entrada= new ArrayList<>();
        backtracking = new Backtracking();
        Entrada.add(empleados.get(0));
        Entrada.add(empleados.get(1));
        Entrada.add(empleados.get(2));
        Entrada.add(empleados.get(3));
        Entrada.add(empleados.get(4));
        Entrada.add(empleados.get(5));
        System.out.println("Fuerza total Entrada 1: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E1 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking = backtracking;
        E1.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(6));
        Entrada.add(empleados.get(3));
        Entrada.add(empleados.get(7));
        Entrada.add(empleados.get(14));
        System.out.println("Fuerza total Entrada 2: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E2 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking1 = backtracking;
        E2.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking1.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(18));
        Entrada.add(empleados.get(11));
        Entrada.add(empleados.get(10));
        Entrada.add(empleados.get(12));
        System.out.println("Fuerza total Entrada 3: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E3 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking2 = backtracking;
        E3.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking2.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(18));
        Entrada.add(empleados.get(17));
        Entrada.add(empleados.get(13));
        Entrada.add(empleados.get(15));
        System.out.println("Fuerza total Entrada 4: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E4 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking3 = backtracking;
        E4.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking3.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(6));
        Entrada.add(empleados.get(7));
        Entrada.add(empleados.get(19));
        Entrada.add(empleados.get(2));
        Entrada.add(empleados.get(15));
        System.out.println("Fuerza total Entrada 5: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E5 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking4 = backtracking;
        E5.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking4.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(5));
        Entrada.add(empleados.get(14));
        Entrada.add(empleados.get(16));
        Entrada.add(empleados.get(12));
        Entrada.add(empleados.get(15));
        Entrada.add(empleados.get(9));
        System.out.println("Fuerza total Entrada 6: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E6 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking5 = backtracking;
        E6.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking5.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(16));
        Entrada.add(empleados.get(1));
        Entrada.add(empleados.get(18));
        Entrada.add(empleados.get(19));
        Entrada.add(empleados.get(3));
        Entrada.add(empleados.get(11));
        Entrada.add(empleados.get(14));
        System.out.println("Fuerza total Entrada 7: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E7 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking6 = backtracking;
        E7.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking6.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
//Entrada 7: [ e17, e2, e19, e20, e4, e12, e15 ]
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.add(empleados.get(11));
        Entrada.add(empleados.get(13));
        Entrada.add(empleados.get(17));
        Entrada.add(empleados.get(5));
        Entrada.add(empleados.get(1));
        Entrada.add(empleados.get(8));
        Entrada.add(empleados.get(9));
        Entrada.add(empleados.get(15));
        System.out.println("Fuerza total Entrada 8: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E8 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking7 = backtracking;
        E8.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking7.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });

        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        Entrada= new ArrayList<>();
        Entrada.addAll(empleados);
        System.out.println("Fuerza total Entrada 9: "+ backtracking.getFuerzaTrabajo(Entrada));
        ArrayList<ArrayList<Empleado>> E9 = backtracking.resolverBacktracking(Entrada);
        Backtracking finalBacktracking8 = backtracking;
        E9.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking8.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("-------------------FIN MAIN Backtracking---------------------");

    }
}
