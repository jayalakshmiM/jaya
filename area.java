import java.util.Scanner;

public class area 
{
	double area(float radius)
	{
		return 3.14*radius*radius;
	}
	double area(float len,float wid)
	{
		return len*wid;
	}
	double area1(float hei,float base)
	{
		return 0.5*hei*base;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		area obj=new area();
		float r=sc.nextFloat();
		float l=sc.nextFloat();
		float w=sc.nextFloat();
		float h=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("Area of circle:"+obj.area(r));
		System.out.println("Area of triangle:"+obj.area1(h,b));
		System.out.println("Area of rectangle:"+obj.area(l,b));
	}
	
}
