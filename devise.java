
import java.util.Scanner;

public class devise 
{
	public static void main(String[] ar)throws Exception 
	{
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] a=new String[n];
        System.out.println("ENTER THE ELEMENTS");
        for(int x=0;x<n;x++)
        {
         a[x]=s.next();
        }
        for(int k=0;k<a.length;k++)
        {
          String temp=a[k];
          for(int i=0;i<a.length;i++)
          {
           String temp1=a[i];
           for(int j=0;j==0;)
            {
              if(temp.charAt(j)>temp1.charAt(j))
               {
                   String swap=a[k];
                   a[k]=a[i];
                   a[i]=swap;
                   break;
               }
                else
                break;
            }
        }
        }
         System.out.println("LARGEST NUMBER POSSIBLE IS:");
         for(String out:a)
        {
           System.out.print(out);
        }
	}

}
