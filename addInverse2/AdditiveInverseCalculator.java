package cryptography.addInverse2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdditiveInverseCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int modulus = 0;
		int total = 0;
		int j = 0;
		int k = 0;

		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(j, k);

		Set<Pair<Integer, Integer>> set = new HashSet<Pair<Integer, Integer>>();
		int[] addList1 = new int[1];
		System.out.println("Enter " + addList1.length + " modulus value to find the additive inverse");
		for (int i = 0; i < addList1.length; i++) {
			addList1[i] = input.nextInt();//--extract the first int datatype to add
			modulus = addList1[i];
			for (j = 0; j < modulus; j++) {
				for (k = 0; k < modulus; k++) {
					pair.setValue(j, k);
					total = j + k;
					if (total % modulus == 0){
					set.add(new Pair<Integer, Integer>(pair.getValue1(), pair.getValue2()));
					System.out.println(pair.toString());
						
					}
				}
			}
		}
	}}


/*
 * OUTPUT Test #1
 Enter 1 modulus value to find the additive inverse
10
(0, 0)
(1, 9)
(2, 8)
(3, 7)
(4, 6)
(5, 5)
(6, 4)
(7, 3)
(8, 2)
(9, 1)


 * 
 * 
 * 
 * OUTPUT Test #2
 * Enter 1 modulus value to find the additive inverse
20
Enter 1 modulus value to find the additive inverse
20
(0, 0)
(1, 19)
(2, 18)
(3, 17)
(4, 16)
(5, 15)
(6, 14)
(7, 13)
(8, 12)
(9, 11)
(10, 10)
(11, 9)
(12, 8)
(13, 7)
(14, 6)
(15, 5)
(16, 4)
(17, 3)
(18, 2)
(19, 1)


 * 
 * 
 * 
 * */
