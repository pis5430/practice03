package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = 60; // 1~100 사이의 랜덤값을 무작위로 뽑는 방법은?
		
		
		System.out.println("=====================");
		System.out.println("[숫자맞추기게임 시작]");
		System.out.println("=====================");
		
		while(true) {
			System.out.print(">>");
			 int num  = sc.nextInt();
			 
			 if(random>num) {
				 
					System.out.println("더 높게");
			 }else if(random<num) {
					System.out.println("더 낮게");
			 }else if(random==num){
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");
					char restart  = sc.next().charAt(0);
					//String restart = sc.nextline(); --> 자꾸 오류남, 	int num  = sc.nextInt(); 값으로 되돌아감
					// 확인필요
					
					
					
					if(restart=='y') {
						System.out.println("=====================");
						System.out.println("[숫자맞추기게임 종료]");
						System.out.println("=====================");
						break;
					} else if(restart=='n') {
						System.out.println("[숫자맞추기게임 재시작]"); 
					} 
					
					//else에서 재시작시 break를 안잡아주면 초기로 돌아감
					// 그외상황에 대한 표현 고민
					// 추가로 else 입력시 y/n 값 외에 다른것을 넣어서 오류멘트 출력 가능한지?
					
			 }
		
			 
			
		}
	
		
	}

}
