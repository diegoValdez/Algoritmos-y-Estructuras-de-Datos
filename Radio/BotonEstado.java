
public class BotonEstado implements IntBoton {

	
	public void onClick(Radio rad) {
		if (rad.getEstado()==true){
			rad.setEstado(false);
		}
	}

	
	public void Hold(Radio rad) {
		
	}

}
