import java.io.BufferedReader;
import java.io.InputStreamReader;

public class vowels 
{
	public static void main(String[] args) throws Exception
	{
		char n;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = (char) bf.read();
        switch(n)
        {
            case 'a':
            System.out.println("vowel");
            break;
 
            case 'e':
            System.out.println("vowel");
            break;
 
            case 'i':
            System.out.println("vowel");
            break;
 
            case 'o':
            System.out.println("vowel");
            break;
 
            case 'u':
            System.out.println("vowel");
            break;
 
            default:
            System.out.println("consonant");
            break;
        }
    }
	}
