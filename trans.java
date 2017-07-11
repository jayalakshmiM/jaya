import java.util.Scanner;

public class trans
{
	public static void main(String[] args)
	{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			a[i][j]=sc.nextInt();
		}
		for(int i=0;i<y;i++)
		{
			for(int j=0;j<x;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<y;i++)
		{
			for(int j=0;jxm;j++)
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
