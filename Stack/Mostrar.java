
public class Mostrar {
		
	public static void main(String[] args){
		Controlador Con = new Controlador();
		Pila  pi = new Pila();
		String Cadena = Con.crear();
		System.out.println(Cadena);
		
		Con.Imprimir();

		}
	
}
