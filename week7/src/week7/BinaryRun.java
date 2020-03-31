package week7;

public class BinaryRun {
public static void main(String[] args) {
		
		IntBST myTree = new IntBST();
		
		myTree.insert(13);
		myTree.insert(10);
		myTree.insert(2);
		myTree.insert(12);
		myTree.insert(25);
		myTree.insert(20);
		myTree.insert(31);
		myTree.insert(29);
		
		System.out.println("Breadth First Traversal: ");
		myTree.breadthFirst();
		
		System.out.println("\n\nDepth First Traversal: ");
		myTree.depthFirst();
		
		System.out.println("\nRecursively Searching: ");
		System.out.print(myTree.search(myTree.root, 10).key);
	}
}
