import java.util.Scanner;

public class leap
{
	public static void main(String[] args)
	{
		int year;
		 
        Scanner input= new Scanner(System.in);
       // System.out.println("enter the year, which  you want to know,is a leap year or not");
        year= input.nextInt();
        boolean leapyear= (year%4==0);
 
        System.out.println("leapyear="+leapyear);
	}

}
