public class Figuras{
	private String dibujo = "";
	private int alto;
	private int ancho;
	private int area;
	


	public void rotar(){}
	public void mover(){}
	public void calArea(){}
	public void dibujar(){}

	public void imprimir(){
		//System.out.println(dibujo);
	}






	//set and get
	public void setDibujo(String dibujo){
		this.dibujo = dibujo;
	}

	public String getDibujo(){
		return dibujo;
	}

	public void setAlto(int alto){
		this.alto = alto;
	}

	public int getAlto(){
		return alto;
	}

	public void setAncho(int ancho){
		this.ancho = ancho;
	}

	public int getAncho(){
		return ancho;
	}

	public void setArea(int area){
		this.area = area;
	}

	public int getArea(){
		return area;
	}



}