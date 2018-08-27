import java.util.Scanner;

class Octal {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	static long toBinary(String octalNumber) {
		long decimalEquiv = toDecimal(octalNumber);
		return Long.parseLong(Decimal.toBinary(decimalEquiv));
	}
	
	static long toDecimal(String octalNumber) {
		char[] parts;
		parts = octalNumber.toCharArray();
		long decimalEquivalent, finalDecimal = 0, index = 0;
		for (int i = parts.length - 1; i >= 0; i--) {
			//to convert A , B...F to 10,11...15
			char ch = parts[i];
			decimalEquivalent = ch - '0';  //getting int equivalent of char (using casting may return ASCII value)
			finalDecimal += decimalEquivalent * Math.pow(8, index++);
		}
		return finalDecimal;
	}
	
	static long toHexadecimal(String octalNumber) {
		return toBinary(octalNumber);
	}
	
}
