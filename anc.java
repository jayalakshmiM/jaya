import java.util.*;
public class anc
{
	public static void main(String args[])
	{
    Scanner in=new Scanner(System.in);
    String s=new String();
    System.out.println("Enter the String");
    s=in.nextLine();
    int i=0,digit=0,letter=0,other=0; 		
    int len=s.length();
    while(i<len)
    {  
	    if(Character.isDigit(s.charAt(i)))
	    digit++;
	    else if(Character.isLetter(s.charAt(i)))
		  letter++;
	    else
		  other++;
	 i++;
    }
  System.out.println("\ncharacters count is "+letter);
  System.out.println("digits count is "+digit);
  System.out.println("other characters count is "+other);
  }
}
