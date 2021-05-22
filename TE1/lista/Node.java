package TE1.lista;

public class Node {
    private Integer info;
    private Node next;
    private Node prev;
    public Node() {
        info = null;
        next = null;
        prev = null;
    }
    public Node(Integer o, Node n, Node p) {
        setInfo(o);
        setNext(n);
        setPrev(p);
    }


    public void setInfo(Integer o) {
        info = o;
    }
    public void setNext(Node n) {
        next = n;
    }
    public void setPrev(Node n) {
        prev = n;
    }
    public Integer getInfo() {
        return info;
    }
    public Node getNext() {
        return next;
    }
    public Node getPrev() {
        return prev;
    }


    @Override
    public String toString() {
        return String.valueOf(getInfo());
    }
}
