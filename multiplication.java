import java.util.Scanner;

public class multiplication 
{
	public static void main(String[] args) 
	{
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[][]=new int[n][n];
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=n;j++)
    	  {
    		  a[i-1][j-1]=i*j;
    	  }
      }
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n;j++)
    	  {
    		  System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      in.close();
	}

}
