import java.util.Random;

/**
 * @author Xeogt
 *	Fredriks Dizzyturtle, som aldrig förlorar steg framåt. Extremt OP.
 */

public class DizzyTurtle extends RaceTurtle {

	private int dizzyness;
	private int dirMod;
	private Random rand = new Random();
	
/**
 *      DizzyTurtle, med dizzyness 1-5
 */
	public DizzyTurtle(RaceWindow w, int nbr, int dizzyness) {
		super(w, nbr);
		this.dizzyness = dizzyness;
	}

/**
 *	Racestep
 */		
	public void raceStep(){
		if ( (rand.nextInt(100) < 10*dizzyness)) {
			dirMod = rand.nextInt(30);
			left(dirMod);
			
				if ( getDirection() > 30) {
				left(-2*dirMod);
				}
		}
		super.raceStep();
	}
	
	public String toString(){
		return super.toString() + " - DizzyTurtle (" + dizzyness + "% chans att byta riktning)";
	}
}
