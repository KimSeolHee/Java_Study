package com.iu.loop;

public class Loop2 {
	
	public static void main(String[] args) {
		
		//반복문의 보조문
		//1. break
		//2. continue
		
		for(int i = 0;i < 10;i++) {
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		
		System.out.println("===================================");
		
		for(int i = 0;i < 10;i++) {
			if(i % 2 != 0) {
				System.out.println("?");
				continue;
			} 
			System.out.println(i);
		}
		
	}

}
