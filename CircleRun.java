package VongLap;

import java.util.Scanner;

public class CircleRun {

	public static void main(String[] args) {
		float pi = (float) 3.1415 ; 
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao ban kinh duong tron= "); 
		double r = keyboard.nextDouble(); 
		double c = r*2*pi; 
		System.out.println("Chu vi hinh tron la "+c+""); 
		double s = Math.pow(r, r)*pi; 
		System.out.println("Dien tich hinh tron la "+s+""); 

	}

}
