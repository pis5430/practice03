package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			
			if (num%2==0) { //입력받은 값이 나머지 0일때 , 짝수일때
				
				if (i%2==0) { 
					sum += i;
				}
			} else if (num%2!=0) { //입력받은 값이 나머지 0이 아닐때 , 홀수일때
				if (i%2!=0) {
					sum += i;

				}
			}
		}
		
		System.out.println("결과값 : " + sum);
		
		sc.close();
		

	}

}
