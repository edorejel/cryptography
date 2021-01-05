package cryptography.gcd.bubbleSort;
//--represents a computer screen
//--methods should start with a verb
//--the verb should relate to the what program is supposed to do
//--a Screen displays information
//--every method should start with the verb display followed by a noun
//--a noun is a person, place, or thing

public class Screen {
	String welcomeString = "\nWelcome to the GCD Calculator!";
	String arrayInitializerString = "\nEnter the number 2 to initialize the array with space for two numbers: ";

	public Screen() {//--constructors with no-args, display the Strings inside the body at starts of program
		System.out.print(welcomeString);
		System.out.print(arrayInitializerString);
	}//--end no-arg constructor

	//---------------------------------------------
	public void displayMessage(String message) {
		System.out.print(message);
	}

	//-------------------------------------------
	public void displayGCD(int gcd) {
		System.out.print(gcd);
	}
	//-------------------------------------------------------------------------
	public void displayArray(int[] arrayList) {//--begin print
		for (int i = 0; i < arrayList.length;i++) {
			System.out.println(arrayList[i]);
		}
	}//--end print
	//----------------------------------------------------------------------------
}
