import java.util.Scanner;

public class transpose
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			System.out.print(b[i][j]+"\t");
			System.out.print("\n");
		}
		System.out.println("Enter the value of i and j:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int sum=a[i][j]+b[j][i];
		System.out.println("Sum:"+sum);
	}

}
