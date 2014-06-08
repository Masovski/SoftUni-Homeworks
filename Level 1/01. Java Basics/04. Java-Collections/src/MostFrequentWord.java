
import java.util.TreeMap;
import java.util.Scanner;

public class MostFrequentWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		String input = sc.nextLine().toLowerCase();
		String[] words = input.split("\\W+");
		TreeMap<String, Integer> wordsMap = new TreeMap<>();
		
		for (int i = 0; i < words.length; i++) {
			if(!wordsMap.containsKey(words[i])){
				wordsMap.put(words[i], 1);
			}
			else {
				wordsMap.put(words[i], wordsMap.get(words[i]) + 1);
				if(wordsMap.get(words[i]) > max) {
					max = wordsMap.get(words[i]);
				}
			}
		}
		
		for (String key : wordsMap.keySet()) {
			if(wordsMap.get(key) == max) {
				System.out.print(key + " -> " + wordsMap.get(key) + " times");
				System.out.println();
			}
		}
	}
}
