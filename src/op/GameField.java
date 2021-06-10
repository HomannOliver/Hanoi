package op;


import java.util.ArrayList;
import java.util.List;

public class GameField { //Klasse des Spielfelds
	
	//Wie viele Schritte zur Lösung des Problems benötigt werden
	private int steps = 0;
	
	//Liste mit den Türmen
	private List<Tower> gameField = new ArrayList<>();
	
	//3 Türme initialisieren
	public GameField(Tower towerLeft, Tower towerMid, Tower towerRight) {
		
		//3 Türme zum Spielfeld hinzufügen
		this.gameField.add(towerLeft);
		this.gameField.add(towerMid);
		this.gameField.add(towerRight);
		
	}
	
	public void moveToken(Tower from, Tower to) { //Spielzug (Stein bewegen)
		Token tokenToMove; //Stein, der bewegt werden sollen
		
		if(from.getSize()>=1) { //Wenn der Turm (von dem der Stein verschoben werden soll) nicht leer ist
			tokenToMove = from.getToken(from.getSize()-1); //Zu bewegenden Stein "zwischenspeichern"
		}
		
		else { //Wenn der Turm (von dem ein Stein verschoben werden soll) leer ist
			return; //Methode "abbrechen"
		}
		
		if(from.checkRemove() && to.checkAdd(tokenToMove)) { //Wenn der Stein verschoben werden kann
			//Stein verschieben
			from.removeToken(); //Obersten Stein vom "alten" entfernen
			to.addToken(tokenToMove); //Stein zum "neuen" Turm hinzufügen
		}
	}
	
	public void solve (int n, Tower left, Tower mid, Tower right) { //Problem lösen
		if (n>1) { //Wenn mehr als ein Stein vorhanden ist
		//Lösung des Problems mittels Rekursion
			solve(n-1, left, right, mid);
			moveToken(left, right); //Stein verschieben
			solve(n-1, mid, left, right);
			}
		else { //Wenn weniger als ein Stein vorhanden ist
			moveToken(left, right); //Stein verschieben
		}
		this.steps ++; //Ein Schritt wurde durchgeführt
	}
	
	
	
	public List<Tower> getGameField(){ //Getter für Spielfeld
		return this.gameField; //Spielfeld (Liste mit den Türmen) zurückgeben
	}
	
	public int getSteps() { //Getter für die Schritte, die zur Lösung benötigt werden
		return this.steps; //Schritte zurückgeben
	}
}
