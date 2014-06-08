import java.util.Scanner; 

public class CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().toLowerCase();
		String word = sc.nextLine().toLowerCase();
		
		int count = 0;
	      int index = 0;
	      while ((index = input.indexOf(word, index)) != -1) {
	          count++;
	          index++;
	      }
	      System.out.println(count);
	}

}
