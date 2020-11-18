package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int total = 0;
		
		while(true) {
			
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택 > ");
			int num = sc.nextInt();
			
			switch(num){  //if문으로도 가능
			case 1 : 
				System.out.print("예금액 >");
				int money = sc.nextInt();
				total +=  money;
				break;
				
			case 2 :
				System.out.print("출금액 >");
				money = sc.nextInt();
				total -=  money;
				break;
				
			case 3 :
				System.out.println("잔고액 >" + total);
				break;
			
			case 4 :
				System.out.println("프로그램종료");
				break;
				
			default : 
				System.out.println("다시 입력해주세요");
				break;

				
			}
			
			sc.close();
		}
		
		
	

	}

}
