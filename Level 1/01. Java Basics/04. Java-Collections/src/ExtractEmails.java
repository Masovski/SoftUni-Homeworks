import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String emailRegex = "[0-9a-zA-Z][-0-9a-zA-Z.+_]+[0-9a-zA-Z]+@[0-9a-zA-Z]+\\.[a-zA-Z]{2,7}";
		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher emailMatcher = emailPattern.matcher(input);
		while(emailMatcher.find()) {
			System.out.println(emailMatcher.group());
		}
	}

}
