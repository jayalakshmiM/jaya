import java.util.Scanner;

public class arrofn 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		  int size=in.nextInt();
		  int[] ar=new int[size];
		  for(int i=0;i<size;i++)
		  {
		      ar[i]=in.nextInt();
		  }
		  fun(ar);
		}
		static int fun(int arr[])
		{  int l=0;
		  for(int i=0;i<arr.length;i++)
		     for(int k=0;k<arr.length;k++)
		     {
		         if(k!=i)
		         {
		            l=arr[i]+arr[k];
		            for(int j=0;j<arr.length;j++)
		            {
		                if(l==arr[j])
		                {
		                    System.out.println(arr[i]+" "+arr[k]+" "+arr[j]);
		                }
		            }
		         }
		     }
		     
		     return 0;
	}

}
