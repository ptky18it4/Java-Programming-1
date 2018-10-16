/*Nhap so nguyen duong N gom 5 chu so . viet ham kiem tra N co doi xung khong*/
package VongLap;

import java.util.Scanner;

public class NumberDescriptor {

	public static void main(String[] args) {
		// Nhap du lieu tu ban phim
		int temp, rem, rever = 0 ; // rever : dao nguoc
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong co 5 chu so");
		int n = keyboard.nextInt();
		temp = n;
		while(temp !=0) {
			rem = temp % 10;
			rever = rever*10 + rem;
			temp /=10; //temp = temp/10
			}
		if (rever == n)
			System.out.print(" La so doi xung");
		else 
			System.out.println("La so khong doi xung ");
		
	}

}
