import java.util.Random;

public class RaceTurtle extends Turtle{
	private int number;
	private Random rand = new Random();
	private final int MAX_STEP_LENGTH = 6;
	/**
	 * Creates a RaceTurtle in the window w with the starting number nbr.
	 * The turtle will get appropriate starting position depending on the start number.
	 */
	public RaceTurtle(RaceWindow w, int nbr){
		super(w, RaceWindow.getStartXPos(nbr), RaceWindow.getStartYPos(nbr));
		number = nbr;
		penDown();
		left(-90);
	}
	
	/**
	 * Moves the turtle 1-MAX_STEP_LENGTH steps forward.
	 */
	public void raceStep(){
		forward(rand.nextInt(MAX_STEP_LENGTH)+1);
	}
	
	public String toString(){
		return "Nummer " + number;
	}
}
