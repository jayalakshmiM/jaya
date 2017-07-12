import java.util.Scanner;

public class maxint
{
	public static void main(String[] args) 
	{
		int a[]=new int[100];
		int i;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		int max=0;
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			max=a[i];
		}
		System.out.println(max);
	}

}
