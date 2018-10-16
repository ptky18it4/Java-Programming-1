/*Tinh tong S(n)=1+1.2+1.2.3+...+1.2.3...n*/
package VongLap;

import java.util.Scanner;

public class MultipleFunc {

	public static void main(String[] args) {
		// Nhap du lieu tu ban phim
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao n = ");
		int n = keyboard.nextInt();
		int s = 0 ; // khoi tao bien tong s
		int test = 1; //khoi tao mo bien test va gan test = 1
		for (int i=1; i<=n; i++) {
		test = test * i;
		s = s + test ; // sau moi lan tang i thi tong s se bang s + (test*i)
	}
	System.out.println("S ("+n+") = "+s+""); //xuat ra man hinh ket qua
}
}