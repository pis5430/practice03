package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t = "*";
		int i;
		int j;
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		

		
		for (i=1; i<=num; i++ ) {
			
			for(j=num; j>=i; j--) { //초기값과 j값이 같아야함 , j-- (1씩 줄여줌)
				
				System.out.print(t); //print로 넣어줘야함
				
			}
			System.out.println("");
		}
			

		sc.close();

	}

}
