package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is 1+1?");	
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals("2")) {
					JOptionPane.showMessageDialog(null, "Great Job!");
					score +=1;
				}
				else {
					JOptionPane.showMessageDialog(null, "That's Wrong!");
					score -=1;
				}
				answer = JOptionPane.showInputDialog("What is 2+3?");	
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equals("5")) {
					JOptionPane.showMessageDialog(null, "Great Job!");
					score +=1;
				}
				else {
					JOptionPane.showMessageDialog(null, "That's Wrong!");
					score -=1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null,"Your score is "+score);
	}
}
