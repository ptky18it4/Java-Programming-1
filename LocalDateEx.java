package OOP;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
public class LocalDateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println("\nNow :"+time);
		System.out.println("\n");
		/*LocalTime time = LocalTime.now();
		System.out.println("Now :"+date);
		System.out.println("Now :"+time);
		System.out.println("Ngay "+date.getDayOfMonth()+" Thang "+
		                     + date.getMonthValue() +" Nam " +date.getYear());
		*/
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		date = date.minusDays(today-1);
		DayOfWeek dow = date.getDayOfWeek();
		int value = dow.getValue();
		System.out.println("Mon Tue Wed Thus Fri Sat Sun ");
		for ( int i =1; i < value; i++) {
			System.out.print("    ");
		}
		while(date.getMonthValue() == month ) {
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue()==1)
			System.out.println("\n");
			
		}
	}

}
