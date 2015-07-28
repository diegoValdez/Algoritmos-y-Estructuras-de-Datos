/* Algoritmos y Estructuras de Datos
 * Hoja de trabajo #2
 * Clase Controlador
 * Diego Valdez, 131094
 * Patrick Ordoñez
 * 
 */	


public class Pila {

	private boolean isEmpty;
	private Nodo cabeza;

	
	public Pila(){
		isEmpty = true;
		cabeza = null;
	}
	
	public void agregar(String valor){
		if(isEmpty){
			cabeza = new Nodo(valor);
			isEmpty = false;
			return;
		}
		Nodo newNodo = new Nodo(valor,cabeza);
		cabeza = newNodo;
	}
	public Nodo getS(){
		Nodo Existe = cabeza;
		return Existe;
	}
	public String consumir(){
		if(isEmpty){
			return "";
		}
		if(cabeza.getSiguiente() == null){
			String valorRegreso = cabeza.getValor();
			cabeza = null;
			isEmpty = true;
			return valorRegreso;
		}
	String valorRegreso = cabeza.getValor();
	cabeza= cabeza.getSiguiente();
	return valorRegreso;
	}
	
}
