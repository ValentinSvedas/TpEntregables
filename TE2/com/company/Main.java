package com.company;


import binarytree.Tree;

public class Main {

    public static void main(String[] args) {
       int[] valoresIniciales = new int[] {15, 4, 1, 25, 50, 6, 7, 20, 5, 30};
        Tree miArbol = new Tree(valoresIniciales);

        miArbol.printPreOrder();
        System.out.println(miArbol.gethasElem(30));
        System.out.println( miArbol.getMaxElem());
        System.out.println( miArbol.getHeight());
        System.out.println( miArbol.longestBranch());
        System.out.println( miArbol.getElemAtLevel(2));
        System.out.println( miArbol.getFrontera());

        miArbol.add(23);
        miArbol.add(3);
        miArbol.deleteNode(6);
        miArbol.deleteNode(30);

        miArbol.printPreOrder();
        System.out.println( miArbol.getMaxElem() );
        System.out.println( miArbol.getHeight() );
        System.out.println( miArbol.longestBranch() );
        System.out.println( miArbol.getElemAtLevel(2) );
        System.out.println( miArbol.getFrontera());

        miArbol.add(65);
        miArbol.deleteNode(5);
        miArbol.deleteNode(15);
        miArbol.add(55);

        miArbol.printPreOrder();
        System.out.println( miArbol.getMaxElem());
        System.out.println( miArbol.getHeight());
        System.out.println( miArbol.longestBranch());
        System.out.println( miArbol.getElemAtLevel(2));
        System.out.println( miArbol.getFrontera());



    }
}
