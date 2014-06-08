import java.util.Scanner;
import java.util.LinkedHashMap;

public class CardsFrequencies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] cards = input.split("\\W+");
		LinkedHashMap<String, Integer> cardsMap = new LinkedHashMap<>();
		
		for (int i = 0; i < cards.length; i++) {
			if(!cardsMap.containsKey(cards[i])){
				cardsMap.put(cards[i], 1);
			}
			else {
				cardsMap.put(cards[i], cardsMap.get(cards[i]) + 1);
			}
		}

		for (String key : cardsMap.keySet()) {
			System.out.printf(key + " -> " + "%.2f%%", 
			         		 ((double)cardsMap.get(key) / cards.length * 100));
			System.out.println();
		}
	}

}
