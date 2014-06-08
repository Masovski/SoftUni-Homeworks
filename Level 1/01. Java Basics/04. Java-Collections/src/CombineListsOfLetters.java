import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String firstLine = sc.nextLine();
		String secondLine = sc.nextLine();
		
		String[] firstStrArr = firstLine.split(" ");
		String[] secondStrArr = secondLine.split(" ");
		
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> tempList = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		
		for (int i = 0; i < firstStrArr.length; i++) {
			l1.add(i, firstStrArr[i].charAt(0));
		}
		tempList.addAll(l1);
		
		for (int i = 0; i < secondStrArr.length; i++) {
			l2.add(i, secondStrArr[i].charAt(0));
		}
		for (int i = 0; i < l2.size(); i++) {
			if(!(tempList.contains(l2.get(i)))) {
				l1.add(l2.get(i));
			}
		}
		for (Character character : l1) {
			System.out.print(character + " ");
		}

	}

}
