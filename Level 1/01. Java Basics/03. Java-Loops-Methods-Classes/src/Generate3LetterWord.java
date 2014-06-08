import java.util.Scanner;

public class Generate3LetterWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		if(input.length() == 1) { 
			System.out.println(input + input + input);
		}
		if(input.length() == 2) {
			for (int i = 0; i < input.length(); i++) {
				char firstChar = String.valueOf(input).charAt(i);
				for (int j = 0; j < input.length(); j++) {
					char secondChar = String.valueOf(input).charAt(j);
					for (int k = 0; k < input.length(); k++) {
						char thirdChar = String.valueOf(input).charAt(k);
						System.out.println(firstChar + "" + secondChar + "" + thirdChar + "");
					}
				}
			}
		}
		if(input.length() == 3) {
			for (int i = 0; i < input.length(); i++) {
				char firstChar = String.valueOf(input).charAt(i);
				for (int j = 0; j < input.length(); j++) {
					char secondChar = String.valueOf(input).charAt(j);
					for (int k = 0; k < input.length(); k++) {
						char thirdChar = String.valueOf(input).charAt(k);
						System.out.println(firstChar + "" + secondChar + "" + thirdChar + "");
					}
				}
			}
		}

	}

}
