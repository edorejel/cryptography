package cryptography.gcd.bubbleSort;
//--Sort.java functions as a sorting machine
//--Sort.java sorts the user input so that the user can enter the numbers in any order and still
//--receive a correct answer
//--check for entry of numbers only has not been added yet
public class Sort {
	//---------------------------------------------------------------------------
	public void bubbleSort(int[] arrayList) {//--begin bubble sort
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
		
	}//--end bubble sort
//-----------------------------------------------------------------------------
}
