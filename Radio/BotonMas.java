
public class BotonMas implements IntBoton {
	// Atributos
	public boolean tipo; //True significa que el boton aumenta la frecuencia, False significa que la disminuye.
	
	
	// Constructor
	public BotonMas(boolean tipo) {
		this.tipo = tipo;
	}

	// Atributos
	public void onClick(Radio rad) { // Este atributo cambia la frecuencia cuando se selecciona la opcion de cambiarla.
		if (tipo==true){
			switch (rad.getEstacion()){ // El cambio de frecuencia aumenta dependiendo de AM y FM.
			case "FM":
				if (rad.getFrecuencia()==107.9){  // En ambos casos se revisa si se alcanzo la maxima frecuencia posible
					rad.setFrecuencia(87.9); // Y de ser el caso, se vuelve al inicio
				
				}
				else{
					rad.setFrecuencia(Math.round(rad.getFrecuencia()+0.2));	
				}
				
				break;
			case "AM":
				if (rad.getFrecuencia()==1610){
					rad.setFrecuencia(530);
				
				}
				else{
					rad.setFrecuencia(rad.getFrecuencia()+10);	
				}
			}
		}
		else{
			switch (rad.getEstacion()){
			case "FM":
				if (rad.getFrecuencia()==87.9){
					rad.setFrecuencia(107.9);
				
				}
				else{
					rad.setFrecuencia(rad.getFrecuencia()-0.2);	
				}
				
				break;
			case "AM":
				if (rad.getFrecuencia()==530){
					rad.setFrecuencia(1610);
				
				}
				else{
					rad.setFrecuencia(rad.getFrecuencia()-10);	
				}
			}
		}
		
		
	}


	public void Hold(Radio rad) {
		
	}

	
	
}
