package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Juni=new Robot("batman");
		// 5. Set your robot's pen down 
		Juni.penDown();
		// 3. Set the robot to go at max speed (100)
		Juni.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 75; i++) {
			
	
			// 7. Change the pen color to random
		Juni.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
		Juni.move(5*i);	
			// 2. Turn the robot 360/7 degrees to the right
		Juni.turn(360/12);
			// 8. Set the pen width to i
			Juni.setPenWidth(i);}	
	}
}
