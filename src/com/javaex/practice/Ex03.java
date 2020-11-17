package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x, y;
		
		for(x=0; x<4; x++ ) { // **구간이 4번 반복 (0,1,2,3)
			for(y=2; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
