package com.umg.programacioniiiproyectoi.classes;

import java.util.Stack;

public class Node {

	private Node left;
	private Node right;
	private String label;
	private String value;

	public Node(String value) {
		this.value = value;
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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String toString(Node node, int level, String arrow) {
		String text = "";
		if (node.getLeft() != null) {
			text += toString(node.getLeft(), (level + 1), "->");
		}

		for (int i = 0; i < level * 2; i++) {
			text += " ";
		}
		text += arrow + node.value + "\n";

		if (node.getRight() != null) {
			text += toString(node.getRight(), (level + 1), "->");
		}

		return text;
	}

	@Override
	public String toString() {
		return this.toString(this, 0, "");
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
