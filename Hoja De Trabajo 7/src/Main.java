import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller ArbolBinario;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese Palabra");
		String PALABRA = teclado.nextLine();
		
		ArbolBinario = new Controller(PALABRA);
		
/*		ArbolBinario.PrintLetters();
		
		System.out.println("The first element is: " );
		ArbolBinario.printFirst();
		System.out.println("\n \n \n \n \n \n " );*/
		
		
		
		ArbolBinario.setReferencedTree();
		
		ArbolBinario.setCode();
		
		ArbolBinario.PrintLetters();
		
		ArbolBinario.printTree();
		
		System.out.println("El tamaño del Arbol es: " + ArbolBinario.getFullTree().getAll().size());
		
		
		
		
				
		teclado.close();
		
	}

}
