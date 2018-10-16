/*Viet chuong trinh nhap vao hai bien so nguyen a va b 
 * Sau do tinh tong va tich cua hai so do. */
package VongLap;

import java.util.Scanner;

public class SumAndMultiple {

	public static void main(String[] args) {
		// Nhap du lieu tu ban phim
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen 1 = ");
		int a = keyboard.nextInt();
		System.out.println("Nhap vao so nguyen 2 = ");
		int b = keyboard.nextInt();
		int c = a + b;
		int d = a*b;
		System.out.println("Tong hai so = "+c+"");
		System.out.println("Tich hai so = "+d+"");		
	}

}
