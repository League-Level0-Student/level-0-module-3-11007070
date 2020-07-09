package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class StoryAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "You're morning alarm just went off! What do you do?");
	String alarm = JOptionPane.showInputDialog("1: hit snooze and sleep for 5 more mintues. 2: get out of bed");
	if (alarm.equals("1")) {
		JOptionPane.showMessageDialog(null, "You're alarm just went off again. You finally get out of bed.");
	}
	else if (alarm.equals("2")) {
		JOptionPane.showMessageDialog(null, "Good thinking, the more time you have in the morning, the better!");
	}
	JOptionPane.showMessageDialog(null, "The clock reads 5:00 a.m. School starts at 8:00 a.m.");
	JOptionPane.showMessageDialog(null, "What do you do first in the morning?");
	String eatOrshower = JOptionPane.showInputDialog("1: eat breakfeast. 2: take a shower");
	if (eatOrshower.equals("1")) {
		JOptionPane.showMessageDialog(null, "Good choice! It is important to be noursished for school.");
		JOptionPane.showMessageDialog(null, "After eating breakfeast, you decide to take a shower");
	}
	else if (eatOrshower.equals("2")) {
		JOptionPane.showMessageDialog(null, "Good choice! It is important to stay clean for school.");
		JOptionPane.showMessageDialog(null, "After taking a shower, you decide to eat breakfeast");
	}
	JOptionPane.showMessageDialog(null, "Your morning has consisted of taking a shower and eating breakfeast. The next thing to do it pick an outfit for school");
	String outfit = JOptionPane.showInputDialog("1: red plaid jacket with white tank underneath and matching red plaid skirt. 2: blue wrap top with white tube top underneath and blue plaid skirt");
	if (outfit.equals("1")) {
		JOptionPane.showMessageDialog(null, "Great choice! That outfit is awesome!");
		JOptionPane.showMessageDialog(null, "Now time to choose the shoes");
		String shoes = JOptionPane.showInputDialog("1: black Doc Martens. 2: white Doc Martens");
		if (shoes.equals("1")) {
			JOptionPane.showMessageDialog(null, "Nice choice! Black Doc Martens go great with red plaid");
		}
		else if (shoes.equals("2")) {
			JOptionPane.showMessageDialog(null, "Nice choice! White Doc Martens look great with red plaid");
		}
	}
	else if (outfit.equals("2")) {
		JOptionPane.showMessageDialog(null, "Awesome choice! Blue is a great color");
		JOptionPane.showMessageDialog(null, "Time to choose the shoes!");
		String shoesBlue = JOptionPane.showInputDialog("1: White Doc Martens. 2: blue hightop converse");
		if (shoesBlue.equals("1")) {
			JOptionPane.showMessageDialog(null, "Good choice! White Doc Martens go great with blue plaid");
		}
		else if (shoesBlue.equals("2")) {
			JOptionPane.showMessageDialog(null, "Great choice! Blue converse would look awesome with the outfit");
		}
	}
	JOptionPane.showMessageDialog(null, "Now that you have picked out your outfit for school, it is time to go to school");
	JOptionPane.showMessageDialog(null, "How are you getting to school?"); 
	String drive = JOptionPane.showInputDialog("1: have your parents drive you to school. 2: take your own car to school");
	if (drive.equals("1")) {
		JOptionPane.showMessageDialog(null, "You went to ask your dad if he can drive you to school");
		JOptionPane.showMessageDialog(null, "Your dad said he can't so you went to your mom instead");
		JOptionPane.showMessageDialog(null, "Your mom said she couldn't drive you to school either");
	}
	else if (drive.equals("2")) {
		JOptionPane.showMessageDialog(null, "You get your keys from your room, grab your backpack, and go to the garage.");
	}
	JOptionPane.showMessageDialog(null, "In the garage, there is a white jeep, waiting for you to drive it");
	JOptionPane.showMessageDialog(null, "Before pulling out of the garage, you text the groupchat with your 3 best friends");
	JOptionPane.showMessageDialog(null, "You text the groupchat that you are going to pick each of them up and go to Starbucks to get coffee");
	JOptionPane.showMessageDialog(null, "10 mintues later, you have all three of your friends in your car, all headed to Starbucks for a morning drink");
	JOptionPane.showMessageDialog(null, "Now at Starbucks, you have to decide what you want to drink");
	String starbucks = JOptionPane.showInputDialog("1: coffee with almond milk. 2: pink drink");
	if (starbucks.equals("1")) {
		JOptionPane.showMessageDialog(null, "Nice choice. It is good to have energy for school in the morning");
	}
	else if (starbucks.equals("2")) {
		JOptionPane.showMessageDialog(null, "Nice choice. Pink drinks taste good and a good drink to have for 1st period");
	}
	JOptionPane.showMessageDialog(null, "Now that you and all your friends have drinks for school, it is time to drive to school");
	JOptionPane.showMessageDialog(null, "Perfect! You just arrived to school with 10 mintues to spare before class starts");
	JOptionPane.showMessageDialog(null, "What do you do before 1st period starts?");
	String period1 = JOptionPane.showInputDialog("1: head to class and wait outside. 2: go to the bathroom and take mirror pics with your friends");
	if (period1.equals("1")) {
		JOptionPane.showMessageDialog(null, "Good idea, it is smart to be early for class rather than late");
	}
	else if (period1.equals("2")) {
		JOptionPane.showMessageDialog(null, "Great choice! It is fun taking pictures with your friends and good to have as memories");
		JOptionPane.showMessageDialog(null, "After taking pictures, you and your friends all head to 1st period");
	}
	JOptionPane.showMessageDialog(null, "It is lunchtime now");
	JOptionPane.showMessageDialog(null, "What are you going to eat?");
	String lunch = JOptionPane.showInputDialog("1: buy sandwiches provided by the school. 2: eat the lunch you forgot to pack");
	if (lunch.equals("1")) {
		JOptionPane.showMessageDialog(null, "Great choice. Some school lunches are bad but the sandwiches your school provides are really good");
	}
	else if (lunch.equals("2")) {
		JOptionPane.showMessageDialog(null, "Not so great of a choice. Eating nothing isn't good for your body.");
		JOptionPane.showMessageDialog(null, "Since you have to eat something, what are you doing?");
		String secondLunch = JOptionPane.showInputDialog("1: steal some of your friends lunches. 2: buy a smoothie from school");
		//if ()
	}
}
}
