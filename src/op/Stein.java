package op;

public class Stein {
	
	public Stein(int size, String farbe) { //Werte (Größe, Farbe) anfangs festlegen
		this.size = size;
		this.farbe = farbe;
	}
	
	private int size; //Größe des Steins
	
	private String farbe; //Farbe des Steins
	
	public int getSize() { //Getter für Größe
		return size;
	}
}
