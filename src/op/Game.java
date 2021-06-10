
package op;

public class Game {
    public static void main(String[] args) {
    	
    	//3 T�rme erstellen (links, mitte, rechts)
    	Tower towerLeft = new Tower("links", true);
    	Tower towerMid = new Tower("mitte", false);
    	Tower towerRight = new Tower("rechts", false);
    	
    	//Spielfeld erstellen + 3 T�rme �bergeben
    	GameField field = new GameField(towerLeft, towerMid, towerRight);

    	field.solve(towerLeft.getSize(), towerLeft, towerMid, towerRight);
    	printCurrentSituation(field.getSteps(), towerLeft, towerMid, towerRight);
    	
	}
    
    //HILFSMETHODE (Position und Gr��e der Steien ausgeben)
    private static void printCurrentSituation(int steps, Tower towerLeft, Tower towerMid, Tower towerRight) { 
    	System.out.println("Es wurden " + steps + " Schritte zur L�sung des Problems ben�tigt\n");
    	towerLeft.printSituation();
    	towerMid.printSituation();
    	towerRight.printSituation();
    }
    
}
