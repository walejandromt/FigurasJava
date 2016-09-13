public class Triangulo extends Figuras{
	
		private String[][] map;
	private String[][] dibujo;

	public Triangulo(){}

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
		   
        if(alto%2==0){
 
             alto = alto - 1;
        } 

			//dibujo nuevo----------------
		int middleArray = 0;
			middleArray = ((alto - 1) / 2);



		int r = middleArray;
		int m = middleArray;
		int altoM = 0;


		


				int ancho = 0;
					ancho = alto -1;
					ancho = ancho /2;

				dibujo = new String[ancho][alto];
			
		
//-------------------------------------------------------------------
				for(int x = 0; x <= dibujo.length-1; x++){
		  	
		   for(int y = 0; y <= dibujo[x].length-1; y++){
		
			  dibujo[x][y] = ".";
			}
			
			  
			}
	
			
//-----------	DIBUJAR ------------------------------
		for(int x = 0; x <= dibujo.length; x++){



		   	
		   	if(r > 0){	 
			 dibujo[x][r] = "x";
			 dibujo[x][m] = "x";
			
			  r--;
			  m++;
			  }

			 if(x == dibujo.length){
					for(int y = r+1; y <= m-1; y++){
						dibujo[x-1][y] = "x";
						
					}
			}		
			  
			}

			setAlto(dibujo.length);
			setAncho(dibujo[0].length);
//-----------	DIBUJAR ------------------------------

		map = dibujo;






	}


	public void rotar(){

 //setAlto(alto);
		   
      //  if(alto%2==0){
 
       //      alto = alto - 1;
        //} 

			//dibujo nuevo----------------
		int middleArray = 0;
			middleArray = ((dibujo[0].length - 1) / 2);

		//System.out.println("alto " + (dibujo.length));
		//System.out.println("ancho " + (dibujo[0].length));
		int r = middleArray;
		int m = middleArray;
		//System.out.println("medio " + (middleArray));
		int altoM = 0;


		


				//int ancho = 0;
				//	ancho = alto -1;
				//	ancho = ancho /2;

				//dibujo = new String[ancho][alto];
			
		
//-------------------------------------------------------------------
				for(int x = 0; x <= dibujo.length-1; x++){
		  	
		   for(int y = 0; y <= dibujo[x].length-1; y++){
		
			  dibujo[x][y] = ".";
			}
			
			  
			}
	
			
//-----------	DIBUJAR ------------------------------
		for(int x = dibujo.length-1; x >= 0; x--){


		   		//System.out.println("Rmap["+(x)+"]["+r+"] = "+ x +";");
		  		//System.out.println("Mmap["+(x)+"]["+m+"] = "+ x +";");
		   	
		   	if(r > 0){	 



			 dibujo[x][r] = "x";
			 dibujo[x][m] = "x";
			
			  r--;
			  m++;
			  }

			 if(x == 0){
					for(int y = r+1; y <= m-1; y++){
						dibujo[x][y] = "x";
						
					}
			}		
			  
			}

			setAlto(dibujo.length);
			setAncho(dibujo[0].length);
//-----------	DIBUJAR ------------------------------

		map = dibujo;





	}

	public void mover(int corX, int corY){
			int paso = 0;
		if(corY > corX){
			paso = corY / 3;
			corY = corY - paso; 
		}else if(corX > corY){
			paso = corX / 3;
			corX = corX - paso;
		}else if(corX <= paso){
			corX = corX + 1;
		}else if(corY <= paso){
			corY = corY + 1;
		}

		int lado = getAlto();
		//System.out.println("lado " + lado);





		//System.out.println("middle " + middle);

		int TaArrayX = 0;
			TaArrayX = ((corX + map.length) -  1);
			System.out.println("x " + corX);

		int TaArrayY = 0;
			TaArrayY = ((corY + map[0].length));
			//System.out.println("y " + corY);

			//System.out.println("TaArrayX " + map.length + " TaArrayY " + map[0].length);
		map = new String[TaArrayX][TaArrayY+1];

		//System.out.println("ArrayX " + TaArrayX + " TaArrayY " + TaArrayY );

	

//-----------	RELLENAR ------------------------------
		for(int x = 0; x <= map.length-1; x++){
		  	
		   for(int y = 0; y <= map[x].length-1; y++){
		
			  map[x][y] = ".";
			}
			
			  
			}
//-----------	RELLENAR x------------------------------




	   //int Xcor = TaArrayX-1;
	   		//Xcor = Xcor/2;

			int r = map.length;
			int m = map.length;

		   	
		  		for(int x = corX; x <= map.length; x++){


		  				
		   	//error

		   	if(r > 0){	 
		  		//System.out.println("Rmap["+(x-1)+"]["+r+"] = "+ x +";");
		  		//System.out.println("Mmap["+(x-1)+"]["+m+"] = "+ x +";");

			map[x-1][r] = "x";
			map[x-1][m] = "x";
			
			  r--;
			  m++;
			  }

			 if(x == map.length){
					for(int y = r+1; y <= m-1; y++){
						map[x-1][y] = "x";
						//System.out.println("X["+corY);
						
					}
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
		int area = ((getAncho()*getAlto())/2);
		setArea(area);
	}


	
	public String[][] getMap(){
		return map;
	}


}