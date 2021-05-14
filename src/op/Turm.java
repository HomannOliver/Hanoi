package op;

import java.util.Stack;

public class Turm {
	private Stack<Stein> Turm = new Stack<Stein>();
	private final static int TURM_HOEHE = 5;
	
	public void setStein(Stein hStein) {
		Turm.add(hStein);
	}
}
