package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) { // 0에서부터 시작,반복 횟수

			
			for(int j=1+i; j<=10+i; j++) {
				System.out.print(j);
				
				if (j>=10) {
					System.out.print("    "); // 10이상에 띄어쓰기
				} else { 
					System.out.print("     "); //10미만에 띄어쓰기
				}
			}
			
			System.out.println("");
		}

			
			
			
		}
		 
	}


