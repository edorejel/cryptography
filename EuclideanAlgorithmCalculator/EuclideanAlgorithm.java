package ExtEucliAlgorithm.EuclideanAlgorithmCalculator;

import java.util.Scanner;

public class EuclideanAlgorithm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the GCD Calculator");
		System.out.println();
		System.out.println("Enter two numbers: ");
		System.out.println();
		System.out.println("Enter the first number: ");
		int a = input.nextInt();
		System.out.println("Enter the second number: ");
		int b = input.nextInt();
		gcd(a, b);

	}
	
	public static void gcd(int a, int b) {
		String gcdIs = "The GCD is: ";
		int r1 = a;
		int r2 = b;
		int q;
		int r;

		while (r2 > 0) {
			q = r1/r2;
			r = r1 - q * r2;
			r1 = r2;
			r2 = r;
			if (r == 0) {
				System.out.print(gcdIs);
				System.out.println();
				System.out.println(r1);
			}
		}
	}
	
}

//---OUTPUT
/*
 * Welcome to the GCD Calculator

Enter two numbers: 

Enter the first number: 
2740
Enter the second number: 
1760
The GCD is: 
20


 * 
 * 
 * 
 * 
 * 
 * 
 */
