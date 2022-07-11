package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//몬스터 기본정보
		String [] monsterNames = {"고블린", "오크", "트롤", "골렘"}; // 4종류
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터의 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		System.out.println(name + "님 환영합니다.\n");
		
		//파이어볼
		int fawer = 6;
		
		//몬스터 파티 생성
		//몬스터의 수를 입력받음 (1-4까지)2입력 랜덤하게 2마리 입력됨.
		//최대 HP도 들어감(반피부터 풀피까지 랜덤하게 들어감)
		
		System.out.println("몬스터 수를 입력하세요.");
		int monsterNum = sc.nextInt(); // 몬스터 숫자 입력받음
		
		//몬스터가 2마리 일때 랜덤하게 두마리 이름가져오기
		
		String [] monsterPartyNames = new String[monsterNum];
		int [] monsterPartyHps = new int[monsterPartyNames.length];
		int [] hps = new int[monsterPartyNames.length];
		
		for(int i = 0;i < monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
			
			//데미지 입력
//			int damage = random.nextInt(fawer);
//			hps[i] = monsterPartyHps[i] - damage;
		}

		boolean check = true;
		
		while(check) {
			int death = 0;
			System.out.println("1번 사냥\t2번 도망");
			int select = sc.nextInt();
			if(select == 1) {
				for(int i= 0;i < monsterPartyNames.length;i++) {
					int damage = random.nextInt(fawer);
					monsterPartyHps[i] = monsterPartyHps[i] - damage;
					System.out.println("몬스터: " + monsterPartyNames[i]);
					System.out.println("남은 HP: " + monsterPartyHps[i]);
					System.out.println("=========================");

					if(monsterPartyHps[i] < 1) {
						death++;
					}
				}
			}else {
				System.out.println("사냥 종료");
				break;
			}
			System.out.println("사냥한 몬스터 수: " + death);
			
		}
		

		
		
		
		

		
		
		
		//1회성
		//0~6미만의 랜덤한 데미지로 몬스터를 공격
		
		
		
		
		
	}

}
