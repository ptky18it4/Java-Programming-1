/*Tinh P(n) = 1.3.5..(2n+1)*/
package VongLap;

import java.util.Scanner;

public class MultipleOdd {

	public static void main(String[] args) {
		// Nhap du lieu tu ban phim
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Nhap vao n = ");
		int n = keyboard.nextInt();
		int s = 1;
		for (int i=1; i<=n; i++) {
			s = s * (2*i+1);
			}
		System.out.println("P("+n+") = "+s+"");
	}

}
/*dong     noi dung
 * 10      Thong bao cho may biet : ta sap nhap cai gi do vao may
 * 11		xuat ra man hinh cau len trong dau ngoac kep
 * 12		Khai bao bien n de nhap 
 * 13		Khoi tao bien tong s = 1 (vi neu s = 0 thi tich cac so sau cung se bang 0
 * 14		Vong lap for(khoi tao bien i va gan i=1; i be hon hoac bang n ; i tang len 1 don vi sau moi lan lap)
 * 15 		Sau moi lan lap lai thi tong s = s + (2*i+1)
 * 16		xuat ra ma hinh ket qua
 * */

 