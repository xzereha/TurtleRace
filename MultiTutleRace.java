import java.util.Random;


public class MultiTutleRace extends TurtleRace{

	static void createTutles(){
		Random rand = new Random();
		
		/**
		 * Creates random turtles to fill the start line.
		 */
		for (int i = 0; i < 8; i++) {
			int turtRand = rand.nextInt(5);
			switch(turtRand){
				case 0 : racingTurtles.add(new RaceTurtle/*Change to Absent minded*/(w, i+1)); break;  
				case 1 : racingTurtles.add(new RaceTurtle/*Change to Dizzy*/(w, i+1)); break;	
				case 2 : racingTurtles.add(new RaceTurtle/*Change to Mole*/(w, i+1)); break;	
				case 3 : racingTurtles.add(new RaceTurtle/*Change to something*/(w, i+1)); break;	
				case 4 : racingTurtles.add(new RaceTurtle/*Change to something else*/(w, i+1)); break;	
				default: racingTurtles.add(new RaceTurtle(w, i+1)); break;
			}
		}
		
	}
	
}
