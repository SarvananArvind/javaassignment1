package javaassignment1;
import java.util.*;

public class prime_not 
{
	public static void main(String[] args) 
	{
		int n,temp;
		boolean isprime = true;
		
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a Num to check weather it is prime or not");
		n = ss.nextInt();
		for(int i=2; i <= n/2; i++)
		{
			temp = n%i;
			if(temp == 0)
			{
				isprime = false;
				break;
			}
		}
		
		if(isprime)
			System.out.println(n + ":is a prime num");
		else
			System.out.println(n + ":is not a prime num");

	}

}
