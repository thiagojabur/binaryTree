public class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public Node getRoot() {
		return root;
	}

	public boolean isStrictBinaryTree(Node v) {
		if (v == null) //condição de saida, percorreu a arvore toda e não achou filho único
			return true;
		
		//se achou filho único, ou seja, só um lado é null 
		if ((v.getNodeLeft()== null && v.getNodeRight() != null) 
			||
			(v.getNodeLeft() != null && v.getNodeRight() == null)) {
		    return false;
		}
		
		
		return isStrictBinaryTree(v.getNodeLeft()) &&
			   isStrictBinaryTree(v.getNodeRight());
	
	}
	
	//we need a method to find the amount of nodes in the tree
	public int findNodeAmount (Node tree) {
	    if (tree == null) {
	        return 0;
	    } else {
	        return (findNodeAmount(tree.getNodeRight()) + findNodeAmount(tree.getNodeLeft()) + 1);
	    }
	}

	//we'll need a method to find the amount of depths in the tree
	public int findDepth (Node tree) {
	    if (tree == null) {
	        return 0;
	    } else 
	    	return Math.max(findDepth(tree.getNodeLeft()), 
	    			findDepth(tree.getNodeRight()))+1;
	    
	}
	

	void preOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//raiz primeiro
		System.out.print(v.getValue() + " ");
		//subarvore esquerda
		preOrderPrint(v.getNodeLeft());		
		//subarvore direita
		preOrderPrint(v.getNodeRight());
	}

	void inOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//subarvore esquerda
		inOrderPrint(v.getNodeLeft());		
		//raiz no meio
		System.out.print(v.getValue() + " ");
		//subarvore direita
		inOrderPrint(v.getNodeRight());
	}
	
	
	
	void postOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//subarvore esquerda
		postOrderPrint(v.getNodeLeft());		
		//subarvore direita
		postOrderPrint(v.getNodeRight());
		//raiz por último 
		System.out.print(v.getValue() + " ");
	}
	
	
	
}
