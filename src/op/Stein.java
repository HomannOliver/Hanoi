package op;

public class Stein {
	
	public Stein(int size, String color) { //Werte (Gr��e, Farbe) anfangs festlegen
		this.size = size;
		this.color = color;
	}
	
	private int size; //Gr��e des Steins
	
	private String color; //Farbe des Steins
	
	public int getSize() { //Getter f�r Gr��e
		return size;
	}
	public String getColor() { //Getter f�r Farbe
		return color;
	}
}
