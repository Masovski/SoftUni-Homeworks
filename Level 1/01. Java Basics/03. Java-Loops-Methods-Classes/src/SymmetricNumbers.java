import java.util.Scanner;

public class SymmetricNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			int length = String.valueOf(i).length();
			
			if(length == 3 && i / 100 == i % 10) {
				System.out.print(i + " ");
			}
			else if(length == 2 && i / 10 == i % 10 ) {
				System.out.println(i + " ");
			}
			else if(length == 1) {
				System.out.println(i + " ");
			}
		}

	}

}
