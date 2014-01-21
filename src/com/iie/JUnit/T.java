package com.iie.JUnit;

public class T {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int divide(int x, int y) {
		return x/y;
	}
	public static void main(String[] args) {
		System.out.println(new T().add(1,2));
	}
	
	
}
