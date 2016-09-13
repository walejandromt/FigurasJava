public class Control{
	
	public static void main(String[] args){
			
		int operacion = 0;
		int[] cordenadas = new int[2];
		CharEncodingDemo demon = new CharEncodingDemo();


		//MENU
		Menu m = new Menu();

		operacion = m.menuFiguras();

		m.menuT(operacion);
//--------------------------------FIGURAS---------------------------------------

		switch(operacion){
//--------------------------------CUADRADO---------------------------------------
		  case 1:
		 Cuadrado c = new Cuadrado();

		 c.dibujar(m.getAlto());
		 c.imprimir();
		 demon.create(c.getMap());
		   operacion = m.menuOperacion();

    

//--------------------------------OPERACIONES---------------------------------------

		switch(operacion){
//--------------------------------CUADRADO---------------------------------------
		  case 1:
		  		
		  c.rotar45();
		demon.create(c.getMap());
				
		  break;
//--------------------------------ROTAR---------------------------------------


//--------------------------------MOVER---------------------------------------
		  case 2:
		  	cordenadas = m.menuMover();
	c.mover(cordenadas[0], cordenadas[1]);
	demon.create(c.getMap());
		  break;
//--------------------------------MOVER---------------------------------------


//--------------------------------AREA--------------------------------------		  
		  case 3:
	c.calArea();
	System.out.println("El area es: " + c.getArea());
		  break;
//--------------------------------AREA--------------------------------------	

		  default:
		  //System.out.println("");
		  break;
			}
//--------------------------------OPERACIONES---------------------------------------
		  break;
//--------------------------------CUADRADO---------------------------------------












//--------------------------------TRIANGULO---------------------------------------
		  case 2:
		 Triangulo t = new Triangulo();

		 t.dibujar(m.getAlto());
		 t.imprimir();
		demon.create(t.getMap());
			operacion = m.menuOperacion();




//--------------------------------OPERACIONES---------------------------------------

		switch(operacion){
//--------------------------------TRIANGULO---------------------------------------
//--------------------------------ROTAR---------------------------------------
		  case 1:
		  		t.rotar();
		  		t.imprimir();
				demon.create(t.getMap());
				
		  break;
//--------------------------------ROTAR---------------------------------------


//--------------------------------MOVER---------------------------------------
		  case 2:
		  	cordenadas = m.menuMover();
			t.mover(cordenadas[0], cordenadas[1]);
			demon.create(t.getMap());
		  break;
//--------------------------------MOVER---------------------------------------


//--------------------------------AREA--------------------------------------		  
		  case 3:
	t.calArea();
	System.out.println("El area es: " + t.getArea());
		  break;
//--------------------------------AREA--------------------------------------	

		  default:
		  //System.out.println("");
		  break;
			}
//--------------------------------TRIANGULO---------------------------------------

		 
		break;









//--------------------------------RECTANGULO.--------------------------------------		  
		  case 3:
		 Rectangulo r = new Rectangulo();

		 r.dibujar(m.getAlto(), m.getAncho());
		 r.imprimir();
		 demon.create(r.getMap());

		 //--------------------------------RECTANGULO OPERACIONES---------------------------------------
 operacion = m.menuOperacion();
switch(operacion){

		  case 1:
		  		
			r.rotar();
			r.imprimir();
			demon.create(r.getMap());
				
		  break;
//--------------------------------ROTAR---------------------------------------


//--------------------------------MOVER---------------------------------------
		  case 2:
		  	cordenadas = m.menuMover();
	r.mover(cordenadas[0], cordenadas[1]);
	demon.create(r.getMap());
		  break;
//--------------------------------MOVER---------------------------------------


//--------------------------------AREA--------------------------------------		  
		  case 3:
	r.calArea();
	System.out.println("El area es: " + r.getArea());
		  break;
//--------------------------------AREA--------------------------------------	

		  default:
		  //System.out.println("");
		  break;
			}
//--------------------------------operaciones RECTANGULO---------------------------------------

		 


		  break;
//--------------------------------RECTANGULO.--------------------------------------	

		  default:
		  //System.out.println("");
		  break;
			}
//--------------------------------FIGURAS---------------------------------------






			
 



		 
	}






}