
public class BotonMas implements IntBoton {

	public boolean tipo;
	
	
	
	public BotonMas(boolean tipo) {
		this.tipo = tipo;
	}


	public void onClick(Radio rad) {
		if (tipo==true){
			switch (rad.getEstacion()){
			case "FM":
				if (rad.getFrecuencia()==107.9){
					rad.setFrecuencia(87.9);
				
				}
				else{
					rad.setFrecuencia(rad.getFrecuencia()+0.2);	
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
