public class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}
	
	void preOrderPrint(Node v) {
		if (v == null) //condição de saida
			return;
		
		//raiz primeiro
		System.out.println(v.getValue() + " ");
		//subarvore esquerda
		preOrderPrint(v.getNodeLeft());		
		//subarvore direita
		preOrderPrint(v.getNodeRight());
	}

	void inOrderPrint() {
		
	}
	
	
	
	void postOrderPrint() {
		
	}
	
	
	
}
