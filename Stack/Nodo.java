/* Algoritmos y Estructuras de Datos
 * Hoja de trabajo #2
 * Clase Controlador
 * Diego Valdez, 131094
 * Patrick Ordoñez
 * 
 */	

public class Nodo{
	private String Valor;
	private Nodo Siguiente;

	
	public void Nodo(){
		Valor = "";
		Siguiente = null;
	}
	public Nodo(String valor){
		this.Valor = valor;
		Siguiente = null;
	}
	public Nodo(String valor, Nodo siguiente){
		this.Valor = valor;
		this.Siguiente = siguiente;
	}
	
	public String getValor(){
		return Valor;
	}
	public void setValor(String val){
		this.Valor = val;
	}
	public Nodo getSiguiente(){
		return Siguiente;
	}
	public void setSiguiente(Nodo siguiente){
		this.Siguiente = siguiente;
	}
}