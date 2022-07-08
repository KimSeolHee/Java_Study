package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
//		netInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아준다.
//		int num = random.nextInt(10); //0~9까지 랜덤한 수
//		System.out.println(num);
		
		//가위바위보 게임👉👉		
		//0. 가위 1. 주먹 2.보✌✊👊✋✌✊👊👩🖥🖥✋
		
	
		System.out.println("가위바위보를 시작합니다.");
		System.out.println("0.✌ 1.✊ 2.✋\n숫자를 입력하시오.");
		int user = sc.nextInt();

		boolean result = true;
		
		while(result) {
			int com = random.nextInt(3);
			
			String str = String.valueOf(user);
			String comstr = String.valueOf(com);
			
			if(user == 0) {
				str = "✌";
			}else if(user == 1) {
				str = "✊";
			}else {
				str = "✋";
			}
			
			if(com == 0) {
				comstr = "✌";
			}else if(com == 1) {
				comstr = "✊";
			}else {
				comstr = "✋";
			}
			
			System.out.print("👩 = " + str +"\t ");
			System.out.println("🖥 = " + comstr);
			
			if(user == 0) {
				if(com == 0) {
					System.out.println("무승부입니다.");
				}else if(com == 1) {
					System.out.println("사용자가 졌습니다.");
				}else if(com == 2){
					System.out.println();
					System.out.println("승리!!!");
					result = !result;
					break;
				}
			}
			
			if(user== 1) {
				if(com == 1) {
					System.out.println("무승부입니다.");
				}else if(com == 2) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println();
					System.out.println("승리!!!");
					result = !result;
					break;
				}
			}
			
			if(user == 2) {
				if(com == 2) {
					System.out.println("무승부입니다.");
				}else if(com == 0) {
					System.out.println("사용자가 졌습니다.");
				}else {
					System.out.println();
					System.out.println("승리!!!");
					result = !result;
					break;
				}
			}
		
			System.out.println("\n===================================");
			System.out.println("재도전");
			System.out.println("===================================\n");
			System.out.println("0.✌ 1.✊ 2.✋  👉 숫자를 입력하시오.");
			user = sc.nextInt();

		}		
		
		
		//강사님 코드
		boolean check = true;
		while(check) {
			System.out.println("0.✌ 1.✊ 2.✋");
			int you = sc.nextInt();
			int com = random.nextInt();
			
			if(com < you) {
				System.out.println("You Win!!");
				break;
			}else if(com == you) {
				System.out.println("Even!");
			}else {
				System.out.println("Com Win!!");
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
