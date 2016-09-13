public class Rectangulo extends Figuras{
	
	private String[][] map;


		public void imprimir(){
		//-----------	IMPRIMIR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		

		   for(int y = 0; y <= map[x].length-1; y++){
		   		

			  	System.out.print(map[x][y]);
			}
			
			  System.out.println("");
			}
//-----------	IMPRIMIR ------------------------------


			

	}

	public void dibujar(int alto, int ancho){


		setAlto(alto);
		setAncho(ancho);

		String[][] dibujo = new String[alto][ancho];


				
		for(int x = 0; x <= dibujo.length-1; x++){
		  	
		   for(int y = 0; y <= dibujo[x].length-1; y++){
				
			  dibujo[x][y] = "x";
			}
			
			  
			}

			map = dibujo;
			//setDibujo(dibujo);


			//---------------------------------


	}

	public void mover(int corX, int corY){

		int alto = getAlto();
		int ancho = getAncho();

		int TaArrayX = 0;
			TaArrayX = ((corX + alto) -  1);

		int TaArrayY = 0;
			TaArrayY = ((corY + ancho) -  1);

		
		map = new String[TaArrayX][TaArrayY];

	

//-----------	RELLENAR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		  	
		   for(int y = 0; y <= map[x].length-1; y++){
		
			  map[x][y] = ".";
			}
			
			  
			}
//-----------	RELLENAR ------------------------------

		for(int x = corX-1; x <= map.length-1; x++){
		  	
		   for(int y = corY-1; y <= map[x].length-1; y++){
		
			  map[x][y] = "x";
			}
			
			  
			}
//-----------	RELLENAR--------------------------------



//-----------	IMPRIMIR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		

		   for(int y = 0; y <= map[x].length-1; y++){
		   		

			  	System.out.print(map[x][y]);
			}
			
			  System.out.println("");
			}
//-----------	IMPRIMIR ------------------------------



	}

	public void calArea(){
		setArea(getAncho()*getAlto());
	}

		public String[][] getMap(){
		return map;
	}

	public void rotar(){
			

		String[][] dibujo = new String[getAncho()][getAlto()];


				
		for(int x = 0; x <= dibujo.length-1; x++){
		  	
		   for(int y = 0; y <= dibujo[x].length-1; y++){
				
			  dibujo[x][y] = "x";
			}
			
			  
			}

			map = dibujo;
	}
}