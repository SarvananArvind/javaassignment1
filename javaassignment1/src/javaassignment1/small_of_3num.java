package javaassignment1;
import java.util.*;

public class small_of_3num 
{
	public static void main(String[] args) 
	{
		int a, b, c, temp, result;
		Scanner var = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		a = var.nextInt();
		b = var.nextInt();
		c = var.nextInt();
		temp = a < b ? a:b;
		result = c < temp ? c:temp;
		System.out.println("the smallest num is:"+result);
	}

}
