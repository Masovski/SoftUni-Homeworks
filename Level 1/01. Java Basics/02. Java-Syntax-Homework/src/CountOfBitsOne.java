import java.util.Scanner;

public class CountOfBitsOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = Integer.bitCount(n);
		
		System.out.println(result);
	}

}
