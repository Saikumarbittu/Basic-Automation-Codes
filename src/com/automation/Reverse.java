package com.Saikumarjava;
//wap to reverse given input
public class Reverse {

	public static void main(String[] args) {
      int n=123456,rev=0,rem;
      while(n>0)
      {
    	  rem=n%10;
    	  n=n/10;
    	  rev=rev*10+rem;
      }
      System.out.println(rev);
       }
	}


