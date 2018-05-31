package com.basic;

public class Perfect {

	public static void main(String[] args)
	   {
		Perfect p=new Perfect();
	    System.out.println(p.isperfect(6));
	   }
		
    int number;
  
	public boolean isperfect (int number) {
		int sum = 0;
		
		for(int i = 1 ; i<=number/2 ; i++)
		{
			if(number % i == 0)
				sum+=i;
		}
		if(number == sum)
			return true;
		else
			return false;
	}

	
}
