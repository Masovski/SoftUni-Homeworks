import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int n = sc.nextInt();
		char[] suits = {'♣', '♦', '♥', '♠' };
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				int face = 2 + rnd.nextInt(13);
				char suit = suits[rnd.nextInt(4)];
				switch (face) {
				case 11: 
					System.out.print("J" + suit + " ");
					break;
				case 12: 
					System.out.print("Q" + suit + " ");
					break;
				case 13:
					System.out.print("K" + suit + " ");
					break;
				case 14:
					System.out.print("A" + suit + " ");
					break;
				default:
					System.out.print(face + "" + suit + " ");
					break;
				}
			}
			System.out.println();
		}

	}

}
