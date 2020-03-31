package week7;

public class IntBST {
	protected IntBSTNode root;
	protected String infix = "";
	protected String postfix = "";
	protected String prefix = "";
	
	public IntBST() {
		root = null;
	}
	
	protected void visit(IntBSTNode p) {
		System.out.print(p.key + " ");
	}
	
	protected String storeVisit(IntBSTNode p) {
		return(p.key + " ");
	}
	
	public void insert(int el) {
		
		IntBSTNode p = root;
		IntBSTNode prev = null;
		
		while(p != null) {
			prev = p;
			if(p.key < el)
				p = p.right;
			else 
				p = p.left;
		}
		
		if (root == null)
			root = new IntBSTNode(el);
		else if(prev.key < el)
			prev.right = new IntBSTNode(el);
		else
			prev.left = new IntBSTNode(el);
	}
	
	public IntBSTNode search(IntBSTNode p, int el) {
		if(p != null) {
			if(el == p.key)
				return p;
			else if(el < p.key)
				return search(p.left, el);
			else 
				return search(p.right, el);
		}
		
		return null;
	}
	
	public void breadthFirst() {
		Queue queue = new Queue();
		queue.enqueue(root);
		breadthFirst(queue);
	}
	
	private void breadthFirst(Queue queue) {
		
		if(queue.isEmpty()) {
			return;
		}
		 
		IntBSTNode node = (IntBSTNode)queue.dequeue();
		
		visit(node);
		
		if(node.left != null) {
			queue.enqueue(node.left);
		}
		
		if(node.right != null) {
			queue.enqueue(node.right);
		}
		
		breadthFirst(queue);
	}
	
	public void depthFirst() {
		depthFirst(root);
		
		System.out.println("Prefix: " + prefix);
		System.out.println("Infix: " + infix);
		System.out.println("Postfix: " + postfix);
		
		prefix = infix = postfix = "";
	}
	
	private void depthFirst(IntBSTNode node) {
		
		prefix += storeVisit(node);
		
		if(node.left != null) {
			depthFirst(node.left);
		}
		
		infix += storeVisit(node);
		
		if(node.right != null) {
			depthFirst(node.right);
		}
		
		postfix += storeVisit(node);
	}
	
	protected void inOrder(IntBSTNode p) {
		if(p != null) {
			inOrder(p.left);
			visit(p);
			inOrder(p.right);
		}
	}
	
	public void deleteByMerging(int el) {
		
		IntBSTNode tmp, node, p = root, prev = null;
		
		while(p != null && p.key != el) {
			prev = p;
			if(p.key < el)
				p = p.right;
			else
				p = p.left;
		}
		
		node = p;
		
		if(p != null && p.key == el) {
			if(node.right == null)
				node = node.left;
			
			else if(node.left == null)
				node = node.right;
			else {
				tmp = node.left;
				while(tmp.right != null)
					tmp = tmp.right;
				
				tmp.right = node.right;
				node = node.left;
			}
			if(p == root)
				root = node;
			else if(prev.left == p)
				prev.left = node;
			else
				prev.right = node;
		}
		else if(root != null)
			System.out.println("key " + el + " is not in the tree");
		else 
			System.out.println("the tree is empty");
	}
}
