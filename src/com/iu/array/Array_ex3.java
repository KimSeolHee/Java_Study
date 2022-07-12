package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {
	
	public static void main(String[] args) {
		//학교 성적 프로그램
		//1. 학생정보 입력
		//	-학생 수를 입력하세요.
		//	-이름 번호 국어 영어 수학 입력 입력 후 계산 총점 평균
		//2. 학생정보 조회
		//	-모든 학생의 이름, 번호, 총점, 평균 출력
		//3. 학생정보 검색
		//	-검색할 학생의 번호를 입력
		//	-입력한 번호와 일치하는 학생의 모든 정보
		// - 일치하는 번호가 없으면 없는 학생이다 출력
		//4. 학생정보 삭제
		//	- 삭제할 학생의 번호를 입력
		//	- 일치하는 번호가 없으면 없는 학생이다 출력
		//5. 학생정보 추가
		//	이름 번호 국어 영어 수학 입력 입력 후 계산 총점 평균 추가
		//6. 프로그램 종료
		//배열 총 7개
		
		Scanner sc = new Scanner(System.in);
		
		String [] names = null;
		int [] nums = null;
		int [] kors = null;
		int [] engs = null;
		int [] maths = null;
		int [] totals = null;
		int [] averages = null;
		
		boolean check = true;
		
		while(check) {
			
			System.out.println("1. 학생정보 입력 2. 학생정보 조회 3. 학생정보 검색 4. 학생정보 삭제 5. 학생정보 추가 6. 프로그램 종료");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("학생 수를 입력하세요.");
				int stNum = sc.nextInt();
				
				names = new String[stNum];
				nums = new int[names.length];
				kors = new int[names.length];
				engs = new int[names.length];
				maths = new int[names.length];
				totals = new int[names.length];
				averages = new int[names.length];
				

				for(int i = 0;i <names.length;i++) {
					System.out.println("학생 이름");
					names[i] = sc.next();
					System.out.println("학생 번호");
					nums[i] = sc.nextInt();
					System.out.println("국어점수");
					kors[i] = sc.nextInt();
					System.out.println("영어점수");
					engs[i] = sc.nextInt();
					System.out.println("수학점수");
					maths[i] = sc.nextInt();
					totals[i] = kors[i]+engs[i]+maths[i];
					averages[i] = totals[i] / 3;
				}
				System.out.println("=========================================================================");
			}
			
			//2.조회
			else if(choice == 2) {
				if(names != null) {
					for(int i = 0; i < names.length;i++) {
						System.out.println("학생이름: " + names[i]+" 번호: "+nums[i]+" 국어: "+kors[i]+" 영어: "+engs[i]+" 수학: "+maths[i]+" 총점: "+totals[i]+" 평균: "+averages[i]);
					}
					System.out.println("=========================================================================");
				}else {
					System.out.println("학생 정보가 없습니다.");
					System.out.println("=========================================================================");
				}
				
			//3.검색	
			}else if(choice == 3) {
				System.out.println("검색 할 학생의 번호를 입력하시오.");
				int inputNum = sc.nextInt();
				boolean flag = true;
				for(int i = 0;i < names.length;i++) {
					if(nums[i] == inputNum) {
						System.out.println("학생이름: " + names[i]+" 번호: "+nums[i]+" 국어: "+kors[i]+" 영어: "+engs[i]+" 수학: "+maths[i]+" 총점: "+totals[i]+" 평균: "+averages[i]);
						flag = !flag;
//						break;
					}
				}
				
				if(flag) {
					System.out.println("일치하는 학생이 없습니다.");
				}
				System.out.println("=========================================================================");

			//4.삭제
			}else if(choice == 4) {
				System.out.println("삭제 할 학생의 번호를 입력하시오.");
				int inputNum = sc.nextInt();
				boolean flag = false;
				System.out.println("삭제가 되었습니다.");
				System.out.println("=========================================================================");
				
			//5.추가	
			}else if(choice == 5) {
				System.out.println("학생 정보 추가");
				
				System.out.println("=========================================================================");
				
			//6.종료	
			}else {
				System.out.println("프로그램 종료");
				check = !check;
				break;
			}
			
		}
	
	}

}
