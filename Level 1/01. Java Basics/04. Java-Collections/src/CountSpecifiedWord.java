import java.util.Scanner;

public class CountSpecifiedWord {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = input.split("\\W+");
		String word = sc.nextLine();
		
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equalsIgnoreCase(word)) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
