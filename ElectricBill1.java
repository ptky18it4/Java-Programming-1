package VongLap;

import java.util.Scanner;

public class ElectricBill1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao chi so cu : ");
		float csc = keyboard.nextFloat();
		System.out.println("Nhap vao chi so moi :");
		float csm = keyboard.nextFloat();
		System.out.println("Nhao vao m1 : ");
		float m1 = keyboard.nextFloat();
		System.out.println("Nhao vao m2 : ");
		float m2 = keyboard.nextFloat();
		System.out.println("Nhao vao m3 : ");
		float m3 = keyboard.nextFloat();
		if (csm > csc) {
			float n = csm - csc;
			if (n<200) {
				if (n<=100) {
					float tien = m1*n ;
							System.out.println("Tien dien thang m1=" +tien+ "");
				}
				else {
					float tien = m2*n;
					System.out.println("Tien dien thang la m 2"+tien+"");
					}
			}
				else {
					float tien = m3*n;
					System.out.println("Tien dien thang m3 la = "+tien+ "");
					}
			}
			else 
				System.out.println("Ban nhap sai");
		}
	}


