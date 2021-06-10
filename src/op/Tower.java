package op;

import java.util.ArrayList;
import java.util.List;

public class Tower { //Klasse des Turms
	
	private final int MAX_HEIGHT = 5; //Maximale Höhe des Turms
	
	private String name = ""; //Name des Turms für die Ausgabe
	
	private List<Token> tower = null; //Turm
	
	public Tower(String name, boolean shouldBeFilled) { //Konstruktor (wenn boolean = true: Turm soll gefüllt werden)
		
		this.tower = new ArrayList<Token>(); //Turm initialisieren
		
		this.name = name; //Namen festlegen
		
		if(shouldBeFilled) { //Wenn der Turm gefüllt werden soll
			addTokens(); //Turm initial mit allen zur Verfügung stehenden Steinen füllen
		}
	}
	
	private void addTokens() { //Turm initial mit allen zur Verfügung stehenden Steinen füllen
		
		for(int i = 0; i<this.MAX_HEIGHT; i++) { //Oben festgelegte Anzahl an Steinen adden
			
			//Token erstellen
			Token token = new Token(this.MAX_HEIGHT-i); //MAX_HEIGHT-i, damit der letzte Stein die Größe 1 hat
			token.setColor(token.getColor().BLAU); //Farbe der Steine festlegen
			
			this.tower.add(token); //Stein auf den Turm stapeln (Groß unten, klein oben)
			
		}
	}
	
	public boolean checkRemove() { //Ob der Stein entfern werden kann
		if(this.tower.size()<=0) { //Wenn der Turm (von dem der Stein genommen wird) leer ist
			System.out.println("Zug nicht möglich (Turm leer)\n"); //Fehlermeldung ausgeben
			return false; //Der Zug ist nicht möglich (da der Turm leer ist)
		}
		return true; //Der Zug ist erlaubt
	}
	
	public boolean checkAdd(Token tokenToMove) { //Ob der Stein hinzugefügt werden kann
		
		if(this.tower.size()>=this.MAX_HEIGHT) { //Wenn der Turm (auf den der Stein gesetzt wird) voll ist
			System.out.println("Zug nicht möglich (Turm voll)\n"); //Fehlermeldung ausgeben
			return false; //Der Zug ist nicht Möglich (da der Turm voll ist)
		}
		
		if(this.tower.size()!=0) { //Wenn der Turm nicht leer ist
			if((this.tower.get(this.tower.size()-1).getSize() < tokenToMove.getSize())){ //Wenn der untere Stein kleiner ist als der Neue
				System.out.println("Zug nicht möglich (unterer Stein kleiner als oberer)\n"); //Fehlermeldung ausgeben
				return false; //Der untere Stein ist kleiner als der Neue
			}
		}
		
		return true; //Der Zug ist erlaubt
	}
	
	public void addToken(Token tokenToAdd) { //Stein hinzufügen
		this.tower.add(tokenToAdd); //Neuen Stein hinzufügen
		System.out.println("und auf Turm " + this.name + " gelegt!\n"); //Informationen ausgeben
	}
	
	public void removeToken() { //Stein entfernen
		System.out.print("Stein (Größe: " + this.tower.get(this.tower.size()-1).getSize() +
				") wurde vom Turm " + this.name + " entfernt "); //Informationen ausgeben
		this.tower.remove(this.tower.size()-1); //Obersten Stein entfernen
	}
	
	public void printSituation() { //Position und Größe der Steine ausgeben
		System.out.println("Auf dem Turm " + name + "befinden sich " + this.tower.size() + " Steine"); //Infos ausgeben
		for(int i = 0; i<this.tower.size(); i++) { //Alle Steine auf dem Turm durchgehen
			System.out.println("Größe - Stein " + (i+1) + ": "+this.tower.get(i).getSize()); //Größe des jeweiligen Steins ausgeben
		}
	}
	
	public int getSize() { //Getter für Größe des Turms
		return this.tower.size(); //Größe des Turms zurückgeben
	}
	public Token getToken(int i) { //Getter für Stein an der Position i
		return this.tower.get(i); //Stein an der Position i zurückgeben
	}
	public int getNumber() { //Getter für Anzahl der Steine
		return this.MAX_HEIGHT; //Anzahl der Steine zurückgeben
	}
	
}
