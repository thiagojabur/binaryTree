
public class Principal {

	public static void main(String[] args) {
		

		Node b = new Node("B", new Node("D", null, null),new Node("E", null, null));
		Node raiz = new Node("A", b, null);
		
		BinaryTree arvoreBinariaTeste = new BinaryTree(raiz);
	
		
		
		arvoreBinariaTeste.preOrderPrint(raiz);
	}

}
