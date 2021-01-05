package cryptography.keyedTranspositionCipher;

public class SortingMachine {
	
	public void bubbleSort(int[] arrayList) {
		boolean needNextPass = true;
		for (int k = 1; k < arrayList.length && needNextPass; k++) {
			needNextPass = false;
			for (int i = 0; i < arrayList.length - k; i++ ) {
				if( arrayList[i] > arrayList[i+1]) {
					int temp = arrayList[i];
					arrayList[i] = arrayList[i+1];
					arrayList[i+1] = temp;
					needNextPass = true;
				}
			}
		}
		
	}
}
