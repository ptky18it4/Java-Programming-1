import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayYear {

	public static void main(String[] args) throws ParseException {
	System.out.println("Nhap ngay thang nam :");
	Scanner nhap = new Scanner(System.in);
	String dateInString = nhap.nextLine();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date today = formatter.parse(dateInString);
	Date tomorrow = new Date(today.getTime()+ (1000*60*60*24));
	System.out.println(formatter.format(tomorrow));

	}

}
