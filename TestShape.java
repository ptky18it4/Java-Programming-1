package OOP;

//import java.awt.Rectangle;
//import java.awt.Shape;

public class TestShape {

	public static void main(String[] args) {
		/* Tạo 1 mảng kiểu Shape , và khởi tạo các đối tượng Circle,
		 *  Rectangle cho từng phần tử của mảng*/	
		Shape vec [] = {new Circle(3), new Rectangle(4,5), new Circle(4), new Circle(8) };
		/* Gọi hàm toString đẻ in thông tin các phần tử của mảng*/
		
		for (int index = 0; index < vec.length; index ++) {
			System.out.println(vec[index]);
			}
	}
}
/*Tạo lớp ảo chứa ít nhất một phương thức ảo*/
abstract class Shape {
	/*Phương thức ảo không có định nghĩa*/
	public abstract double area();
	/*Trả lại thông tin để hiển thị*/
	public String toString()
	{
		return "Dien tich la : " +area();
	}
}
/*Xây dựng lớp Rectangle , kế thừa lớp trừa tượng Shape, phải định nghĩa lại phương thức ảo area (), nếu không sẽ trở thành lớp */
class Rectangle extends Shape
{	
	/*Khai báo 2 thuộc tính chiều rộng , và chiều cao của lớp Rectangle*/
	private double width, height;
	/*Định nghĩa hàm khởi tạo*/
	public Rectangle(double wVal, double hVal)
	{
		width = wVal;
		height = hVal;
	}
	 /*Định nghĩa lại phương thức area () kế thừa được từ lớp Shape*/
	public double area()
	{
		return width*height;
	}
}
/*Xây dựng lớp Cricle, kế thừa lớp trừu tượng Shape, phải định nghĩa lại phương thức ảo area(), nếu không sẽ rở thành lớp ảo */
class Circle extends Shape
{
	/*Khai báo thuộc tính bán kính*/
	private double radius;
	/*Phương thức khởi tạo*/
	public Circle (double rad)
	{
		radius = rad;
	}
	/*Định nghĩa lại phương thức diện tích*/
	public double area()
	{
		return Math.PI * radius * radius;
	}
	
}
