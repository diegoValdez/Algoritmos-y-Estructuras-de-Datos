/* 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MiRadio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Radio miRad = new Radio(100.1,"FM",true);
		BotonAmFm amFm = new BotonAmFm();
		BotonEstado encAp = new BotonEstado();
		BotonFavoritos bot1 = new BotonFavoritos(96.5,"FM");
		BotonFavoritos bot2 = new BotonFavoritos(96.5,"FM");
		BotonFavoritos bot3 = new BotonFavoritos(96.5,"FM");
		BotonFavoritos bot4 = new BotonFavoritos(96.5,"FM");
		BotonFavoritos bot5 = new BotonFavoritos(96.5,"FM");
		BotonFavoritos bot6 = new BotonFavoritos(96.5,"FM");
		BotonFavoritos bot7 = new BotonFavoritos(530,"AM");
		BotonFavoritos bot8 = new BotonFavoritos(530,"AM");
		BotonFavoritos bot9 = new BotonFavoritos(530,"AM");
		BotonFavoritos bot10 = new BotonFavoritos(530,"AM");
		BotonFavoritos bot11 = new BotonFavoritos(530,"AM");
		BotonFavoritos bot12 = new BotonFavoritos(530,"AM");
		
		while (miRad.getEstado()){
					
			System.out.println("-----------------------------------------");
			System.out.println("|  ----------- ---- ---- ---- ---- ---  |");
			System.out.println("|  |" + miRad.getEstacion()+ " " + miRad.getFrecuencia() + "| |<<| |>>| |AM| |FM| |O|  |");
			System.out.println("|  ----------- ---- ---- ---- ---- ---  |");
			System.out.println("|  ----- ----- ----- ----- ----- -----  |");
			System.out.println("|  | 1 | | 2 | | 3 | | 4 | | 5 | | 6 |  |");
			System.out.println("|  ----- ----- ----- ----- ----- -----  |");
			System.out.println("|  | 7 | | 8 | | 9 | |10 | |11 | |12 |  |");
			System.out.println("|  ----- ----- ----- ----- ----- -----  |");
			System.out.println("-----------------------------------------");
			System.out.println(" ");
			System.out.println("      EL RADIO ESTA AHORA ENCENDIDO      ");
			System.out.println("      --------INSTRUCCIONES--------      ");
			System.out.println("      En el interior de cada | | se      ");
			System.out.println("      observa el valor que se debe       ");
			System.out.println("      ingresar, segun la accion que      ");
			System.out.println("     deseé realizar, por ejemplo  <<     ");
			System.out.println("   este cambiara a la estacion anterior  ");
			
					
			if (teclado.hasNextInt()){
				int opcion = teclado.nextInt();
				switch (opcion){
				case 1:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						switch (op){
						case 1:  
							miRad.setEstacion(bot1.getEstacion());
							miRad.setFrecuencia(bot1.getFrecuencia());
							break;
						case 2:
							bot1.setEstacion(miRad.getEstacion());
							bot1.setFrecuencia(miRad.getFrecuencia());
							break;
						}
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 11:
					break;
				case 12:
					break;
				}
			}
			
			String opcion = teclado.nextLine();
			
			if (opcion.equals("<<")){
				
			}
			else if(opcion.equals(">>")){
							
			}
			else if(opcion.equals("O")){
				
			}
			else {
				
			}
			
		}
	}

}
