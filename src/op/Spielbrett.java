package op;


import java.util.ArrayList;
import java.util.List;

public class Spielbrett {
	//Objekt für das Spielbrett
	private List<Turm> spielbrett;
	
	//Konstruktor um die Türme zu initialisieren
	public Spielbrett(Turm turmLinks, Turm turmMitte, Turm turmRechts) {
		this();
		this.spielbrett.add(turmLinks);
		this.spielbrett.add(turmMitte);
		this.spielbrett.add(turmRechts);
	}
	
	//Konstruktor falls die Türme noch nicht angelegt sind
	public Spielbrett() {
		spielbrett = new ArrayList<Turm>();
	}
	
	//Diese Methode gibt den Turm an der Stelle index zurück
	protected Turm getTurm(int index) {
		try {
			return spielbrett.get(index);
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//Diese Methode tauscht den Turm an der Stelle index durch den mitgegebenen
	protected void setTurm(Turm pTurm) {
		this.spielbrett.add(pTurm);
	}
	
	//Diese Methode tauscht den Turm an der Stelle index durch den mitgegebenen
		protected void setTurm(Turm pTurm,int index) {
			this.spielbrett.set(index,pTurm);
		}
	

}
