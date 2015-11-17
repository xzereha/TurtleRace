import java.util.Random;
/**
 * 
 * @author XZereha
 *
 */
public class RaceTurtle extends Turtle{
	private int number;
	private Random rand = new Random();
	private final int MAX_STEP_LENGTH = 6;
	/**
	 * Skapar en RaceTurtle i RaceWindow "w" med start nummer "nbr".
	 * RaceTurtlen får passande startposition beroende på start nummert.
	 */
	public RaceTurtle(RaceWindow w, int nbr){
		super(w, RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr));
		number = nbr;
		penDown();
		left(-90);
	}
	
	/**
	 * Flyttar turtle 1-MAX_STEP_LENGTH(6) steg fram.
	 * Skriv över denna för specialfall
	 */
	public void raceStep(){
		forward(rand.nextInt(MAX_STEP_LENGTH)+1);
	}
	
	/**
	 * Skriv över denna för specialfall
	 */
	public String toString(){
		return "Nummer " + number;
	}
}
