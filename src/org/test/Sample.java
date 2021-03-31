package org.test;

public class Sample {
	
	public int  add() {
		
		int a=10,b=20;
		
		int c=a+b;
		System.out.println(c);
		 return c;
	}
	
	public static void main(String[] args) {
		
		
		Sample s=new Sample();
		
		int total = s.add();
		System.out.println(total/2);
	}

}
