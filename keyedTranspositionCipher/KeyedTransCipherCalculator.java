package cryptography.keyedTranspositionCipher;

public class KeyedTransCipherCalculator {
	
	
	static Screen screen = new Screen();
	static Keypad keypad = new Keypad();
	
	static String enterRows = "\n****Enter the number 1 for the dimensions of the rows!";
	static String enterCols = "\n*****Enter the number 5 for the dimensions of the columsn!";
	static String informUser = "\n*****We will create  1 x 5 matrix to hold the data. Recall, an array is a type of matrix!";
	
	public static void main(String[] args) {
		
		screen.displayMessage(enterRows);
		final int SIZE = keypad.getInput();
		screen.displayMessage(enterCols);
		screen.displayMessage(informUser);
		final int SIZE2 = keypad.getInput();
		char[][] arrayList = new char[SIZE][SIZE2];
	}
}
