package com.devjr;

import java.util.*;

public class isPrime {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if(num == 0 || num == 1)
		{
			System.out.println("Not prime Number");
		}
		else if(num/1 == num && num%num ==0)
		{
			System.out.println("Prime Number");
		}
		sc.close();
	}

}
