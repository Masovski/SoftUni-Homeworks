import java.util.ArrayList;
import java.util.Scanner;

public class ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine().toLowerCase();
		String[] words = input.split("\\W+");
		
		ArrayList<String> finalWords = new ArrayList<>();
		
		for (int i = 0; i < words.length; i++) {
			if(!finalWords.contains(words[i])) {
				finalWords.add(words[i]);
			}
		}
		finalWords.sort(null);
		
		for (String str : finalWords) {
			System.out.print(str + " ");
		}
	}

}
