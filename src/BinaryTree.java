public class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}
	

	public Node getRoot() {
		return root;
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
