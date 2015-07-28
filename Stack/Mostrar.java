/* Algoritmos y Estructuras de Datos
 * Hoja de trabajo #2
 * Clase Controlador
 * Diego Valdez, 131094
 * Patrick Ordoñez
 * 
 */	
public class Mostrar {
		
	public static void main(String[] args){
		Controlador Con = new Controlador();
		Pila  pi = new Pila();
		String Cadena = Con.crear();
		System.out.println(Cadena);
		
		Con.Imprimir();

		}
	
}
