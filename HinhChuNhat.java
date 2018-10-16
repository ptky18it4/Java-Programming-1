package VongLap;
import java.util.Scanner;
public class HinhChuNhat {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Nhap vao chieu dai = ");
		double cd = keyboard.nextDouble();
		System.out.println("Nhap vao chieu rong = ");
		double cr = keyboard.nextDouble();
		double c = (cd + cr) * 2 ;
		System.out.println("Chu vi hinh chu nhat = " +c+ "");
		double s = cd * cr;
		System.out.println("Dien tich hinh chu nhat = " +s+"");
		double dc = Math.sqrt(Math.pow(cd,2) + Math.pow(cr,2));
		System.out.println("Do dai duong cheo = " +dc+ "");
		}

}
