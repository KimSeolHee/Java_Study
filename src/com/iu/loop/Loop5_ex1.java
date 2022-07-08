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
		
		//로그인을 안했으면 프로그램이 종료되는거고 로그인을 성공했으면 게임이 시작됌
		//RPG게임 시작레벨은 만렙은 15(프로그램 종료)
		//gold : 1000원 
		//모든 몬스터의 경험치는 동일
		//1>>2 :3마리 잡아야됌
		//2>>3 :6마리 잡아야됌
		//3>>4 :9마리
		//5렙 달성시 축하금으로 1000Gold지급
		//10렙 달성시 축하금으로 2000Gold지급
		//15렙 달성시 축하금으로 3000Gold지급
		
		if(login == false) {
			System.out.println("\n게임이 시작됩니다...\n");
			System.out.println("사냥을 시작하겠습니까?");
			System.out.println("1번: 사냥시작\n2번: 프로그램 종료");
			select = sc.nextInt();
			
			if(select == 1) {
				int level = 1;
				int gold = 1000;
				System.out.println("사냥을 시작하였습니다.");
				System.out.println("현재 레벨: " + level + "  Gold: " + gold + "원\n");
				//렙업

				for(int i = 1; i < 16;i++) {
					System.out.println("레벨: " + level++);
					if(i < 15) {
						System.out.println("=============================");
						System.out.println("사냥 시작 클릭 : 1번");
						select = sc.nextInt();
						System.out.println();
					}

					int j;
					for(j = 0;j < 3*i;j++) {
						if(i < 15) {
						} else {
							break;
						}
					}
					if(i < 15) {
						System.out.println("몬스터 처치: " + j + "마리");
					}

					if(level % 5 == 0) {
						System.out.println(gold + "GOLD 지급");
						gold = gold+1000;
						
					}
					
					
//					if(level == 5) {
//						int g = 1;
//						gold = gold + 1000 * g;
//						g++;
//						System.out.println();
//						System.out.println(gold + "원 골드 적립");
//					}else if(level == 10) {
//						int g = 2;
//						gold = gold + 1000 * g;
//						System.out.println();
//						System.out.println(gold + "원 골드 적립");
//					}else if(level == 15){
//						int g = 3;
//						gold = gold + 1000 * g;
//						System.out.println();
//						System.out.println(gold + "원 골드 적립");
//					}
//					
					
				}
				System.out.println("=============================");
				System.out.println("만렙 달성‼‼‼💯💯🎉🎉🎊‼💯💯🎉🎉🎉🎊");
			}else {
				System.out.println("프로그램 종료");
			}
			
		}
	}
	
}
