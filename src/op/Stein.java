package op;

public class Stein {
	
	public Stein(int size, String farbe) { //Werte (Gr��e, Farbe) anfangs festlegen
		this.size = size;
		this.farbe = farbe;
	}
	
	private int size; //Gr��e des Steins
	
	private String farbe; //Farbe des Steins
	
	public int getSize() { //Getter f�r Gr��e
		return size;
	}
}
