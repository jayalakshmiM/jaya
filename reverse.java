import java.util.Scanner;

public class reverse
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	    String[] s1=s.nextLine().split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
        	System.out.print(s1[i]+" ");
        }
	}

}
