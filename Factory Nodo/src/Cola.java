

public abstract class Cola<E> {
    
	Nodo<E> Cabeza;
    Nodo<E> Actual;
    boolean isEmpty = true;
    
    
     
    
    public abstract void setFirst(Nodo<E> nodoNuevo);
    // Post: Inserta un valor nuevo en la cabeza y el siguiente del siguiete apunta a, null (simplelist)
    // null (DoubleList) y last en (CircularList)
    
    public abstract void setLast(Nodo<E> nodo); 
    // Post: Inserta un valor nuevo en el final y el siguiente apunta a, null (simplelist)
    // null (DoubleList) y Cabeza en (CircularList)
    
    public abstract Nodo<E> Dequeue();
    // Post: obtiene la cabeza del Stack y el siguiente del obtenido se vuelve la cabeza. 
   
        
}