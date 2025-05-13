package com.tnsif.day1;
//Program to demonstrate type casting between primitive data types
public class TypecastingDemo {

	public static void main(String[] args) {

		// Implicit / widening 
		
		float f = 22.16f;
		double d = f;
		System.out.println(d);
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		char ch= 'A';
		int i2=ch;
		System.out.println(i2);
		
		//Explicit / narrowing type conversion
		
		long l1 = 9008401136l;
		
		int i3= (int) l1;
		
		System.out.println(i3);
		
		float f3 = 35.67f;
		int i5= (int)f3;
		System.out.println(i5);
		
		
		

	}

}
