 import java.util.Scanner;
public class Menu{
	
	private int operacion;
	private Scanner sc;
	private int alto;
	private int ancho;
	private int tipo;
	private int[] cordenadas;

	public Menu(){
	sc = new Scanner(System.in);
	}

	public int menuFiguras(){
		System.out.println("-------------------------------------");
		System.out.println("-----------------MENU----------------");
		System.out.println("-------------------------------------");

		System.out.println("\t 1.-Cuadrado");
		System.out.println("\t 2.-Triangulo");
		System.out.println("\t 3.-Rectangulo");
		System.out.println("");

		//try{}catch(){}
		operacion = sc.nextInt();
		return operacion;
	}

	public int menuAngulos(){
				  		System.out.println("-------------Que angulo?");
				System.out.println("1.- 45 Grados");
				System.out.println("2.- 180 Grados");
				System.out.println("3.- 90 Grados");

		operacion = sc.nextInt();

		return operacion;

	}

	public int[] menuMover(){

		cordenadas = new int[2];

				  		System.out.println("ESCRIBE LAS CORDENAS");
				System.out.println("CORDENA X: ");
					cordenadas[0] = sc.nextInt();
				System.out.println("CORDENA Y: ");
					cordenadas[1] = sc.nextInt();
				


		return cordenadas;

	}



	public int menuOperacion(){
		System.out.println("-------------------------------------");
		System.out.println("------SELECIONE-UNA-OPERACION--------");
		System.out.println("-------------------------------------");

		System.out.println("\t 1.-Rotar");
		System.out.println("\t 2.-Mover");
		System.out.println("\t 3.-Area");
		System.out.println("");

		//try{}catch(){}
		operacion = sc.nextInt();

		return operacion;

	}


	public  void menuT(int tipo){
		this.tipo = tipo;
		System.out.println("-------------------------------------");
		System.out.println("---------------TAMANIOS---------------");
		System.out.println("-------------------------------------");

		

		//try{}catch(){}
		
		switch(tipo){
		  case 1:
		     System.out.println("\t ¿LADO?");
		     alto = sc.nextInt();
		  break;
		  case 2:
		     System.out.println("\t ¿TAMANIO?");
		     alto = sc.nextInt();
		  break;
		  case 3:
		    System.out.println("\t ¿ALTO?");
		   alto = sc.nextInt();

			
		    System.out.println("\t ¿ANCHO?");
		    ancho = sc.nextInt();
		    //System.out.println("");

		  break;
		  default:
		  //System.out.println("");
		  break;
			}

		

	}




	public void setTipo(int tipo){

	  this.tipo = tipo;
	}

	public int getAncho(){
		return ancho;

	}

		public int getAlto(){

		return alto;
	}


}








//tipo = sc.nextInt(); INT
//sc.nextLine(); string