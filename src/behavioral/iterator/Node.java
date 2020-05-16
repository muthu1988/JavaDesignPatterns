package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Node<T> {
	public T value;
	public Node<T> left, right, parent;

	public Node(T value) {
		this.value = value;
	}

	public Node(T value, Node<T> left, Node<T> right) {
		this.value = value;
		this.left = left;
		this.right = right;

		left.parent = right.parent = this;
	}

	public Node<T> setLeft(Node<T> left) {
		this.left = left;
		return this;
	}

	public Node<T> setRight(Node<T> right) {
		this.right = right;
		return this;
	}

	private void preOrderTraverse(Node<T> current, ArrayList<Node<T>> acc) {
		acc.add(current);
		if (current.left != null) {
			preOrderTraverse(current.left, acc);
		}
		if (current.right != null) {
			preOrderTraverse(current.right, acc);
		}
	}

	public Iterator<Node<T>> preOrder() {
		ArrayList<Node<T>> items = new ArrayList<>();
		preOrderTraverse(this, items);
		return items.iterator();
	}

	private void inOrderTraverse(Node<T> current, ArrayList<Node<T>> acc) {
		if (current == null)
			return;
		inOrderTraverse(current.left, acc);
		acc.add(current);
		inOrderTraverse(current.right, acc);
	}

	public Iterator<Node<T>> inorder() {
		ArrayList<Node<T>> items = new ArrayList<>();
		inOrderTraverse(this, items);
		return items.iterator();
	}

	public void print(Iterator iterator) {
		for (Iterator iterator2 = iterator; iterator2.hasNext();) {
			Node<Integer> val = (Node) iterator2.next();
			System.out.print("\t" + val.value);
		}
		System.out.println();
	}

}