package com.umg.programacioniiiproyectoi.classes;

import java.util.Collections;
import java.util.Stack;

public class Arméctic {

	public static boolean isAlpha(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}

	/**
	 * @param str - numero en texto
	 * @return true si es un numero . false si no lo es
	 */
	public static boolean isNumeric(String str) {
		try {
			Double.valueOf(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * @param c caracter a evaluar
	 * @return retorna la jeracquia de un operador o operando , en tal caso de no
	 *         ser un signo matematico retorna -1
	 */
	public static int getHierarchy(String c) {
		return switch (c) {
		case "^" -> 3;
		case "/", "*" -> 2;
		case "+", "-" -> 1;
		default -> -1;
		};
	}

	/**
	 * @param c caracter a evaluar
	 * @return retorna la jeracquia de un operador o operando , en tal caso de no
	 *         ser un signo matematico retorna -1
	 */
	public static int getHierarchy(char c) {
		return switch (c) {
		case '^' -> 3;
		case '/', '*' -> 2;
		case '+', '-' -> 1;
		default -> -1;
		};
	}

	/**
	 * @param s operacion matematica
	 * @return String como notacion polaca
	 */
	public static String[] operationToPostfix(String s) {
		String[] infixOperation = Arméctic.operationToArray(s);
		Stack<String> postfixOperation = new Stack<String>();
		Stack<String> stack = new Stack<String>();

//        Collections.addAll(stack, infixOperation);
		for (int i = 0; i < infixOperation.length; i++) {
			String c = infixOperation[i];

			// si el caracter es una variable o un numero agregarlo al texto resultado
			if (isAlpha(c.charAt(0)) || isNumeric(c)) {
				postfixOperation.push(c);
			} // si el caracter es un ‘(‘, colocarlo en el stack.
			else if (c.charAt(0) == '(') {
				stack.push(c);
			} // si el caracter es un ‘)’, sacar de la pila un character y colocarlo en el
				// texto resultado
				// hasta encontrar un ‘(‘
			else if (c.charAt(0) == ')') {
				while (!stack.isEmpty() && stack.peek().charAt(0) != '(') {
					postfixOperation.push(stack.pop());
				}
				stack.pop();
			} // si el caracter es un operando
			else {
				while (!stack.isEmpty() && (getHierarchy(s.charAt(i)) <= getHierarchy(stack.peek()))
						&& (s.charAt(i) != '^')) {
					postfixOperation.push(stack.pop());

				}
				stack.push(c);
			}
		}

		// Pop all the remaining elements from the stack
		while (!stack.isEmpty()) {
			postfixOperation.push(stack.pop());

		}

		return (String[]) postfixOperation.toArray(String[]::new);
	}

	/**
	 *
	 * @param operation operacion en texto para separar los caracteres de los
	 *                  digitos
	 * @return lista de operadores, digitos y variables
	 */
	public static String[] operationToArray(String operation) {
		// (?<=[-+*/^]) el previo caracter es un operador
		// (?=[-+*/^]) el siguiente caracter no es un operador
		// (?<=[a-zA-z]) el previo caracter es una variable
		// (?=[a-zA-z]) el siguiente caracter no es una variable
		return operation.split("(?<=[-+*/^])|(?=[-+*/^])|(?=[a-zA-z])|(?<=[a-zA-z])");
	}

	static boolean evalOperation(String operation) {
		if ((operation.length() - operation.replace("(", "").length()) == operation.length()
				- operation.replace(")", "").length()) {
			return false;
		}

		if (!operation.matches("^[a-zA-Z0-9()+*\\-/^]*$")) {
			return false;
		}

		if (operation.matches("^[*/^].*|[-+*/^]$")) {
			return false;
		}

		return true;
	}
}
