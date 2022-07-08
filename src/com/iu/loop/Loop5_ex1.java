package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int yId = 1234;
		int yPw = 5678;
		
		boolean login = true;
		//ID입력, PW입력
		//로그인 판단, 로그인 성공하면 종료, 실패 시 다시 입력
		System.out.println("1번 : 로그인\n2번 : 종료");
		int select = sc.nextInt();
		
		if(select == 1) {
			while(login) {
				
				System.out.println("ID를 입력하시오.");
				int id = sc.nextInt(); 
				System.out.println("PW를 입력하시오.");
				int pw = sc.nextInt();
				
				if(id == yId && pw == yPw) {
					System.out.println("로그인 성공!");
					login = !login;
					break;
				}
				
				System.out.println("회원정보가 맞지 않습니다. 재입력 바랍니다.");
			}

		}else {
			System.out.println("프로그램 종료");
		}
	}
}
