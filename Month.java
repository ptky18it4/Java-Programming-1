/*Nhap vao 1 thang, in ra thang do co bao nhieu ngay */
package VongLap;

import java.util.Scanner;

public class Month {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Nhap vao thang ma ban muon biet no co bao nhieu ngay : ");
		int  thang = keyboard.nextInt();
		switch (thang){
		case 4:		
		case 6:			
		case 9:
		case 11:
			System.out.println("Thang " +thang+ "co 30 ngay.");
			break;
		case 1:			
		case 3:			
		case 5:			
		case 7:			
		case 8:			
		case 10:			
		case 12: 
			System.out.println("Thang " +thang+ " co 31 ngay");
			break; 
		case 2:
			int i;
			System.out.println("Moi ban nhap nam : ");
			i = keyboard.nextInt();
			if ((i %4 == 0) && (i % 100 !=0)  || (i % 400==0))
			System.out.println("Thang" +thang+ "nam" +i+ "co 29 ngay.");
			else 
			System.out.println("Thang " + 2 + " cua nam nay co 28 ngay");
			break;
			default :
				System.out.println("Khong hop le");
				
		}
	}

}