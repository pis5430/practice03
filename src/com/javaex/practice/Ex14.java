package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: "); //다시 풀어보기
		int num = sc.nextInt(); 
		int i = 0;
		int j = 0;
		
		while(i<=num) {
			j+=i;
			System.out.print("+"+i); // 초기값이 0 이라서 0부터 더해짐 , 0앞에잇는 + 문자도 문제
			i++;
		}
		
		System.out.println("");
		System.out.println("합계: " + j);

		sc.close();

	}

}
