package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex1 {
	
	public static void main(String[] args) {
		//0-9 출력하는 반복문
		//단, 출력은 짝수만 출력하세요.
		
//		for(int i = 0;i < 10;i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
		//0-9 사이의 짝수만 출력
		//단, if문 사용없이..
		for(int i = 0;i < 10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i = 0;i < 10;i++) {
			System.out.println(i);
			i++;
		}
		
		//멍멍 출력
		//출력하는 횟수를 입력받는다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력");
		
		int count = sc.nextInt();
		for(int i = 0; i < count;i++) {
			System.out.println("멍멍");
		}
		
	}
}
