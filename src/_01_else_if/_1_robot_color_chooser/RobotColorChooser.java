
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(1000);
		for (int i = 0; i < 40; i++) {
		String penColor = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		if (penColor.equals("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if (penColor.equals("green")) {
			rob.setPenColor(0, 255, 68);
		}
		else if (penColor.equals("blue")) {
			rob.setPenColor(0, 94, 255);
		}
		else if (penColor.equals("pink")) {
			rob.setPenColor(255, 139, 233);
		}
		else if (penColor.equals("purple")) {
			rob.setPenColor(205, 87, 240);
		}
		else if (penColor.equals("orange")) {
			rob.setPenColor(255, 128, 0);
		}
		else if (penColor.equals("yellow")) {
			rob.setPenColor(255, 230, 0);
		}
		rob.move(-200);
		rob.turn(-90);
		rob.move(-200);
		rob.turn(-90);
		rob.move(-200);
		rob.turn(-90);
		rob.move(-200);
		rob.turn(10);
		}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
