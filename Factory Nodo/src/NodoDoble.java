
public class NodoDoble<E> extends Nodo<E> implements INodo<E> {

	Nodo<E> Anterior;
	
	public NodoDoble(E valor){
		this.Valor = valor;
	}
	
	public void setSiguiente(Nodo<E> nodo){
        this.Siguiente = nodo;
    }
    
    public Nodo<E> getSiguiente(){
        return Siguiente;
    }
    
    public void setAnterior(Nodo<E> nodo){
    	this.Anterior = nodo;
    }
    
    public Nodo<E> getAnterior(){
    	return Anterior;
    }
    
    public E getValor(){
        return Valor;
    }
    
	public  String toString(){
	   
	    return Valor.toString();
	}

	@Override
	public void setValor(E Valor) {
		// TODO Auto-generated method stub
		this.Valor = Valor;
	}
	
	
	
}
