
import java.util.Scanner;
import java.util.TreeMap;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String, String> longestMap = new TreeMap<>();
		String longestStr = "";
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		int[] intArr = new int[strArr.length];
		String currentKey = null;
		boolean isCounting = false;


		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		for (int i = 0; i < intArr.length - 1; i++) {
			if(currentKey == null) {
				currentKey = i + "";
			}
			if(intArr[i] < intArr[i + 1]) {
				if(!isCounting) {
					longestMap.put(i + "", "");
					currentKey = i + "";
					isCounting = true;
				}
				if(isCounting) {
					System.out.print(intArr[i] +  " ");
					longestMap.put(currentKey, longestMap.get(currentKey) + intArr[i] + " ");
					if(i == intArr.length - 2) {
						System.out.println(intArr[i + 1]);
						longestMap.put(currentKey, longestMap.get(currentKey) + intArr[i + 1] + " ");
					}
				}
			}
			else {
				if(i >= 1 && intArr[i - 1] >= intArr[i]) {
					currentKey = i + "";
				}
				if(longestMap.get(currentKey) == null) {
					longestMap.put(currentKey, intArr[i] + " ");
				} 
				else {
					longestMap.put(currentKey, longestMap.get(currentKey) + intArr[i] + " ");
				}
				System.out.println(intArr[i] + " ");
				if(i == intArr.length - 2) {
					System.out.println(intArr[i + 1]);
					longestMap.put(currentKey, intArr[i + 1] + " ");
				}
				isCounting = false;
			}
		}
		for (String key : longestMap.keySet()) {
			if(longestMap.get(key).length() / 2 > longestStr.length() / 2) {
				longestStr = longestMap.get(key);
			}
		}
		System.out.println("Longest: " + longestStr);

	}

}
