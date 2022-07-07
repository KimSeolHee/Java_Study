package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {
	
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점과 평균 계산
		//평균이 90점 이상A 80점 이상이면B 70점 이상이면 C 60점 이상이면 D 그외는 전부 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수");
		int kor = sc.nextInt();
		System.out.println("영어점수");
		int eng = sc.nextInt();
		System.out.println("수학점수");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int average = total / 3; 
		
		int result = average / 10;
		
		switch(result) {
			case 10:
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			case 6:
				System.out.println("D학점");
				break;
			default:
				System.out.println("F학점");
		}
	}

}
