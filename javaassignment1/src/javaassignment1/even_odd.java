package javaassignment1;

import java.util.*;

public class even_odd {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = ss.nextInt();
		
		if(num%2 == 0)
			System.out.println("The num is even");
		else
			System.out.println("The num is odd");
		
	}

}
