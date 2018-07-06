package com.basic;

public class DuplicateCharacter {
	   public static void main(String[] args) {
		   String t1 = "ddiiuu".replace(" ","");
		  //System.out.println(t1.length());
		      char ch[] = t1.toCharArray();
		      String result = "";
		      int count = 0,i = 0,j = 0 ;
		      for(i = 0 ; i< ch.length ; i++){
		    	  for(j =0 ; j< ch.length ; j++) {
		    		  if(ch[i] != ch[j]) {
		    			  	count++;		  
		    		  if(count+1 == ch.length) 
		    			  result += ch[i];    			 
		    		  }
		    		  }
		                	  count=0;
		    	  
		    		   }if(result == "")
		    			   System.out.println("null");
		    		   else
		    				   System.out.println(result);
		      
	   }
	}