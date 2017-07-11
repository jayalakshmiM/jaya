import java.util.Scanner;

public class subset
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        int temp=0;
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            
        }
        int n1=in.nextInt();
        int b[]=new int[n1];
        for(int j=0;j<n1;j++)
        {
            b[j]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
         for(int j=i;j<n1;j++)
        {
        if(a[i]==b[i])
        {
            temp=1;
        }
        }
       }
     if(temp==1)
    {
        System.out.print("Yes");
    }
    else
    {
        System.out.print("No");
    }
	}

}
