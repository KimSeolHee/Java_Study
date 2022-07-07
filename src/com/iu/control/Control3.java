package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		int num = 10; //지역변수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-3 사이의 숫자를 입력하시오.");
		int select = sc.nextInt();
		
		if(select == 1) {
			int count = 1;//지역변수
			System.out.println("1번 선택");
		}else if(select == 2) {
			int count = 1;
			System.out.println("2번 선택");
		}else {
			int count = 1;
			System.out.println("3번 선택");
		}
		
		System.out.println(num);
//		System.out.println(count);
	}

}
