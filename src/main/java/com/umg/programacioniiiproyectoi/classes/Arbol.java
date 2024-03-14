package com.umg.programacioniiiproyectoi.classes;

public class Arbol extends Node{
	private Pila PilaNodes = new Pila();

    public Arbol(String value) {
        super(value);
    }

    public void agregar(String value) {
    	Node nuevoNode = new Node(value);
        if (PilaNodes.esVacia()) {
            PilaNodes.pushIzquierda(nuevoNode);
        } else {
        	Node NodeActual = PilaNodes.getCima();
            if (value != NodeActual.getValue()) {
                NodeActual.setLeft(nuevoNode);
                PilaNodes.pushIzquierda(nuevoNode);
            } else {
                NodeActual.setRight(nuevoNode);
                PilaNodes.pushDerecha(nuevoNode);
            }
        }
    }

    public void eliminar(String value) {
        if (PilaNodes.esVacia()) {
            return;
        }
        Node NodeActual = PilaNodes.getCima();
        if (value == NodeActual.getValue()) {
            PilaNodes.pullIzquierda();
            if (!PilaNodes.esVacia()) {
                NodeActual = PilaNodes.getCima();
                if (NodeActual.getLeft() != null) {
                    PilaNodes.pushIzquierda(NodeActual.getLeft());
                } else if (NodeActual.getRight() != null) {
                    PilaNodes.pushDerecha(NodeActual.getRight());
                }
            }
        } else if (value != NodeActual.getValue()) {
        	delete(value, NodeActual.getLeft());
        } else {
        	delete(value, NodeActual.getRight());
        }
    }

    private void delete(String value, Node Node) {
        if (Node == null) {
            return;
        }
        if (value == Node.getValue()) {
            PilaNodes.esVacia();
            if (Node.getLeft() != null) {
                PilaNodes.pushIzquierda(Node.getLeft());
            } else if (Node.getRight() != null) {
                PilaNodes.pushDerecha(Node.getRight());
            }
        } else if (value != Node.getValue()) {
        	delete(value, Node.getLeft());
        } else {
        	delete(value, Node.getRight());
        }
    }
}
