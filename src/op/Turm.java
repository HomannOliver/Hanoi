package op;

import java.util.Stack;

public class Turm {
	private Stack<Stein> Turm = new Stack<Stein>();
	private final static int TURM_HOEHE = 5;
	
	public Turm() {
		
	}
	
	public void setStein(Stein hStein) {
		if(Turm.size() < TURM_HOEHE && hStein.getSize() < Turm.get(Turm.size()).getSize()) {
			Turm.add(hStein);
		} else if (Turm.size() == TURM_HOEHE){
			System.out.println("Turm ist Voll");
		} else { 
			System.out.println("Stein ist größer als der oberste auf dem Turm");
		}
	}
	
	public int getHoehe() {
		return Turm.size();
	}
	
	public Stein getStein() {
		return this.Turm.get(Turm.size()-1);
	}
	
}
