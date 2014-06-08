import java.util.Scanner;

public class CountOfEqualBitPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int bitsLength = 32 - Integer.numberOfLeadingZeros(n);
		int count = 0;
		
		for (int i = 0; i < bitsLength - 1; i++) {
			int firstBit = getBit(n, i);
			int secondBit = getBit(n, i + 1);
			
			if(firstBit == secondBit) {
				count++;
			}
		}
		
		System.out.println(count);

	}
	public static int getBit(int number, int position)
	{
	   return (number >> position) & 1;
	}

}
