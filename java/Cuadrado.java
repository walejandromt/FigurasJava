public class Cuadrado extends Figuras{

	private String[][] map;
	private String[][] dibujo;
	 
	public Cuadrado(){}

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

	public void dibujar(int alto){

		setAlto(alto);

		dibujo = new String[alto][alto];

			
				
		for(int x = 0; x <= dibujo.length-1; x++){
		  	
		   for(int y = 0; y <= dibujo[x].length-1; y++){
				
			  dibujo[x][y] = "x";
			}
			
			  
			}

			map = dibujo;
			//setDibujo(dibujo);

	}


	public void calArea(){
		setArea(getAlto()*getAlto());
	}

	public void mover(int corX, int corY){

		int lado = getAlto();

		int TaArrayX = 0;
			TaArrayX = ((corX + lado) -  1);

		int TaArrayY = 0;
			TaArrayY = ((corY + lado) -  1);

		
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


	public void rotar45(){
		int alto = getAlto();



		int TaArray = 0;
			TaArray = ((alto-1) + alto);

		int middleArray = 0;
			middleArray = ((TaArray - 1) / 2);

		int r = middleArray;
		int m = middleArray;

		map = new String[TaArray][TaArray];

//-----------	RELLENAR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		  	
		   for(int y = 0; y <= map[x].length-1; y++){
		
			  map[x][y] = " ";
			}
			
			  
			}
//-----------	RELLENAR ------------------------------



//-----------	DIBUJAR ------------------------------

		for(int x = 0; x <= map.length-1; x++){



		   	if(x >= middleArray){
			  map[x][r] = "x";
			  map[x][m] = "x";
			  r++;
			  m--;
			}else {
			  map[x][r] = "x";
			  map[x][m] = "x";	
			  m++;
			  r--;			
			}		
			  
			}
//-----------	DIBUJAR ------------------------------



//-----------	IMPRIMIR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		  	
		   for(int y = 0; y <= map[x].length-1; y++){

			  	System.out.print(map[x][y]);
			}
			
			  System.out.println("");
			}
//-----------	IMPRIMIR ------------------------------

	}


	public void rotar(){
		System.out.println(getDibujo());

		map = dibujo;

		//-----------	IMPRIMIR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		  	
		   for(int y = 0; y <= map[x].length-1; y++){

			  	System.out.print(map[x][y]);
			}
			
			  System.out.println("");
			}
//-----------	IMPRIMIR ------------------------------
		
	}


	public String[][] getMap(){
		return map;
	}
}