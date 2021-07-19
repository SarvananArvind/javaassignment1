package javaassignment1;

public class Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		int n = 100, ft = 0, st = 1;
		System.out.println("Fibonacci Series upto" +n+ ": ");
		while(ft <= n)
		{
			System.out.println(ft+ " ");
			int nt = ft + st;
			ft = st;
			st = nt;
		}
	}
}
