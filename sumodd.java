public class sumodd 
{
	public static void main(String[] args)
	{
		int sum=0;
		int result=0;
		for(int i=0;i<15;i++)
		{
		  sum=sum+i;
		}
		System.out.println(sum);
		for(int j=15;j<=45;j++)
		{
		  if(j%2!=0)
		{
		result=result+j;
		}
		  }
		System.out.println(result);
		}
	}
