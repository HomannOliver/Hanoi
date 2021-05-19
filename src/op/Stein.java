package op;

public class Stein {
	
	enum Color { //Farben, die der Stein haben kann
		BLAU, ROT, GR�N
	}
	
	public Stein(int size, Color c) { //Werte (Gr��e, Farbe) anfangs festlegen
		this.size = size;
		this.color = c;
	}
	
	private int size; //Gr��e des Steins
	
	private Color color; //Farbe des Steins
	
	public int getSize() { //Getter f�r Gr��e
		return size;
	}
	public Color getColor() { //Getter f�r Farbe
		return color;
	}
}
