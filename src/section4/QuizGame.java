package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int number=0;
		// 2.  Ask the user a question 
		String Egg=JOptionPane.showInputDialog("2+2=x\n What is x?");
		// 3.  Use an if statement to check if their answer is correct
		if(Egg.equals("4")) {
		JOptionPane.showMessageDialog(null, "Correct");
		number=number+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		JOptionPane.showMessageDialog(null, number);
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String Dom=JOptionPane.showInputDialog("7/2=x \n what is x?");
		if(Dom.equals("3.5")) {
			JOptionPane.showMessageDialog(null, "Correct");
			number=number+1;
			}
			else {
				JOptionPane.showMessageDialog(null, "wrong");
			}
			JOptionPane.showMessageDialog(null, number);
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
