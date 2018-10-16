
package VongLap;
import java.util.Scanner;
public class ElectricBill {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen co 3 chu so ");
		int so = keyboard.nextInt();
		if(so > 0 && so < 1000) { int tram = so/100;
		int chuc = so%100/10;
		int dv = so%100%10;
		System.out.println("Hang tram : " +tram+ " Hang chuc :" +chuc+ "Hang dv :" +dv+ "");
		}
		else {
			System.out.println("Ban da nhap sai ");
		}
	}
}
