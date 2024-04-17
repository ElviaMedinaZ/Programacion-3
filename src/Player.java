
public class Player {
	
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private String color;
	
	public Player(int x, int y, int ancho, int alto, String color) {
		
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.color = color;
	}
	
	//GETTERS Y SETTERS 

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean colision(Player p1) {
		
		 if(x+(ancho-10)>=(p1.getX()) && x<= p1.getX()+(p1.getAncho()-10) 
				 && y+(alto-10)>=p1.getY() && y<= p1.getY()+(p1.getAlto()-10))
		 {
			
			 return true;
		 }
		 
		 return false;

	}	
	
	
	

}
