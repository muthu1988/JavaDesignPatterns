package behavioral.iterator;

public class IteratorPattern {
	
	public static void main(String[] args) {
		
		System.out.println("Iterator Pattern - Iterator using Node class");
		System.out.println("Created Binary Tree");
		System.out.println("   1  ");
		System.out.println("  / \\  ");
		System.out.println(" 2   3");
		System.out.println("/ \\ / \\");
		System.out.println("4 5 6 7");
		Node<Integer> binaryTree = new Node<>(1)
				.setLeft(new Node<Integer>(2).setLeft(new Node<Integer>(4)).setRight(new Node<Integer>(5)))
				.setRight(new Node<Integer>(3).setLeft(new Node<Integer>(6)).setRight(new Node<Integer>(7)));
		System.out.println("Tree traversal - Inorder");
		binaryTree.print(binaryTree.inorder());
		System.out.println("Tree traversal - Preorder");
		binaryTree.print(binaryTree.preOrder());
	}

}
