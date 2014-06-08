import java.util.Scanner;
import java.math.*;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aX = sc.nextInt();
		int aY = sc.nextInt();
		
		int bX = sc.nextInt();
		int bY = sc.nextInt();
		
		int cX = sc.nextInt();
		int cY = sc.nextInt();
		
		int area = Math.abs(((aX * (bY - cY)) + (bX * (cY - aY)) + (cX * (aY - bY))) / 2);

		System.out.println(area);
	}

}
