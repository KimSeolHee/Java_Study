package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1-5 사이의 숫자 입력");
		int num = sc.nextInt();
		
		char ch = 'a'; // -> b
		System.out.println("알파벳을 입력");
		ch = sc.next().charAt(0);
		
		
		int result = (char)(ch + num);

		//소문자가 범위를 벗어났을 때
		if(result > 'z') {
			result = result - 'z' -1;
			result = 'a' + result;
		}
		//대문자가 범위를 벗어났을 때
		if(result > 'Z' && result < 'a') {
			result = result-'Z'- 1;
			result = 'A' + result;
		}
		
		System.out.println((char)result);
		
		System.out.println();
		System.out.println("Finish");



	}

}
