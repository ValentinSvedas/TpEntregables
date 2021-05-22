package TE1.main;

import TE1.lista.DoublyLinkedList;
import TE1.service.serviceEntregable;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        serviceEntregable service = new serviceEntregable();
        DoublyLinkedList lista = new DoublyLinkedList();
        int umbral=0;

        System.out.println("Problema 1 - Umbral: 10");
        umbral=10;
        service.listaInteger(umbral,lista);
        System.out.println("------------------------------------------------");

        System.out.println("Problema 2 - Umbral: 10");
        lista = new DoublyLinkedList();
        lista.insertFront(1);
        lista.insertFront(2);
        lista.insertFront(3);
        service.listaInteger(umbral, lista);
        System.out.println("------------------------------------------------");

        System.out.println("Problema 3 - Umbral: 2");
        lista = new DoublyLinkedList();
        lista.insertFront(1);
        lista.insertFront(2);
        lista.insertFront(3);
        umbral = 2;
        service.listaInteger(umbral, lista);
        System.out.println("------------------------------------------------");

        System.out.println("Problema 4 - Umbral: 10");
        lista = new DoublyLinkedList();
        lista.insertFront(3);
        lista.insertFront(5);
        lista.insertFront(2);
        lista.insertFront(7);
        lista.insertFront(19);
        lista.insertFront(14);
        lista.insertFront(28);
        umbral = 10;
        service.listaInteger(umbral, lista);
        System.out.println("------------------------------------------------");

        System.out.println("Problema 5 - Umbral: 15");
        lista = new DoublyLinkedList();
        lista.insertFront(3);
        lista.insertFront(5);
        lista.insertFront(4);
        lista.insertFront(2);
        lista.insertFront(7);
        lista.insertFront(15);
        lista.insertFront(14);
        lista.insertFront(28);
        umbral = 15;
        service.listaInteger(umbral, lista);

        System.out.println("------------------------------------------------");

        System.out.println("Problema 6 - Umbral: 10");
        umbral=10;
        lista = new DoublyLinkedList();
        lista.insertFront(20);
        lista.insertFront(3);
        lista.insertFront(5);
        service.listaInteger(umbral,lista);
    }
}
