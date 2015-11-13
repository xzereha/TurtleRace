import java.util.ArrayList;


public class TurtleRace {
	/**
	 * Delay in ms
	 */
	private static final int DELAY = 30;
	
	protected static RaceWindow w = new RaceWindow();
	
	protected static ArrayList<RaceTurtle> racingTurtles = new ArrayList<RaceTurtle>();
	protected static ArrayList<RaceTurtle> turtlesInGoal = new ArrayList<RaceTurtle>();
	
	/**
	 * Checks if the turtle has reached the goal
	 */
	static boolean inGoal(RaceTurtle t){
		if(t.getX() >= RaceWindow.X_END_POS)return true;
		return false;
	}
	
	 /**
	  * Fills the racingTutle array with RaceTutles
	  */
	static void createTutles(){
		for (int i = 0; i < 8; i++) {
			racingTurtles.add(new RaceTurtle(w, i+1));
		}
	}
	
	/**
	 * Moves all the turtles one step
	 */
	static void raceStep(){
		for (int i = 0; i < racingTurtles.size(); i++){
			racingTurtles.get(i).raceStep();
			
			//Moves the turtle to the winning list if it has reached the goal
			if(inGoal(racingTurtles.get(i))){
				turtlesInGoal.add(racingTurtles.get(i));
				racingTurtles.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		createTutles();
		while (racingTurtles.size()>0){
			raceStep();
			RaceWindow.delay(DELAY);
		}
		
		System.out.println("På plats 1: " + turtlesInGoal.get(0));
		System.out.println("På plats 2: " + turtlesInGoal.get(1));
		System.out.println("På plats 3: " + turtlesInGoal.get(2));
	}
	
}
