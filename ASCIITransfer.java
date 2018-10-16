/*In ra ma ASCII cua ki tu ma nguoi dung nhap vao tu ban phim*/
package VongLap;

import java.util.Scanner;

public class ASCIITransfer {

	public static void main(String[] args) {
		//Doc du lieu
		Scanner keyboard = new Scanner(System.in); // Muon nhap du lieu tu ban phim thi can phai noi cho no biet la minh se nhap de no cho minh nhap
		System.out.println("Nhap vao 1 ki tu "); // Xuat ra man hinh cau "Nhap vao 1 ki tu"
		String str = keyboard.nextLine();
		for ( int i = 0; i < str.length(); ++i ) {
		char c = str.charAt (i);
		int j = (int) c;
		System.out.println("Ma ASCII la " + j+"");
		}
	}
}
/*Bai hoc kinh nghiem:
 * phai nho noi cho may no biet la minh sap nhap tu ban phim 
 * sau do ta viet code --> xuat ra man hinh dong lenh de nguoi dun biet duoc ho can lam gi
 * 
 */