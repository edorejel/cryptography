package cryptography.multInverse;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MultiplicativeInverseCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int modulus = 0;
		int product = 0;
		int j = 0;
		int k = 0;

		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(j, k);

		Set<Pair<Integer, Integer>> set = new HashSet<Pair<Integer, Integer>>();
		int[] addList1 = new int[1];
		System.out.println("Enter " + addList1.length + " modulus value to find the multiplicative inverse pairs!");
		for (int i = 0; i < addList1.length; i++) {
			addList1[i] = input.nextInt();//--extract the first int datatype to add
			modulus = addList1[i];
			for (j=0; j < modulus; j++) {
				for (k = 0; k < modulus; k++) {
					pair.setValue(j, k);
					product = j * k;
					if (product % modulus == 1){
					set.add(new Pair<Integer, Integer>(pair.getValue1(), pair.getValue2()));
					System.out.println(pair.toString());
						
					}
				}
			}
		}
	}
}


/*
 * OUTPUT Test #1
 Enter 1 modulus value to find the additive inverse
Enter 1 modulus value to find the multiplicative inverse
10
(1, 1)
(3, 7)
(7, 3)
(9, 9)


 * 
 * 
 * 
 * OUTPUT Test #2
Enter 1 modulus value to find the multiplicative inverse
20
(1, 1)
(3, 7)
(7, 3)
(9, 9)
(11, 11)
(13, 17)
(17, 13)
(19, 19)


 * 
 * 
 * 
 * */
