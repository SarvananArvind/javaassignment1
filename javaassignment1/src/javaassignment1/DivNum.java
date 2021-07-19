package javaassignment1;
import java.util.*;

public class DivNum 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a number");
		n = ss.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0 && i % 9 == 0)
				System.out.println(i + " ");
		}
	}
}
