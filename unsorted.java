import java.util.Scanner;

public class unsorted 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
        int c=0;
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=in.nextInt();
        for(int i=0;i<arr.length;i++)
        {   for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(""+arr[i]);
                    
                  
                }}}for(int i=0;i<arr.length;i++)
                {
                    
                
                  if(arr[i]!=0)  
                  {
                    System.out.println(arr[i]);
                }
                }
	}

}
