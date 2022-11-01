
public class Principal {

	public static void main(String[] args) {
		
		Node d = new Node("D", null, null);
		Node e = new Node("E", null, null);
		Node b = new Node("B", d, e);
		Node c = new Node("C", new Node("F", null, null),new Node("G", null, null));
		Node raiz = new Node("A", b, c);
		
		System.out.println("Raiz é externa: " +  raiz.isExternal());
		System.out.println("D é externa: " + d.isExternal());
		BinaryTree arvoreBinariaTeste = new BinaryTree(raiz);
		
		System.out.println("Grau da Raiz: " +  raiz.length());
		System.out.println("Grau do nó E: " +  e.length());
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
