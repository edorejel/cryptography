package cryptography.gcd.bubbleSort;

public class GCDBubbleSort {
	
	
	//--references to Objects used, Objects is the word used to describe programs when you begin to incorporate
	//--Object-Oriented Programming into your program
	//--in this case, the Objects used are a Keypad and a Screen and a Sorting "machine"
	private static Keypad keypad = new Keypad();
	private static Screen screen = new Screen();
	private static Sort sort = new Sort();
	
	//--attributes/variables
	static String enterInputString = "Enter the numbers in any order, the amount of numbers to enter is:  ";
	static String thisIsGCD = ">----- this is the gcd----------> ";
	static String s1 = "\nThese are the numbers you entered: ";
	static String s2 = "Before sorting the numbers: ";
	static String s3 = "After sorting the numbers:";
	
	public static void main(String[] args) {
		
		
		final int SIZE = keypad.getInput();
		int[] arrayList = new int[SIZE];
		screen.displayMessage(enterInputString);
		for (int i = 0; i < arrayList.length; i++) {
			arrayList[i] = keypad.getInput();
		}
		screen.displayMessage(s2);
		screen.displayArray(arrayList);//--call print on the array input before sorting
		sort.bubbleSort(arrayList);//--call Bubble Sort on the array input
		gcdArray(arrayList);//--call gcd on the array input
		screen.displayMessage(s3);
		screen.displayArray(arrayList);//--call print on the array input after sorting
	}
//--------------------------------------------------------------------------------
	private static void gcdArray(int[] arrayList) {
		int gcd = 1;//--initial gcd
		int k = 2;//--possible gcd
		for (int i = 0; i < arrayList.length; i++) {
			int a = arrayList[i];
			for(int j = i + 1; j< arrayList.length; j++) {
				int b = arrayList[j];
				while (k <= a && k <= b) {//--begin while
					if (a % k == 0 && b % k == 0)//--if conditional
						gcd = k; // Update gcd
					k++;//--increment k
				}
				 System.out.println();
				 screen.displayMessage(thisIsGCD);
				 screen.displayGCD(gcd);
				 System.out.println();
			}
		}
	}//--end gcdArray
	//---------------------------------------------------------------

	
}


/*
 * 
 * OUTPUT TEST #1
 * Welcome to the GCD Calculator!
Enter the number 2 to initialize the array with space for two numbers: 
2
Enter the numbers in any order, recall, we have space for  2 numbers:
65
35
Before sorting the numbers: 

These are the numbers you entered: 
65
35


5***** this is the gcd*****
After sorting the numbers: 

These are the numbers you entered: 
35
65

 * 
 * OUTPUT TEST #2
 * Welcome to the GCD Calculator!
Enter the number 2 to initialize the array with space for two numbers: 
2
Enter the numbers in any order, recall, we have space for  2 numbers:
6
5
Before sorting the numbers: 

These are the numbers you entered: 
6
5


1***** this is the gcd*****
After sorting the numbers: 

These are the numbers you entered: 
5
6

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 