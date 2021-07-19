package javaassignment1;
import java.util.*;

public class ArmstrongNum 
{
	public static void main(String[] args) {
		int num, onum, remainder, result = 0, n = 0;
		Scanner ss = new Scanner(System.in);
		System.out.println("enter a number to find its Armstrong or Not");
		num = ss.nextInt();
		onum = num;
		
		for( ; onum != 0; onum /= 10)
		{
			n++;
		}
		onum = num;
		
		for( ; onum != 0; onum /= 10)
		{
			remainder = onum % 10;
			result += Math.pow(remainder, n);
		}
		
		if(result == num)
			System.out.println(num + ":is an Armstrong num");
		else
			System.out.println(num + ":is not an Armstrong num");
		}
}
