import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		String padding = "0000000000";
		String aBin = padding + Long.toBinaryString(a);
		aBin = aBin.substring(aBin.length() - 10, aBin.length());
		
		System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|", a, aBin, b, c);

	}

}
