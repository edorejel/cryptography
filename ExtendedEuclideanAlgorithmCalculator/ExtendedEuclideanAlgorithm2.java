package ExtEucliAlgorithm.ExtendedEuclideanAlgorithmCalculator;

import java.util.Scanner;

public class ExtendedEuclideanAlgorithm2 {

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



		String gcdIs = "\nThe GCD is: ";
		String multiInvIs = "The multiplicative inverse is: ";
		int r1 = a;
		int r2 = b;
		if (r1 < r2) {
			int temp = r1;
			r1 = r2;
			r2 = temp;
		}
		int q;
		int r;
		int t1 = 0;
		int t2 = 1;
		int t;

		while (r2 > 0) {
			q = r1/r2;
			r = r1 - q * r2;
			r1 = r2;
			r2 = r;

			t = t1 - q * t2;
			t1 = t2;
			t2 = t;


			if (r == 0) {
				System.out.print(gcdIs);
				System.out.println();
				System.out.println(r1);
			}

			if (r1 == 1) {
				System.out.print(multiInvIs);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print(t1);
				if (t1 < 0) {
					System.out.println("\nOR");
					if (a < b) {
						System.out.print(t1 + b);
					}else {
						System.out.print(t1 + a);
					}
				}

			}
		}
		
	}
}

//---OUTPUT
/*
 * Welcome to the GCD Calculator

Enter two numbers: 

Enter the first number: 
11
Enter the second number: 
26

The GCD is: 
1
The multiplicative inverse is: 


-7
OR
19

Welcome to the GCD Calculator

Enter two numbers: 

Enter the first number: 
26
Enter the second number: 
11

The GCD is: 
1
The multiplicative inverse is: 


-7
OR
19



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
 * 
 * 
 * 
 * 
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
