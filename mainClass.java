import java.util.Scanner;

public class mainClass {
	public static void main(String args[]) {
		myMaps.fillMap();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("<---Welcome to the Number-Systems Converter that converts one Number System to another--->");
		System.out.println("~~~Accepted Number Systems are: Binary , Decimal , Hexadecimal and Octal~~~");
		System.out.println("Enter any key to continue");
		keyboard.next();
		
		String choice;
		boolean response;
		do {
			optimizeOptions(keyboard);
			System.out.println("Try Again? Y/N");
			choice = keyboard.next();
			response = choice.equalsIgnoreCase("Y");
		} while (response);
	}
	
	private static void optimizeOptions(Scanner keyboard) {
		String options[] = new String[]{"Binary", "Decimal", "Hexadecimal", "Octal"};
		System.out.println("Choose the Number System to convert FROM: (Choose 1-4) ");
		for (int i = 0; i < options.length; i++) {
			System.out.println((i + 1) + ". " + options[i]);
		}
		String choice = keyboard.next();
		String ch;
		
		switch (choice) {
			case "1":
				
				//<editor-fold desc="Conversion FROM Binary ">
				System.out.println("Choose the appropriate option (1-3) : ");
				for (int i = 1; i < options.length; i++) {
					System.out.println(i + "." + options[0] + " to " + options[i]);
				}
				ch = keyboard.next();
				switch (ch) {
					case "1":
						
						System.out.println("Enter the Binary number to convert FROM: ");
						double val = keyboard.nextDouble();
						Binary.toDecimal(val);
						break;
					case "2":
						System.out.println("Enter the Binary number to convert FROM: ");
						double val1 = keyboard.nextDouble();
						Binary.toHexadecimal(val1);
						break;
					case "3":
						System.out.println("Enter the Binary number to convert FROM: ");
						double val2 = keyboard.nextDouble();
						Binary.toOctal(val2);
						break;
					default:
						System.err.println("Invalid Option! Please try again...");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException ignored) {
						}
						optimizeOptions(keyboard);
						break;
				}
				break;
			//</editor-fold>
			
			case "2":
				//<editor-fold desc="Conversion FROM Decimal">
				System.out.println("Choose the appropriate option (1-3) : ");
				
				for (int i = 0, index = 1; i < options.length; i++) {
					if (i == 1) continue;
					System.out.println(index++ + "." + options[1] + " to " + options[i]);
				}
				double value;
				ch = keyboard.next();
				switch (ch) {
					case "1":
						System.out.println("Enter the Decimal number to convert FROM: ");
						value = keyboard.nextDouble();
						System.out.println(value + " represented in Binary Number System is: " + Decimal.toBinary(value));
						break;
					case "2":
						System.out.println("Enter the Decimal number to convert FROM: ");
						value = keyboard.nextDouble();
						System.out.println(value + " represented in Hexadecimal Number System is: " + Decimal.toHexadecimal(value));
						break;
					case "3":
						System.out.println("Enter the Decimal number to convert FROM: ");
						value = keyboard.nextDouble();
						System.out.println(value + " represented in Hexadecimal Number System is: " + Decimal.toOctal(value));
						break;
					default:
						System.err.println("Invalid Option! Please try again...");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException ignored) {
						}
						optimizeOptions(keyboard);
						break;
				}
				break;
			//</editor-fold>
			
			case "3":
				
				System.out.println("Choose the appropriate option (1-3) : ");
			
				for (int i = 0, index = 1; i < options.length; i++) {
					if (i == 2) continue;
					System.out.println(index++ + "." + options[2] + " to " + options[i]);
				}
				ch = keyboard.next();
				switch (ch) {
					case "1":
						Hexadecimal.toBinary();
						break;
					case "2":
						Hexadecimal.toDecimal();
						break;
					case "3":
						Hexadecimal.toOctal();
						break;
					default:
						System.err.println("Invalid Option! Please try again...");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException ignored) {
						}
						optimizeOptions(keyboard);
						break;
				}
				break;
			
			case "4":
				
				
				System.out.println("Choose the appropriate option (1-3) : ");
				for (int i = 0, index = 1; i < options.length; i++) {
					if (i == 3) continue;
					System.out.println(index++ + "." + options[3] + " to " + options[i]);
				}
				String input;
				ch = keyboard.next();
				switch (ch) {
					case "1":
						System.out.println("Enter the Octal number to convert FROM: ");
						input = keyboard.nextLine();
						System.out.println(input + "represented in Binary Number System is: " + Octal.toBinary(input));
						break;
					case "2":
						System.out.println("Enter the Octal number to convert FROM: ");
						input = keyboard.nextLine();
						System.out.println(input + "represented in Decimal Number System is: " + Octal.toDecimal(input));
						break;
					case "3":
						System.out.println("Enter the Octal number to convert FROM: ");
						input = keyboard.nextLine();
						System.out.println(input + "represented in Hexadecimal Number System is: " + Octal.toHexadecimal(input));
						break;
					default:
						System.err.println("Invalid Option! Please try again...");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException ignored) {
						}
						optimizeOptions(keyboard);
						break;
				}
				
				break;
				
			default:
				System.err.println("Invalid Option! Please try again...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ignored) {
				}
				optimizeOptions(keyboard);
				break;
				
		}
	}
}