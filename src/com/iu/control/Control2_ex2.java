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
		
		ch = (char)(ch + num);
		int result = 0;
		result = ch;
		
		if(result <= 122) {
			System.out.println("ch : "+ ch);
		} else {
			result = 96+num;
			System.out.println((char)result);
		}
		
		
		System.out.println();
		System.out.println("Finish");
		//Study Edition
		//Study Edition

	}

}
