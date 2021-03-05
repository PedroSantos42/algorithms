package main.java;

import main.java.models.BinaryTree;

public class Application {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.add(6);
		tree.add(4);
		tree.add(8);
		tree.add(3);
		tree.add(5);
		tree.add(7);
		tree.add(9);

		System.out.print("Traverse in-order    : ");
		tree.traverseInOrder(tree.root);
		System.out.println("");
		
		System.out.print("Traverse pre-order   : ");
		tree.traversePreOrder(tree.root);
		System.out.println("");
		
		System.out.print("Traverse level-order : ");
		tree.traverseLevelOrder();
	}
}
