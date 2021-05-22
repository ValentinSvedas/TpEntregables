package TE1.service;

import TE1.lista.MyIterator;
import TE1.lista.DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class serviceEntregable {

    //O(n*n) N = tamaño de TE1.lista
    public void listaInteger(int umbral, DoublyLinkedList listEntrada){
    MyIterator it = listEntrada.iterator();
    System.out.println("Lista de entrada: " + listEntrada);
    System.out.println("Lista de salida: "+ resolucion(umbral, it, listEntrada.size()));;
    }

    //O(n) N = tamaño de TE1.lista
    public DoublyLinkedList  resolucion(int umbral, MyIterator it, int size){// O(n)
        DoublyLinkedList DLLSalida = new DoublyLinkedList();
        int suma =0;
        if(size>0){
        it.prev();
        for (int i = 0; i<size ; i++) {
            suma+=it.get();
            if (Objects.equals(i,size-1) && suma<umbral){
                DLLSalida.insertFront(suma);
                break;
            }
            if((suma <= umbral) && ((suma + it.getPrev())>umbral)){
                DLLSalida.insertFront(suma);
                suma=0;
            }else if(suma > umbral){
                suma=0;
            }
            it.prev();
        }
        }
        return DLLSalida;
    }

}
