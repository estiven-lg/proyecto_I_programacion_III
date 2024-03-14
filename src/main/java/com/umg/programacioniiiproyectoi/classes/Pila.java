package com.umg.programacioniiiproyectoi.classes;

public class Pila {
	private Node cima;

    public void pushIzquierda(Node nuevoNode) {
        if (cima == null) {
            cima = nuevoNode;
        } else {
            nuevoNode.setLeft(cima);
            cima = nuevoNode;
        }
    }

    public void pushDerecha(Node nuevoNode) {
        if (cima == null) {
            cima = nuevoNode;
        } else {
            nuevoNode.setRight(cima);
            cima = nuevoNode;
        }
    }
    
    public Node pullIzquierda() {
        if (cima == null) {
            return null;
        } else {
            Node aux = cima;
            cima = cima.getLeft();
            return aux;
        }
    }
    
    public Node pullDerecha() {
        if (cima == null) {
            return null;
        } else {
            Node aux = cima;
            cima = cima.getRight();
            return aux;
        }
    }

    public boolean esVacia() {
        return cima == null;
    }

	public Node getCima() {
		return cima;
	}

	public void setCima(Node cima) {
		this.cima = cima;
	}
}

