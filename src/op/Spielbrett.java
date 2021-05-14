package op;


import java.util.ArrayList;
import java.util.List;

public class Spielbrett {
	protected List<Turm> spielbrett = new ArrayList<>();
	
	public Spielbrett(Turm turmLinks, Turm turmMitte, Turm turmRechts) {
		this.spielbrett.add(turmLinks);
		this.spielbrett.add(turmMitte);
		this.spielbrett.add(turmRechts);
	}
	
	public Spielbrett() {
		
	}
	
	protected Turm getTurm(int index) {
		return spielbrett.get(index);
	}
	

}
