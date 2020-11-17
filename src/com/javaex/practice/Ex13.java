package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt(); 
		int i = 0;
		int j = 0;
		
		while(i<=num) {
			j+=i;
			i++;
		}
		
		System.out.println("합계: " + j);

		sc.close();

	}

}
