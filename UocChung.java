package VongLap;

import java.util.Scanner;

public class UocChung {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Nhap vao so n");
		int n = keyboard.nextInt();
		for(int i=1; i < n; i++) 
		if (n % i == 0 )
			System.out.println(""+i);
	}

}
