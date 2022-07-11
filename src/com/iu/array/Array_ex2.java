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
		
		//몬스터 파티 생성
		//몬스터의 수를 입력받음 (1-4까지)2입력 랜덤하게 2마리 입력됨.
		//최대 HP도 들어감(반피부터 풀피까지 랜덤하게 들어감)
		
		System.out.println("몬스터 수를 입력하세요.");
		int monsterNum = sc.nextInt(); // 몬스터 숫자 입력받음
		
		//몬스터가 2마리 일때 랜덤하게 두마리 이름가져오기
		
		String [] monsterPartyNames = new String[monsterNum];
		int [] monsterPartyHps = new int[monsterPartyNames.length];
		
		
		for(int i = 0;i < monsterPartyNames.length; i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index];
		}
		
		for(int i= 0;i < monsterPartyNames.length;i++) {
			System.out.println(monsterPartyNames[i]);
			System.out.println(monsterPartyHps[i]);
		}
		
		
		
		// 몬스터 HP
//		int [] monsterPartyHps = new int[monsterPartyNames.length];
//		
//		for(int i= 0;i < monsterPartyNames.length;i++) {
//			
//			int index = random.nextInt(4);
//			monsterPartyNames[i] = monsterNames[index];
//			monsterPartyHps[i] = monsterHps[index];
//		}
//		for(int i= 0;i < monsterPartyNames.length;i++) {
//			System.out.println(monsterPartyHps[i]);
//		}
		
		
		
	}

}
