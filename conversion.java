import java.util.Scanner;

public class conversion
{
	public static void main(String[] args)
	{
		  int i;
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int a[]=new int[n];
	        char b[]=new char[n];
	        int c[]=new int[n];
	        for(i=0;i<n;i++)
	        {
	            a[i]=s.nextInt();
	        c[i]=a[i]+96;
	        b[i]=(char)c[i];
	        }
	        for(i=0;i<n;i++)
	        {
	        
	        System.out.print(b[i]);
	        }
	    }
	}
