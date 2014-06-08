import java.util.Scanner;

public class PointsInsideTheHouse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float leftBottomTriangleX = 12.5f;
		float leftTopTriangleX = 17.5f;
		float leftBottomTriangleY = 8.5f;
		float leftTopTriangleY = 3.5f;
		
		float rightBottomTriangleX = 22.5f;
		float rightTopTriangleX = 17.5f;
		float rightBottomTriangleY = 8.5f;
		float rightTopTriangleY = 3.5f;
		
		while(true) {
			float x = sc.nextFloat();
			float y = sc.nextFloat();
			
			int leftPosition = (int) Math.signum ( (leftTopTriangleX-leftBottomTriangleX)*(y-leftBottomTriangleY) - 
		             							   (leftTopTriangleY-leftBottomTriangleY)*(x-leftBottomTriangleX) );

			int rightPosition = (int) Math.signum ( (rightTopTriangleX-rightBottomTriangleX)*(y-rightBottomTriangleY) - 
													(rightTopTriangleY-rightBottomTriangleY)*(x-rightBottomTriangleX) );
			
			boolean insideTriangle = (leftPosition >= 0 && y <= leftBottomTriangleY) && 
					          		 (rightPosition <= 0 && y <= rightBottomTriangleY);
			boolean inFigureWidth = x >= 12.5f && x <= 22.5f;
			boolean inFigureHeight = y >= 8.5f && y <= 13.5f;
			boolean inFigureSpace = (x > 17.5f && y > 8.5f) && x < 20f;
			
			if(insideTriangle) {
				System.out.println("Inside");
			}
			else if(inFigureWidth && inFigureHeight && !inFigureSpace) {
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
			}
			
		}
		
	}

}
