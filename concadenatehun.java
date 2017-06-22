
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class concadenatehun 
{
		public static class LexicographicSort implements Comparator<Integer>
		{
		    public int compare(Integer o1, Integer o2)
		    {
		        String a = o1.toString();
		        String b = o2.toString();
		        return (b+a).compareTo(a+b);
		    }

		    public static void main(String[] args) 
		    {
		    	 LexicographicSort ls = new LexicographicSort();
		       Integer[] nums = {8,45,3,1,17};
		        Arrays.sort(nums);
		        System.out.println(Arrays.toString(nums));
		    }
		}
}
