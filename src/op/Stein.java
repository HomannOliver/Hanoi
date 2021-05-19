package op;

public class Stein {
	
	enum Color { //Farben, die der Stein haben kann
		BLAU, ROT, GRÜN
	}
	
	public Stein(int size, Color c) { //Werte (Größe, Farbe) anfangs festlegen
		this.size = size;
		this.color = c;
	}
	
	private int size; //Größe des Steins
	
	private Color color; //Farbe des Steins
	
	public int getSize() { //Getter für Größe
		return size;
	}
	public Color getColor() { //Getter für Farbe
		return color;
	}
	public String getColorString() {
		return this.color.toString();
	}
	public static Color getColorObject(String farbe) {
		switch(farbe.toLowerCase()) {
		case "blau":return Color.BLAU;

		case "rot":return Color.ROT;

		case "grün":return Color.GRÜN;

		default:return Color.BLAU;
		}
	}
}
