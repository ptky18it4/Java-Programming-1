/*Nhap vao 3 so va tinh gia tri trung binh cua 3 so
 * Yeu cau ,ket qua in ra chi co 3 con so o phan thap phan*/
package VongLap;
import java.util.Scanner;
public class Average3Number {

	public static void main(String[] args) {
		//Nhap du lieu tu ban phim
		Scanner keyboard = new Scanner(System.in); // Dieu kien bat buoc phai co khi muon nhap duo lieu tu ban phim
		System.out.println("Nhap vao x = ");
		float x = keyboard.nextFloat();
		System.out.println("Nhap vao gia tri cua y = ");
		float y = keyboard.nextFloat();
		System.out.println("Nhap vao z = ");
		float z = keyboard.nextFloat();
		/*Dinh dan gia tri trung binh in ra o dang chi co 3 so thap phan*/
		java.text.DecimalFormat df = new java.text.DecimalFormat("#.000"); 
		/*Dieu kien cua so thap phan xuat ra : ta dung ham java.text.DecimalFormat("#.000"), 
		 * muon xuat ra bao nhieu chu so thi ta dat sau dau cham bay nhieu co n so 0 */
		float a = (x+y+z) / 3;
		System.out.println("Gia tri trung binh con cua 3 so la "+ df.format(a)+"");
		
	}

}
