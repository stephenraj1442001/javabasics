package com.basic;

public class errorcorrect {
	public static void main(String[] args)
	{
		int x=1,total=0;
		while ( x <= 100 )
		{
			total += x;
			++x;
		}
		System.out.print(total);
	}

}
