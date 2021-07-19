package javaassignment1;
import java.util.*;

public class big_of_3num 
{
	static int max(int a, int b, int c)
	{
		return c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	}

	public static void main(String[] args) 
	{
		int x, y, z, big;
		Scanner ss = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		x = ss.nextInt();
		y = ss.nextInt();
		z = ss.nextInt();
		big = max(x, y, z);
		System.out.println(big + "is the largest num");	
	}

}
