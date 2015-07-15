/* Algoritmos y Estructuras de Datos
 * Hoja de trabajo #1
 * Clase MiRadio, hace la funcion de Main
 * Diego Valdez, 131094
 * Juan Carlos Tapia, 14133
 * 
 */

import java.util.Scanner;

public class MiRadio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);					//Scanner Object instantiated for user inputs
		Radio miRad = new Radio(100.1,"FM",true);					//Radio Object instantiated as miRad 
		BotonAmFm amFm = new BotonAmFm();							//BotonAmFm Object instantiated as amFm to change from AM to FM
		BotonEstado encAp = new BotonEstado();						//This object allows to shut down 
		BotonMas botSub = new BotonMas(true);						//this object allows to change between upper frecuencies
		BotonMas botBaj = new BotonMas(false);						//This object allows to change between sub frecuencies
		BotonFavoritos bot1 = new BotonFavoritos(96.5,"FM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot2 = new BotonFavoritos(96.5,"FM");		//Favorite Button, allows store or go to 1 preset station+frecuency	
		BotonFavoritos bot3 = new BotonFavoritos(96.5,"FM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot4 = new BotonFavoritos(96.5,"FM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot5 = new BotonFavoritos(96.5,"FM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot6 = new BotonFavoritos(96.5,"FM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot7 = new BotonFavoritos(530,"AM");			//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot8 = new BotonFavoritos(530,"AM");			//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot9 = new BotonFavoritos(530,"AM");			//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot10 = new BotonFavoritos(530,"AM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot11 = new BotonFavoritos(530,"AM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		BotonFavoritos bot12 = new BotonFavoritos(530,"AM");		//Favorite Button, allows store or go to 1 preset station+frecuency
		
		while (miRad.getEstado()==true){	//Begining of the user Interface
					
			System.out.println("-----------------------------------------");
			System.out.println("|  ----------- ---- ---- ---- ---- ---  |");
			System.out.println("|  |" + miRad.getEstacion()+ " " + miRad.getFrecuencia() + "| |<<| |>>| |AM/FM| |O|  |");
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
			
			boolean isInteger = teclado.hasNextInt();
			
			if (isInteger){
				int opcion = teclado.nextInt();
				teclado.nextLine();
				switch (opcion){
				case 1:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot1.onClick(miRad);
							break;
						case 2:
							bot1.Hold(miRad);
							break;
						}
					}
					else{
						System.out.println("No es un Valor Valido");
						break;
					}
				case 2:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot2.onClick(miRad);
							break;
						case 2:
							bot2.Hold(miRad);
							break;
						}
					}
					else{
						System.out.println("No es un Valor Valido");
						break;
					}
					break;
				case 3:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot3.onClick(miRad);
							break;
						case 2:
							bot3.Hold(miRad);
							break;
						}
					}
					else{
						System.out.println("No es un Valor Valido");
						break;
					}
				case 4:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot4.onClick(miRad);
							break;
						case 2:
							bot4.Hold(miRad);
							break;
						}
					}
					else{
						System.out.println("No es un Valor Valido");
						break;
					}
				case 5:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot5.onClick(miRad);
							break;
						case 2:
							bot5.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 6:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot6.onClick(miRad);
							break;
						case 2:
							bot6.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 7:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot7.onClick(miRad);
							break;
						case 2:
							bot7.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 8:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot8.onClick(miRad);
							break;
						case 2:
							bot8.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 9:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot9.onClick(miRad);
							break;
						case 2:
							bot9.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 10:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot10.onClick(miRad);
							break;
						case 2:
							bot10.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 11:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot11.onClick(miRad);
							break;
						case 2:
							bot11.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				case 12:
					System.out.println("1. Sintonizar \n2. Guardar nueva estacion");
					if (teclado.hasNextInt()){
						int op = teclado.nextInt();
						teclado.nextLine();
						switch (op){
						case 1:  
							bot12.onClick(miRad);
							break;
						case 2:
							bot12.Hold(miRad);
							break;
						}
					}	
					else {
						System.out.println("No es un Valor Valido");
						break;
					}
				}
			}
			else{
				String opcion1 = teclado.nextLine();
				
				if (opcion1.equals("<<")){
					botBaj.onClick(miRad);
				}
				else if(opcion1.equals(">>")){
					botSub.onClick(miRad);
				}
				else if(opcion1.equals("O")){
					encAp.onClick(miRad);
				}
				else if(opcion1.equals("AM/FM")){
					amFm.onClick(miRad);
				}
				else{
					miRad.setEstado(true);
				}
			}
		}	
	
	teclado.close();
	}
}	


