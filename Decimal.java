import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Decimal {
	private static int BASE;
	
	static String toBinary(double value) {
		BASE = 2;
		return String.valueOf(convertFromDecimal(value, "BINARY"));
	}
	
	static String toHexadecimal(double value) {
		BASE = 16;
		return String.valueOf(convertFromDecimal(value, "HEX"));
	}
	
	static String toOctal(double value) {
		BASE = 8;
		return String.valueOf(convertFromDecimal(value, "OCTAL"));
	}
	
	private static String convertFromDecimal(double value, String numberSystem) {
		String strValue = String.valueOf(value);
		String[] parts = strValue.split("\\.");
		String integerPart = parts[0], decimalPart = parts[1];
		StringBuilder integerConvert = new StringBuilder();
		
		/*Converting the Integer part of 'value'*/
		
		int num = Integer.parseInt(integerPart);
		do {
			int moduloDivision = num % BASE;
			String stringModulo = String.valueOf(moduloDivision);
			//for hexadecimal, we need to convert 10 -> A , 11-> B .....15->F
			if (numberSystem.equals("HEX")) {
				if (myMaps.hexadecimalMap_FromINT.containsKey(moduloDivision)) {
					char tempConversion = myMaps.hexadecimalMap_FromINT.get(moduloDivision);
					stringModulo = String.valueOf(tempConversion);
				}
			}
			
			integerConvert.append(stringModulo);
			num /= BASE;
		} while (num > 0);
		//After Modulo Division, binary numbers are read in Bottom-Top manner. Thus, reversing the contents to match the same
		integerConvert.reverse();
		
		/* Converting Fractional part (the one after '.') of 'value'*/
		
		//suppose value=1.45.Then decimalPart = 45 (using split). To get 45 as a decimal (0.45) the following conversion is made
		double decimal = Double.parseDouble(0 + "." + decimalPart);
		StringBuilder decimalConvert = new StringBuilder();
		if (decimal != 0d) {
			String part[];
			double temp = decimal;
			do {
				//fractional part is multiplied with BASE till the part after '.' is equal to zero
				temp = temp * BASE;
				String str = String.valueOf(temp);
				part = str.split("\\.");
				decimalConvert.append(part[0]);
				temp = temp > 1 ? (temp - 1.0) : temp;
			} while (Double.parseDouble(part[1]) != 0);
		}
		//if decimal part is empty (in case user had entered a whole number, print only the integer part
		// else print both integer and decimal part
		String tempDecimal = decimalConvert.toString().isEmpty() ? "" : ("." + decimalConvert.toString());
		return (integerConvert.toString() + tempDecimal);
	}
	
}