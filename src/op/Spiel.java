
package op;

public class Spiel {
	private Spielbrett spielbrett;
	
	
	public Spiel(Spielbrett spielbrett) {
		this.spielbrett = spielbrett;
	}
	
	
    public static void main(String[] args) {
    	Spielbrett brett = new Spielbrett(); 
    	for(int i = 0; i < 3; i++) {
    		brett.setTurm(new Turm());
    	}
    	brett.getTurm(0).setStein(new Stein(3,Stein.getColorObject("blau")));
    	brett.getTurm(0).setStein(new Stein(2,Stein.getColorObject("grün")));
    	brett.getTurm(0).setStein(new Stein(1,Stein.getColorObject("rot")));
    	Spiel spiel = new Spiel(brett);
    	
    	for(int i = 0; i < 3; i++) {
    		System.out.println(brett.getTurm(i).getStein().getColorString());
    	}
    	
	}
     
}
