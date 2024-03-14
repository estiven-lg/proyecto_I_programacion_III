/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.umg.programacioniiiproyectoi;

import com.umg.programacioniiiproyectoi.classes.Arméctic;
import com.umg.programacioniiiproyectoi.classes.Node;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< HEAD
// rama estiven
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

            } else {
                System.out.println(":D");
            }

        } while (true);

    }
=======

public class ProgramacionIIIProyectoI {

	public static void main(String[] args) {
		System.out.print( Pattern.compile("(?<=[a-zA-Z0-9])[a-zA-Z]|(?<=[a-zA-Z])[a-zA-Z0-9]").matcher("a+45+a").find());
	}
>>>>>>> Melany
}
