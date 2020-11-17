package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: "); 
		int num = sc.nextInt(); 
		
		for(int i =1; i<=num; i++) { // <-- 조건으로 i<=num "="까지 넣어줘야 본임 포함 약수로 표시   
			
			if(num%i==0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
