package javaassignment1;
import java.util.*;

public class SumNatural 
{
	public static void main(String[] args) 
	{
		int num, sum = 0;
		Scanner ss = new Scanner(System.in);
		System.out.println("enter a natural num");
		num = ss.nextInt();
		
		for(int i =1; i <= num; ++i)
		{
			sum += i;
		}
		
		System.out.println("Sum of given Natural Num is=" +sum);	
	}
}
