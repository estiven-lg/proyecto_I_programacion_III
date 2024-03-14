package com.umg.programacioniiiproyectoi.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Node {

    private Node left;
    private Node right;
    private String label;
    private Double value;
    public static Map<String, Double> variables = new HashMap<>();

    public Node(String label) {
        this.label = label.toUpperCase();

        if (Arméctic.isNumeric(label)) {
            this.value = Double.valueOf(label);
            return;
        }

        if (Arméctic.getHierarchy(label) != -1) {
            this.value = null;
            return;
        }

        if (variables.get(this.label) != null) {
            this.value = this.variables.get(this.label);
            return;
        }

        String newValue = "";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingresa un valor numerico para '" + this.label + "'");
            System.out.print(this.label + ":");
            newValue = input.nextLine();

            if (!Arméctic.isNumeric(newValue)) {
                System.out.println("valor no valido");
            }
        } while (!Arméctic.isNumeric(newValue));

        this.value = Double.valueOf(newValue);
        variables.put(this.label, Double.valueOf(newValue));

    }




    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

        public Double getTotalValue() {
        if (Arméctic.getHierarchy(this.getLabel()) != -1) {
            return Arméctic.calculate(this.getLeft().getTotalValue(), this.getRight().getTotalValue(), this.getLabel());
        }
        return this.getValue();
    }
    
    
    public String getPostOrder() {
        String text = "";

        if (this.getLeft() != null) {
            text += this.getLeft().getPostOrder();
        }

        if (this.getRight() != null) {
            text += this.getRight().getPostOrder();
        }

        text += this.getLabel() + ",";
        return text;

    }

    public String getInOrder() {
        String text = "";

        if (this.getLeft() != null) {
            text += this.getLeft().getInOrder();
        }

        text += this.getLabel() + ",";

        if (this.getRight() != null) {
            text += this.getRight().getInOrder();
        }

        return text;

    }

    public String getPreOrder() {
        String text = "";

        text += this.getLabel() + ",";

        if (this.getLeft() != null) {
            text += this.getLeft().getPreOrder();
        }

        if (this.getRight() != null) {
            text += this.getRight().getPreOrder();
        }

        return text;

    }
    


    static public Node createTree(String operation) {
        Stack<Node> tmpStack = new Stack<>();
        String[] listValue = Arméctic.operationToPostfix(operation);
        for (String str : listValue) {
            if (Arméctic.isAlpha(str.charAt(0)) || Arméctic.isNumeric(str)) {
                Node node = new Node(str);
                tmpStack.push(node);
            } else {
                Node node = new Node(str);
                node.setRight(tmpStack.pop());
                node.setLeft(tmpStack.pop());

                tmpStack.push(node);
            }
        }
        return tmpStack.pop();
    }
    
    

}
