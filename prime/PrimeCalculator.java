package cryptography.prime;

import java.util.Scanner;

public class PrimeCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to check for primeness: ");
		int num = input.nextInt();
		prime(num);
	}


	public static void prime(int num) {
        String notPrime = "Not a prime!";
        String primeNum = "Prime numer!";
		int divisor = 2; 
		int quotient = (num/divisor);
		int checkPrime = quotient % divisor;
		int remainder = quotient % divisor;
		int product = (quotient * divisor);
		System.out.println(num + " this is the number you entered");
		System.out.println(quotient + " this is the quotient resulting from dividing by " + divisor);
		System.out.println(remainder +  " this is the remainder");
		if (remainder == 0) {
			System.out.println(notPrime);
		}
		if (remainder != 0) {
			System.out.println(primeNum);
		}
		System.out.println(product + " this is the product resulting from multiplying " + quotient + " by " + divisor);
		int quotient2 = product/divisor;
		System.out.println("this is even " + quotient2);


	}
}



/*
 * Test #1
 *Enter a number to check for primeness: 
5
5 this is the number you entered
2 this is the quotient resuling from dividing by 2
1 this is the remainder
4 this is the product resulting from multiplying 2 by 2
4 is divisible by 2, so 5 is prime


Test #2
Enter a number to check for primeness: 
159
159 this is the number you entered
79 this is the quotient resulting from dividing by 2
1 this is the remainder
158 this is the product resulting from multiplying 79 by 2
1
158 is divisible by 2, so 159 is prime

Test #3
Enter a number to check for primeness: 
157
157 this is the number you entered
78 this is the quotient resulting from dividing by 2
1 this is the remainder
156 this is the product resulting from multiplying 78 by 2
0
156 is divisible by 2, so 157 is prime


 *
 * 
 * 
 * 
 * 
 * 
 * 
 * */
