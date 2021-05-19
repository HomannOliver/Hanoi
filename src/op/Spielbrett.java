package op;


import java.util.ArrayList;
import java.util.List;

public class Spielbrett {
	//Objekt f�r das Spielbrett
	private List<Turm> spielbrett;
	
	//Konstruktor um die T�rme zu initialisieren
	public Spielbrett(Turm turmLinks, Turm turmMitte, Turm turmRechts) {
		this();
		this.spielbrett.add(turmLinks);
		this.spielbrett.add(turmMitte);
		this.spielbrett.add(turmRechts);
	}
	
	//Konstruktor falls die T�rme noch nicht angelegt sind
	public Spielbrett() {
		spielbrett = new ArrayList<Turm>();
	}
	
	//Diese Methode gibt den Turm an der Stelle index zur�ck
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
