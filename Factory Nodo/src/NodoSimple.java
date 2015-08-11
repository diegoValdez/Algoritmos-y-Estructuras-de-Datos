

public class NodoSimple<E> extends Nodo<E> implements INodo<E>{
    
    public NodoSimple(E valor){
        this.Valor = valor;
    }

	@Override
	public void setSiguiente(Nodo<E> nodo) {
		// TODO Auto-generated method stub
		this.Siguiente = nodo;
	}

	@Override
	public Nodo<E> getSiguiente() {
		// TODO Auto-generated method stub
		return Siguiente;
	}
	
	public void setValor(E Valor){
		this.Valor = Valor;
	}

	@Override
	public E getValor() {
		// TODO Auto-generated method stub
		return Valor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Valor.toString();
	}
    

}
