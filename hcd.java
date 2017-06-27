import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hcd
{	
	public static void main(String[] args) throws NumberFormatException, IOException
  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the First no : ");
        int n1=Integer.parseInt(br.readLine());
        System.out.print("Enter the Second no : ");
        int n2=Integer.parseInt(br.readLine());
        int hcf=0;
        int min = Math.min(n1,n2);
         
        for(int i=min; i >= 1; i--)
        {
            if(n1%i == 0 && n2%i == 0)
            {
                hcf = i;
                break;
            }
        }        
        System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
    }
	}
