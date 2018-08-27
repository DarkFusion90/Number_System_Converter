import java.util.Scanner;

class Hexadecimal {
	private static Scanner keyboard = new Scanner(System.in);
	
	static void toBinary() {
		long decimalEquiv = toDecimal();
		System.out.println("Final Binary is: " + Decimal.toBinary(decimalEquiv));
	}
	
	static long toDecimal() {
		char[] parts;
		System.out.println("Enter the Hexadecimal number to convert FROM: ");
		String hexNumber = keyboard.nextLine();
		parts = hexNumber.toCharArray();
		long decimalEquivalent, finalDecimal = 0, index = 0;
		for (int i = parts.length - 1; i >= 0; i--) {
			//to convert A , B...F to 10,11...15
			char ch = parts[i];
			if (myMaps.hexadecimalMap_FromCHAR.containsKey(ch)) {
				decimalEquivalent = myMaps.hexadecimalMap_FromCHAR.get(ch);
			} else {
				decimalEquivalent = ch - '0';  //getting int equivalent of char (using casting may return ASCII value)
			}
			
			finalDecimal += decimalEquivalent * Math.pow(16, index++);
		}
		
		return finalDecimal;
	}
	
	static void toOctal() {
		toBinary();
	}
	
}
