import java.util.Scanner;

public class pattern 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		int a,b,c,d;
		for(a=0;a<n;a++)
		{
			for(b=0;b<n-a;b++)
			{
				System.out.print("*");
			}
			for(c=0;c<=0;c++)
			{
				System.out.print(" ");
			}for(d=0;d<n-a;d++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
	}
	}

}
