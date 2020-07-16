package _02_loop_variables._4_99_bottles;

public class Bottles99 {
public static void main(String[] args) {
	System.out.print("99 bottles of beer on the wall, 99 bottles of beer.");
	System.out.println();
	for (int i = 98; i > 0; i--) {
		System.out.println("Take one down and pass it around, " + i + " bottles of beer on the wall.");
		System.out.println();
		System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
	}
	System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
	System.out.println();
	System.out.println("No more botttles of beer on the wall, no more bottles of beer.");
	System.out.println("Go to the stor and buy some more, 99 bottles of beer on the wall.");
	
}
}
