import java.util.Scanner;

public class asciipas
{
	public static void main(String[] args) 
	{ 
		int sum=0,div=0;
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		char ch[]=s1.toCharArray();
		int len=ch.length;
		for(int inp=0;inp<ch.length;inp++)
		{
		sum=sum+(int)ch[inp];
		}
		div=(sum/len);
		System.out.println((char)div);

	}

}
