import java.util.Scanner;

public class largest 
{
	public static void main(String[] args)
	{
		 int x, y, z;
	      System.out.println("Enter the integers ");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	      z = in.nextInt();
	 
	      if ( x > y && x > z )
	         System.out.println(x);
	      else if ( y > x && y > z )
	         System.out.println(y);
	      else if( z > x && z > y )
	         System.out.println(z);
	    	}

}
