package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Juni=new Robot();
	Juni.setPenColor(Color.blue);
	Juni.penDown();
	Juni.setSpeed(100);
	Juni.move(180);
	Juni.turn(90);	
	Juni.move(180);	
	Juni.turn(90);
	Juni.move(180);
	Juni.turn(90);
	Juni.move(180);
	Juni.turn(90);
	Juni.move(90);
	Juni.turn(-90);
	Juni.move(90);
	}
}
