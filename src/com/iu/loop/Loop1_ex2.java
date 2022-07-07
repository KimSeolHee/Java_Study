package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {
	
	public static void main(String[] args) {
		//1. 1번 대문자,2번 소문자
		//1번이면 A - Z 출력
		//2번이면 a - z 출력
		
		//2. 1-10까지의 합을 구하시오.
		
		//3. 아이디 패스워드를 입력하여 로그인 판단, 최대 5번까지 로그인가능, 로그인 성공시 종료

		
		Scanner sc = new Scanner(System.in);
		
		
		//1번
//		System.out.println("1번 또는 2번을 입력하시오.");
//		int num = sc.nextInt();
//		
//		if(num == 1) {
//			for(int i = 65;i <= 90;i++) {
//				System.out.println((char)i);
//			}
//		}else if(num == 2) {
//			for(int i = 97;i <= 122;i++) {
//				System.out.println((char)i);
//			}
//		}
//		System.out.println("출력이 끝났습니다.");
//		System.out.println();
		
		//2번
		
//		int sum = 0;
//		for(int i = 1;i <= 10;i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
		// 3번
		
		
		int yId = 1234; //회원가입시 입력한 ID
		int yPw = 5678; //회원가입시 입력한 PW
		
//		System.out.println("아이디를 입력하세요.");
//		int id = sc.nextInt();
//		for(int i = 0;i < 5;i++) {
//			if(id != yId) {
//				System.out.println("다시 입력하세요.");
//				id = sc.nextInt();
//			}
//		}
//
//		System.out.println("비밀번호를 입력하세요.");
//		int pw = sc.nextInt();
//		for(int i = 0;i < 5;i++) {
//			if(pw != yPw) {
//				System.out.println("다시 입력하세요.");
//				pw = sc.nextInt();
//			}
//		}
		
//		System.out.println("아이디를 입력하세요.");
//		int id = sc.nextInt();
//		System.out.println("비밀번호를 입력하세요.");
//		int pw = sc.nextInt();
//		System.out.println();
//		
//		for(int i = 0;i < 5;i++) {
//			if(id != yId) {
//				System.out.println("존재하지 않는 회원입니다.");
//				System.out.println("아이디를 다시입력하세요.");
//				id = sc.nextInt();
//			}else if(pw != yPw) {
//				System.out.println("비밀번호 다시 입력하세요.");
//				pw = sc.nextInt();
//			}else if(pw == yPw) {
//				System.out.println("로그인성공");
//				System.exit(0);
//			}
//		}
//		System.out.println("로그인실패");
		
		boolean check = false;
		
		for(int i = 0;i < 5;i++) {
			System.out.println("아이디를 입력하세요.");
			int id = sc.nextInt();
			System.out.println("비밀번호를 입력하세요.");
			int pw = sc.nextInt();
			
			if(id == yId && pw == yPw) {
				System.out.println("로그인 성공");
				i = 1000;
				check = !check;
			}else {
				System.out.println("로그인 실패");
			}
		}
		
		if(check) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("다시 본인확인 해주세요.");
		}
		//1. 로그인이 성공 했을때, 로그인이 5번 전부 실패했을때 반복문이 끝남.
	
		System.out.println("Finish");
		
	}

}
