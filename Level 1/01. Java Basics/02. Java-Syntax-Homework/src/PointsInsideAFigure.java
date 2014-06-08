import java.util.Scanner;

public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//Drawing the rectangle 
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			
			boolean inFigureWidth = x >= 12.5f && x <= 22.5f;
			boolean inFigureHeight = y >= 6f && y <= 13.5f;
			boolean inFigureSpace = (x > 17.5f && y > 8.5f) && x < 20f;
			
			if(inFigureWidth && inFigureHeight && !inFigureSpace) {
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
			}
		}
	}

}
