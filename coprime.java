import java.util.Scanner;

public class coprime
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE TWO VALUES");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=iscoprime(a,b);
		if(c==1)
			System.out.println("GIVEN NUMBERS ARE CO-PRIME");
		else
			System.out.println("GIVEN NUMBERS ARE NOT CO-PRIME");

	}
	public static int iscoprime(int x,int y)
	{
		while(1>0)
		{
			int temp=x%y;
			if(temp==0)
			{
				return y;
			}
			x=y;
			y=temp;
}
	}

}
