package com.basic;

public class whileloop {
	public static void main(String[] args)
	{
		int x = 1 , i = 0;
		while ( x < 30 )
		{
			i += x;
			++x;
		}
		System.out.print(i);
	}
}
