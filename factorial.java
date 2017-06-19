import java.util.Scanner;

public class factorial 
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int result=factorial(n);
		System.out.println(result);
	}
	public static int factorial(int n)
	{
		int result=1;
		for(int i=0;i<=n;i++)
		{
			result=result+1;
		}
		return result;
	}

}
