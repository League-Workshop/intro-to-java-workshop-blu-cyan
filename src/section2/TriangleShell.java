package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot Juni=new Robot();
	void go() {
		Juni.changeRobot("https://i.ytimg.com/vi/a4cEHJdxmmk/maxresdefault.jpg");
		// 6. Make the robot go as fast as possible
Juni.setSpeed(100);
Juni.penDown();
// 4. make a variable to hold the length of the triangle and set it to 50
int lengths=50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for (int i = 0; i < 200; i++) {
	

			// 9. Change the color of the pen to a random color
Juni.setRandomPenColor();	
			// 8. Increase the length variable by 10
lengths=lengths+10;	
			// 5. call your drawTriangle() method using your length variable
drawTriangle(lengths);	
			// 10. Turn the robot 6 degrees to the right
Juni.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int lengths) {
		Juni.turn(360/3);
		Juni.move(lengths);
		Juni.turn(360/3);
		Juni.move(lengths);
		Juni.turn(360/3);
		Juni.move(lengths);
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
