
public class Principal {

	public static void main(String[] args) {
		

		Node b = new Node("B", new Node("D", null, null),new Node("E", null, null));
		Node c = new Node("C", new Node("F", null, null),new Node("G", null, null));
		Node raiz = new Node("A", b, c);
		
		
		
		BinaryTree arvoreBinariaTeste = new BinaryTree(raiz);
	
		
		System.out.print("Pré ordem: ");
		arvoreBinariaTeste.preOrderPrint(raiz);
		System.out.println("");
		System.out.print("Em ordem: ");
		arvoreBinariaTeste.inOrderPrint(raiz);
		System.out.println("");
		System.out.print("Pós ordem: ");
		arvoreBinariaTeste.postOrderPrint(raiz);
	}

}
