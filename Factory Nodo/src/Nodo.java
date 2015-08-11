

public abstract class Nodo<E>{
    
	E Valor;
    Nodo<E> Siguiente;           
    
    
    
    public abstract void setSiguiente(Nodo<E> nodo);
    public abstract Nodo<E> getSiguiente();
    public abstract void setValor(E Valor);
    public abstract E getValor();
    public abstract String toString();
    
    
	    
}


