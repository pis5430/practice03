package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		int i =1;
		boolean flag =true;
		
		//if 에 else값이 없음, system.out.println(i)를 else 안에 넣어주면 4까지만 출력됨
		//	 else 없을경우 왜 5가 출력되지? 탈출은 5일 경우부터 시작인데?

		
		
		while(flag) {  
			if(i>=5) {
				flag= false;
			}else {
			System.out.println(i);
			i=i+1;
			}
		}

	}

}
