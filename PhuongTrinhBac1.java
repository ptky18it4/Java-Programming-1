/*Gia phuong trình bac 1 : ax +b = 0
 * Khoi tao bien a,b,x
 *  */
package VongLap;

import java.util.Scanner;

public class PhuongTrinhBac1 {

	private static Scanner keyboard;
	public static void main(String[] args){
		int a,b;
		keyboard = new Scanner(System.in);
		System.out.println("Ban dan giai phuong trinh dang ax +b = 0 ");
		System.out.println("Nhap vao a = ");
		a = keyboard.nextInt();
		System.out.println("Nhap vao b = ");
		b = keyboard.nextInt();
			if (a == 0)
				if (b == 0 )
					System.out.println("Phuong trinh vo so nghiem");
				else 
					System.out.println("Phuong trinh vo nghiem");
			else
				System.out.println("Phuong trinh co nghiem" +(float) -b/a);
	}

}
