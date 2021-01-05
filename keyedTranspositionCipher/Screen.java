package cryptography.keyedTranspositionCipher;


public class Screen {
	String welcomeString = "\nWelcome to the Keyed Transposition Cipher Calculator!";
	String arrayInitializerString = "\nEnter the number size of the letter block to encrypt to initialize the array with space for letters: ";

	public Screen() {
		System.out.print(welcomeString);
		System.out.print(arrayInitializerString);
	}

	
	public void displayMessage(String message) {
		System.out.print(message);
	}
	
	public void displayArray(int[] arrayList) {
		for (int i = 0; i < arrayList.length;i++) {
			System.out.println(arrayList[i]);
		}
	}
	
	public void displayCharArray(char[][] arrayList) {
		for (int i = 0; i < arrayList.length; i++) {
			System.out.println(arrayList[i]);
		}
	}
}
