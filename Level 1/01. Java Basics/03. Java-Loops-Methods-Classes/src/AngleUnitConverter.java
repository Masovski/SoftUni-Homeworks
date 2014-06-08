import java.util.Scanner;

public class AngleUnitConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double number = sc.nextFloat();
			String measure = sc.next();
			
			if(measure.contains("deg")) { 
				System.out.printf("%.6f rad", getRadians(number) );
			}
			else if(measure.contains("rad")) {
				System.out.printf("%.6f deg", getDegrees(number));
			}
		}
		
	}
	public static double getRadians(double degrees) {
		double radians = Math.toRadians(degrees);
		
		return radians;
	}
	public static double getDegrees(double radians) { 
		double degrees = Math.toDegrees(radians);
		
		return degrees;
	}

}
