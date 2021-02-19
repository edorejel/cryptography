package caesarcipher.goodrich;

public class CaesarCipherTestHarness {
//	/∗∗ Simple main method for testing the Caesar cipher ∗/
	
	public static void main(String[ ] args) {
		
		CaesarCipher cipher = new CaesarCipher(3);
		
		System.out.println("Encryption code = " + new String(cipher.encoder));
		
		System.out.println("Decryption code = " + new String(cipher.decoder));
		
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
		
		String coded = cipher.encrypt(message);
		
		System.out.println("Secret: " + coded);
				
				String answer = cipher.decrypt(coded);
				
				System.out.println("Message: " + answer);
				// should be plaintext again
				
	}
}

//OUTPUT
/*
Encryption code = DEFGHIJKLMNOPQRSTUVWXYZABC
Decryption code = XYZABCDEFGHIJKLMNOPQRSTUVW
Secret: WKH HDJOH LV LQ SODB; PHHW DW MRH'V.
Message: THE EAGLE IS IN PLAY; MEET AT JOE'S.



*/