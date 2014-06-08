import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		String firstDate = sc.nextLine();
		String secondDate = sc.nextLine();

		try {
		    Date date1 = myFormat.parse(firstDate);
		    Date date2 = myFormat.parse(secondDate);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println (TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}
	}

}
