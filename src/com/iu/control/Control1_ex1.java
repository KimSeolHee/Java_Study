package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// 키보드로부터 국어, 영어, 수학점수를 차례로 입력
		// 총점과 평균을 계산합니다.
		// 평균이 90점 이상이면 우등상 수상
		// 모든 학생들은 졸업 출력
		
		// 평균이 90점 이상이면 A출력, 80점 이상이면 B출력 70점 이상 C출력 60점이상 D출력 그외 나머지는 F출력
		
		Scanner sc = new Scanner(System.in);
		int kr;
		int en;
		int ma;
		System.out.println("국어점수를 입력하세요.");
		kr = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		en = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		ma = sc.nextInt();
		
		int sum = kr + en + ma;
		int average = sum / 3;
		if(average >= 90) {
			System.out.println("우등상을 수상하였습니다.");
			System.out.println("졸업을 축하합니다.");
		}else {
			System.out.println("졸업을 축하합니다.");
		}
		
		System.out.println();
		
		System.out.println("평균성적 : " + average);
		if(average >= 90) {
			System.out.println("A학점");
		}
		if(average < 90 && average >= 80) {
			System.out.println("B학점");
		}
		if(average < 80 && average >= 70) {
			System.out.println("C학점");
		}
		if(average < 70 && average >= 60) {
			System.out.println("D학점");
		}
		if(average < 60) {
			System.out.println("F학점 재수강하세요.");
		}

		System.out.println();
		System.out.println("4년동안 고생하셨습니다.👩‍🎓‍👩‍🎓‍");
	}

}
