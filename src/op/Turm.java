package op;

import java.util.Stack;

public class Turm {
	private Stack<Stein> Turm = new Stack<Stein>();
	private final static int TURM_HOEHE = 5;
	
	public Turm() {
		
	}
	
	public void setStein(Stein hStein) {
		if(Turm.size() < TURM_HOEHE) {
			Turm.add(hStein);
		} else {
			System.out.println("Turm ist Voll");
		}
	}
	
	public int getHoehe() {
		return Turm.size();
	}
	
}
