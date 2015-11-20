import java.util.Random;
/**
 * 
 * @author XZereha
 *
 */
public class MultiTutleRace extends TurtleRace{

	/**
	 * Creates random turtles to fill the start line.
	 */
	static void createTutles(){
		Random rand = new Random();
		
		for (int i = 0; i < 8; i++) {
			//Randomizes the turtles
			int turtRand = rand.nextInt(5);
			switch(turtRand){
				case 0 : racingTurtles.add(new RaceTurtle/*TODO Change to Absent minded*/(w, i+1)); break;  
				case 1 : racingTurtles.add(new DizzyTurtle(w, i+1, rand.nextInt(5)+1)); break;	
				case 2 : racingTurtles.add(new RaceTurtle/*TODO Change to Mole*/(w, i+1)); break;	
				case 3 : racingTurtles.add(new RaceTurtle/*TODO Change to something*/(w, i+1)); break;	
				case 4 : racingTurtles.add(new TPTurtle(w, i+1, rand.nextInt(100)+1)); break;	
				default: racingTurtles.add(new RaceTurtle(w, i+1)); break;
			}
		}
		
	}
	/**
	 * Prints the start line
	 */
	static void printStartline(){
		for(int i = 0; i < racingTurtles.size(); i++) {
			System.out.println(racingTurtles.get(i));
		}
	}
	
	public static void main(String[] args) {
		
		createTutles();
		printStartline();
		while (racingTurtles.size()>0){
			raceStep();
			RaceWindow.delay(DELAY);
		}
		
		printWinners();
	}
	
}
