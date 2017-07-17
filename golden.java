import java.util.Scanner;

public class golden 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);  
         String str = sc.nextLine();  
         int prisoner = sc.nextInt();  
         int len=str.length();
         String s2=str.substring(prisoner,len);
         String s1=str.substring(0,prisoner-1);
         String s3=s1+s2;
         str=s3;
         System.out.println(s3.length());

	}

}
