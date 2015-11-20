import java.util.Random;
/**
 * @author XZereha
 *	Olivers extremt op teleport turtle, kommer troligtvis ändras till något annat då denna liknar mole väldigt mycket
 */

public class TPTurtle extends RaceTurtle{

	private int tpChance;
	private Random rand = new Random();
	private final int TP_DISTANCE = 9;
	private final boolean CAN_FAIL_TP = true;
	
	/**
	 * @param w the RaceWindow to draw in
	 * @param nbr the start number for the turtle
	 * @param tpChance the chance for a teleport
	 */
	public TPTurtle(RaceWindow w, int nbr, int tpChance) {
		super(w, nbr);
		this.tpChance = tpChance;
	}
	
	public void raceStep(){
		if( CAN_FAIL_TP && (rand.nextInt(100)+1) <= tpChance/4)failTp();
		else if( (rand.nextInt(100)+1) <= tpChance)teleport();
		else forward(rand.nextInt(3)+0);
	}
	
	private void failTp(){
		jumpTo((rand.nextInt(RaceWindow.X_END_POS)+RaceWindow.X_START_POS), (rand.nextInt(RaceWindow.Y_LINE_END)+RaceWindow.Y_LINE_START));
	}
	
	private void teleport(){
		jumpTo(getX()+rand.nextInt(TP_DISTANCE)+1, getY());
	}
	
	public String toString(){
		return super.toString() + " - TeleportTurtle (" + tpChance + "% chans att teleportera)";
	}

}
