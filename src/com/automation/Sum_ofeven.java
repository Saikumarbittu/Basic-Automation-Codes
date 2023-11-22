package com.Saikumarjava;

import java.util.Scanner;



//write sum of even digits from given input
public class Sum_ofeven {

	public static void main(String[] args) 
	{
	   Scanner s=new Scanner(System.in);
	   int j=0;
       System.out.println("enter n");
       int n=s.nextInt();
       for(int i=0;i<=n;i++)
  {
	 
	   if(i%2==0)
	   j=++j;
	  
    }
    	System.out.println(j);
	}
}
