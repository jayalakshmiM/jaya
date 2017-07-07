import java.util.Scanner;

public class hcf1
{
	public static void main(String[] args)
	{
		System.out.println("Enter 2 numbers");
	        Scanner in=new Scanner(System.in);
	        int a=in.nextInt();
	        int b=in.nextInt();

	        int x=1;
	        int z=a*b;
	        for(int i=2;i<z;i++)
	        {
	            if((a%i==0)&&(b%i==0))
	            {
	                x=i;
	            }
	        }
	        System.out.println("HCF="+x);
	}

}
