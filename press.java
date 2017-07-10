import java.util.Scanner;

public class press 
{
	public static void main(String[] args)
	{
		char s=' ';
		  Scanner n=new Scanner(System.in);
		  s=n.next().charAt(0);
		  while(s!='q')
		  {
		  
		      System.out.println("Enter the letter");
		      s=n.next().charAt(0);
		  }
	}

}
