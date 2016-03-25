/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

import com.spun.util.velocity.ParseCall;

/**
 * Write a program that asks the user for their age.
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	String Age = JOptionPane.showInputDialog("How old are you?");
	int Age1 = Integer.parseInt(Age);
	int Age2 = 2016 - Age1;
	JOptionPane.showMessageDialog(null, "You were born in " + Age2);
   }
 }