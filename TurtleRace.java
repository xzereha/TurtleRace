import java.util.ArrayList;


public class TurtleRace {
	
	public static void main(String[] args) {
		/**
		 * Delay in ms
		 */
		final int DELAY = 30;
		
		ArrayList<RaceTurtle> racingTurtles = new ArrayList<RaceTurtle>();
		ArrayList<RaceTurtle> turtlesInGoal = new ArrayList<RaceTurtle>();
		
		RaceWindow w = new RaceWindow();
		
		//Creates all the turtles
		for (int i = 0; i < 8; i++) {
			racingTurtles.add(new RaceTurtle(w, i+1));
		}
		
		while (racingTurtles.size()>0){
			for (int i = 0; i < racingTurtles.size(); i++){
				racingTurtles.get(i).raceStep();
				
				//Moves the turtle to the winning list if it has reached the goal
				if(racingTurtles.get(i).getX() >= RaceWindow.X_END_POS){
					turtlesInGoal.add(racingTurtles.get(i));
					racingTurtles.remove(i);
				}
			}
			RaceWindow.delay(DELAY);
		}
		
		System.out.println("På plats 1: " + turtlesInGoal.get(1));
		System.out.println("På plats 2: " + turtlesInGoal.get(2));
		System.out.println("På plats 3: " + turtlesInGoal.get(3));
	}
	
}
