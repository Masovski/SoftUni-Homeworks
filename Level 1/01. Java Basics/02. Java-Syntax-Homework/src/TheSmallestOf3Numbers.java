import java.util.Scanner;

public class TheSmallestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextFloat();
		double b = sc.nextFloat();
		double c = sc.nextFloat();
		
		double smallest = Math.min(a, Math.min(b, c));

		System.out.println((float)smallest);
	}

}
