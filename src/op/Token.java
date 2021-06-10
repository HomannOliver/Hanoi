package op;

public class Token { //Klasse des Spielsteins
	
	enum Color { //Farben, die der Stein haben kann
		BLAU, ROT, GRÜN //Blau, Rot, Grün stehen zur Verfügung
	}
	
	public Token(int size) { //Werte (Größe, Farbe) anfangs festlegen
		this.size = size; //Die übergeben Größe festlegen
	}
	
	private int size; //Größe des Steins
	
	private Color color; //Farbe des Steins
	
	public int getSize() { //Getter für Größe
		return this.size; //Größe des Steins zurückgeben
	}
	
	public void setColor(Token.Color color) { //Setter für Farbe
		this.color = color; //Farbe des Steins festlegen
	}
	
	public Color getColor() { //Getter für Farbe
		return this.color; //Farbe des Steins zurückgeben
	}
}
