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

        ArrayList<Empleado> entrada= new ArrayList<>();

        backtracking = new Backtracking();
        entrada.add(empleados.get(0));
        entrada.add(empleados.get(1));
        entrada.add(empleados.get(2));
        entrada.add(empleados.get(3));
        entrada.add(empleados.get(4));
        entrada.add(empleados.get(5));
        System.out.println("Fuerza total entrada 1: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E1 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking = backtracking;
        E1.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(6));
        entrada.add(empleados.get(3));
        entrada.add(empleados.get(7));
        entrada.add(empleados.get(14));
        System.out.println("Fuerza total entrada 2: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E2 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking1 = backtracking;
        E2.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking1.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(18));
        entrada.add(empleados.get(11));
        entrada.add(empleados.get(10));
        entrada.add(empleados.get(12));
        System.out.println("Fuerza total entrada 3: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E3 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking2 = backtracking;
        E3.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking2.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(18));
        entrada.add(empleados.get(17));
        entrada.add(empleados.get(13));
        entrada.add(empleados.get(15));
        System.out.println("Fuerza total entrada 4: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E4 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking3 = backtracking;
        E4.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking3.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(6));
        entrada.add(empleados.get(7));
        entrada.add(empleados.get(19));
        entrada.add(empleados.get(2));
        entrada.add(empleados.get(15));
        System.out.println("Fuerza total entrada 5: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E5 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking4 = backtracking;
        E5.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking4.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(5));
        entrada.add(empleados.get(14));
        entrada.add(empleados.get(16));
        entrada.add(empleados.get(12));
        entrada.add(empleados.get(15));
        entrada.add(empleados.get(9));
        System.out.println("Fuerza total entrada 6: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E6 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking5 = backtracking;
        E6.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking5.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(16));
        entrada.add(empleados.get(1));
        entrada.add(empleados.get(18));
        entrada.add(empleados.get(19));
        entrada.add(empleados.get(3));
        entrada.add(empleados.get(11));
        entrada.add(empleados.get(14));
        System.out.println("Fuerza total entrada 7: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E7 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking6 = backtracking;
        E7.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking6.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
//entrada 7: [ e17, e2, e19, e20, e4, e12, e15 ]
        });
        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.add(empleados.get(11));
        entrada.add(empleados.get(13));
        entrada.add(empleados.get(17));
        entrada.add(empleados.get(5));
        entrada.add(empleados.get(1));
        entrada.add(empleados.get(8));
        entrada.add(empleados.get(9));
        entrada.add(empleados.get(15));
        System.out.println("Fuerza total entrada 8: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E8 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking7 = backtracking;
        E8.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking7.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });

        System.out.println("----------------------------------------");
        backtracking = new Backtracking();
        entrada= new ArrayList<>();
        entrada.addAll(empleados);
        System.out.println("Fuerza total entrada 9: "+ backtracking.getFuerzaTrabajo(entrada));
        ArrayList<ArrayList<Empleado>> E9 = backtracking.resolverBacktracking(entrada);
        Backtracking finalBacktracking8 = backtracking;
        E9.forEach(grupo -> {
            System.out.println("Total fuerza de trabajo del grupo: " + finalBacktracking8.getFuerzaTrabajo(grupo));
            System.out.println("Grupo: "+grupo);
        });
        System.out.println("-------------------FIN MAIN Backtracking---------------------");

    }
}
