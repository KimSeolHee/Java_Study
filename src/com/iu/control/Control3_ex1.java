package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {
	
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점과 평균 계산
		//평균이 90점 이상A 80점 이상이면B 70점 이상이면 C 60점 이상이면 D 그외는 전부 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		if(kor > 100) {
			System.out.println("다시 입력해주세요.");
		}
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		if(eng > 100) {
			System.out.println("다시 입력해주세요.");
		}
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();
		if(math > 100) {
			System.out.println("다시 입력해주세요.");
		}
		math = sc.nextInt();
		
		int total = kor + eng + math;
		int average = total / 3;
		
		System.out.print("총점: " + total + "점 평균: " + average + "점 ");
		if(average >= 90) {
			System.out.println("학점: A");
		}else if(average >= 80) {
			System.out.println("학점: B");
		}else if(average >= 70) {
			System.out.println("학점: C");
		}else if(average >= 60) {
			System.out.println("학점: D");
		}else {
			System.out.println("학점: F");
		}
		
		
	}

}
