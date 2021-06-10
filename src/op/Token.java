package op;

public class Token { //Klasse des Spielsteins
	
	enum Color { //Farben, die der Stein haben kann
		BLAU, ROT, GR�N //Blau, Rot, Gr�n stehen zur Verf�gung
	}
	
	public Token(int size) { //Werte (Gr��e, Farbe) anfangs festlegen
		this.size = size; //Die �bergeben Gr��e festlegen
	}
	
	private int size; //Gr��e des Steins
	
	private Color color; //Farbe des Steins
	
	public int getSize() { //Getter f�r Gr��e
		return this.size; //Gr��e des Steins zur�ckgeben
	}
	
	public void setColor(Token.Color color) { //Setter f�r Farbe
		this.color = color; //Farbe des Steins festlegen
	}
	
	public Color getColor() { //Getter f�r Farbe
		return this.color; //Farbe des Steins zur�ckgeben
	}
}
