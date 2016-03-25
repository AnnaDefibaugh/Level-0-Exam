/* Level 0 Exam: Coding  Exercise #1 */
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Colors.Oranges;
import org.teachingextensions.logo.Colors.Purples;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.PenColors.Yellows;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		Tortoise.show();
		Tortoise.setSpeed(10);
		String Color = JOptionPane.showInputDialog("What Color do you want. Pink, red, orange, yellow, green, blue, or purple?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if (Color .equals("Pink")) {
			Tortoise.setPenColor(Pinks.Pink);
		}
		else if (Color .equals("Red")) {
			Tortoise.setPenColor(Reds.Crimson);
		}
		else if (Color .equals("Orange")) {
			Tortoise.setPenColor(Oranges.DarkOrange);
		}
		else if (Color .equals("Yellow")) {
			Tortoise.setPenColor(Yellows.Gold);
		}
		else if (Color .equals("Green")) {
			Tortoise.setPenColor(Greens.ForestGreen);
		}
		else if (Color .equals("Blue")) {
			Tortoise.setPenColor(Blues.CornflowerBlue);
		}
		else if (Color .equals("Purple")) {
			Tortoise.setPenColor(Purples.MediumPurple);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 9; i++) {
			Tortoise.move(100);
			Tortoise.turn(40);
		}
	}
}

