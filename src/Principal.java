
public class Principal {
	public static void main(String[] args) {
		//código de árvore 
		Node d = new Node("D", null, new Node("T", null,null));
		Node e = new Node("E", null, null);
		Node h = new Node("H", null,null);
		Node b = new Node("B", d, e);
		Node c = new Node("C", new Node("F", null, null),new Node("G",h , null));
		Node raiz = new Node("A", b, c);
		
		System.out.println("Raiz é externa: " +  raiz.isExternal());
		System.out.println("Nó D é externo: " + d.isExternal());
		BinaryTree arvoreBinariaTeste = new BinaryTree(raiz);
		
		System.out.println("Grau da Raiz: " +  arvoreBinariaTeste.getRoot().length());
		System.out.println("Grau do nó E: " +  e.length());
		System.out.print("Pré ordem: ");
		arvoreBinariaTeste.preOrderPrint(raiz);
		System.out.println("");
		System.out.print("Em ordem: ");
		arvoreBinariaTeste.inOrderPrint(raiz);
		System.out.println("");
		System.out.print("Pós ordem: ");
		arvoreBinariaTeste.postOrderPrint(raiz);
		System.out.println("");
		System.out.println("É estritamente binária: ");
		System.out.print(arvoreBinariaTeste.isStrictBinaryTree(raiz));
		System.out.println("");
		System.out.println("Quantidade de nós: ");
		System.out.println(arvoreBinariaTeste.findNodeAmount(raiz));

		System.out.println("Quantidade máxima de níveis (profundidade): ");
		System.out.println(arvoreBinariaTeste.findDepth(raiz));
	
	}

}
