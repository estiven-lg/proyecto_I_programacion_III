package com.umg.programacioniiiproyectoi;

import com.umg.programacioniiiproyectoi.classes.Arméctic;
import com.umg.programacioniiiproyectoi.classes.Node;
import java.util.Scanner;

public class ProgramacionIIIProyectoI {

    public static void main(String[] args) {

        String operation;
        Scanner input = new Scanner(System.in);
        System.out.println("bienvenido al creador de arboles operacionales :D");

        do {
            System.out.print("ingresa una operacion Matematica:");

            operation = input.nextLine();
            if (Arméctic.evalOperation(operation) != null) {
                System.out.println("Error de sintax D:");
                System.out.println(Arméctic.evalOperation(operation));

            }

        } while (Arméctic.evalOperation(operation) != null);

        Node nodeRoot = Node.createTree(operation);

        // System.out.println("--------------------------------");
        // System.out.println(nodeRoot.toString());
        System.out.println("--------------------------------");

        System.out.println("Pre-Orden:" + nodeRoot.getPreOrder());
        System.out.println("In-Orden:" + nodeRoot.getInOrder());
        System.out.println("Post-Orden:" + nodeRoot.getPostOrder());

        System.out.println("--------------------------------");

        System.out.println(Arméctic.getEvaluatedOperation(operation, Node.variables)+"="+nodeRoot.getTotalValue());
    }

}
