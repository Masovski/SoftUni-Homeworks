import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumNumbersFromText {

	public static void main(String[] args) {
		
		int result = 0;
		File file = new File("Input.txt");
		Scanner scan;
		
		try {
			scan = new Scanner(file);
			if (scan.hasNextLine()) {
	            String line = scan.nextLine();
	             result += Integer.parseInt(line);
	        }
	        if (scan.hasNextLine()) { 
	        	String line = scan.nextLine();
	        	result += Integer.parseInt(line);
	        }
	        System.out.println(result);
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		
		

	}
}
