/* giai phuong trinh bac nhat ax + b = 0*/
package VongLap;

import java.util.Scanner;

public class Ptbac1 {

	private static String x; //nghiem phuong trinh
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Giai Phuong Trinh Bac Nhat ax + b = 0 ");
		System.out.println("Nhap vao a = ");
		int a = keyboard.nextInt();
		System.out.println("Nhap vao b = ");
		int b = keyboard.nextInt();
		if ( a == 0) {
			if (b==0) 
			System.out.println("Phuong trinh vo so nghiem");			
			else
				System.out.println("Phuong trinh vo nghiem");
		}
		else 
			System.out.println(" Phuong trinh co nghiem x = " +(float)-b/a); // ep kieu cho ket qua
		}
		
	}

