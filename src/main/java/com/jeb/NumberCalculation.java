package com.jeb;

public class NumberCalculation {
	String temp ;
	public int add(int x, int y) {
		
		return x+y;
	}
	
	public String convertCase(String string) {
		//ASCII small 97-121, caps 65-91 a-z
		
		for(int i = 0; i<string.length();i++) {
			
			int x =string.charAt(i);
			x-=32;
			temp=temp + (char)x;
		}
		
		return temp;
	}

}
