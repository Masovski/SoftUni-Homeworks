import java.util.Scanner;

public class SequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		
		for (int i = 0; i < strArr.length; i++) {
			if(i + 1 < strArr.length && strArr[i].equals(strArr[i + 1])) {
				System.out.print(strArr[i] + " ");
			}
			else {
				System.out.println(strArr[i]);
			}
		}
	}

}
