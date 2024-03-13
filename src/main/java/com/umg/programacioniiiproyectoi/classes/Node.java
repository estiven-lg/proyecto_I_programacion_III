package com.umg.programacioniiiproyectoi.classes;

import java.util.Stack;

public class Node {

	private Node left;
	private Node right;
	private String label;
	private String value;

	public Node(String value) {
	
	}

	public Node getLeft() {
		return null;
	}

	public void setLeft(Node left) {
	
	}

	public Node getRight() {
		return null;
	}

	public void setRight(Node right) {

	}

	public String getLabel() {
		return null;
	}

	public void setLabel(String label) {
	
	}

	public String getValue() {
		return null;
	}

	public void setValue(String value) {
	
	}


	static public Node createTree(String operation) {
		Stack<Node> tmpStack = new Stack<Node>();
		String[] listValue = Arméctic.operationToPostfix(operation);
		for (String str : Arméctic.operationToPostfix(operation)) {
			if (Arméctic.isAlpha(str.charAt(0)) || Arméctic.isNumeric(str)) {
				Node node = new Node(str);
				tmpStack.push(node);
			}
			else {
				Node node = new Node(str);
				node.setLeft(tmpStack.pop());
				node.setRight(tmpStack.pop());
				tmpStack.push(node);
			}
		}
		return tmpStack.pop();
	}

}
