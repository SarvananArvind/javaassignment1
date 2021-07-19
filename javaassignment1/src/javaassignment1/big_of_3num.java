package javaassignment1;
import java.util.*;

public class big_of_3num 
{

	public static void main(String[] args) 
	{
		int a, b, c, big;
		Scanner ss = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a = ss.nextInt();
		b = ss.nextInt();
		c = ss.nextInt();
		big = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		System.out.println(big + "is the largest num");	
	}

}
