package cryptography.gcd.bubbleSort;
//--this simulates a number keypad
import java.util.Scanner;

public class Keypad {
	
	private Scanner input;
	
	public Keypad() {//--begin no-arg constructor
		input = new Scanner(System.in);
	}//--end no-arg constructor
	
	public int getInput() {
		return input.nextInt();
	}
}
