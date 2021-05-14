package op;

public class Stein {
	
	public Stein(int size, String color) { //Werte (Größe, Farbe) anfangs festlegen
		this.size = size;
		this.color = color;
	}
	
	private int size; //Größe des Steins
	
	private String color; //Farbe des Steins
	
	public int getSize() { //Getter für Größe
		return size;
	}
	public String getColor() { //Getter für Farbe
		return color;
	}
}
