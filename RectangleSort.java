package OOP;
import java.util.*;
public class RectangleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle vec[];
		vec = new Rectangle[10];
		double randomWidth = 0 , randomHeight = 0;
		for (int index = 0; index < vec.length; index ++) {
			randomWidth = 100 * Math.random();
			randomHeight = 100 * Math.random();
			vec [index] = new Rectangle(randomWidth, randomHeight);
			
		} 
		Arrays.sort(vec);
		for (int index = 0; index < vec.length; index ++) {
			System.out.println("Dien tich HCN " + index+"="+Math.round(vec[index].area())+ ",");
		}
	}
}
abstract class Shape1 
{
	abstract double area();
	public String toString()
	{
		return "area="+ area();
	}
}
class Rectangle extends Shape implements Comparable
{
	double width;
	double height;
	
Rectangle(double w, double h)
{
	width = w;
	height = h;
}
public double area() 
{
	return width*height;
}
public int CompareTo(Object other)
{

	Shape otherRect= (Shape)other;
	return (int)(this.area()-otherRect.area());
}
}
