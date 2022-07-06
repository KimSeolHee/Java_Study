package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// 짝수입니다, 홀수입니다. 단, if문은 한번만 쓴다.
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String result = "홀수입니다.";
		
		System.out.println("정수를 입력하세요.");
		num = sc.nextInt();

		if(num % 2 == 0) {
			result = "짝수입니다.";
		}
		
			System.out.println(result);
		
		
		System.out.println();
		System.out.println("Finish");
		

	}

}
