package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {
	
	public static void main(String[] args) {
		// 키보드로부터 인원수를 입력받아서 
		// 인원수 만큼 이름을 입력받아서
		// 이름들을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하세요.");
		
		int nums = sc.nextInt(); // 인원수 입력
		
		String [] names = new String[nums];
		
		//인원수 만큼 이름 입력
		for(int i = 0;i < names.length;i++) {
			System.out.println((i+1) + "번 이름을 입력하세요.");
			names[i] = sc.next();
		}
		
		//이름 출력
		for(int i = 0;i < names.length;i++) {
			System.out.println("이름: " + names[i]);
		}
		
		
		// 각 학생의 이름별로 국어 점수를 입력 후 출력
		int [] kor = new int[names.length];

		for(int i = 0;i < names.length;i++) {
			System.out.println(names[i] + "의 국어점수를 입력해주세요.");
			kor[i] = sc.nextInt();
			System.out.println(names[i] + "의 국어점수: " + kor[i] + "점");
		}
		
		// 반의 국어점수 총점을 계산하고 출력하세요.
		int total = 0;
		for(int i = 0;i < names.length;i++) {
			total = kor[i]+total;
		}
		System.out.println();
		System.out.println("국어총점: " + total + "점");
		
	}

}
