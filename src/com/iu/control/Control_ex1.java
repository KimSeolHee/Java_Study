package com.iu.control;

import java.util.Scanner;

public class Control_ex1 {

	public static void main(String[] args) {
		//월급을 입력, 1.정규직, 2.계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		Scanner sc = new Scanner(System.in);
		
		int monthlyPay;
		int employ;
		
		System.out.println("월급을 입력하세요.");
		monthlyPay = sc.nextInt();
		System.out.println("1.정규직 2.계약직");
		System.out.println("숫자를 고르시오");
		employ = sc.nextInt();
		
		double tax = monthlyPay * 0.033;
		double ko = monthlyPay * 0.01;
		double he = monthlyPay * 0.014;
		double em = monthlyPay * 0.005;
		double in= monthlyPay * 0.007;
		double sum = ko+he+em+in;
			
		if(employ == 1) {
			System.out.println("월 급여 : " + monthlyPay + "원");
			System.out.println();
			System.out.println("사대보험료 : "+ (int)sum + "원");
			//국민연금
			System.out.println("국민연금 : " + (int)ko + "원");
			//건강보험
			System.out.println("건강보험 : " + (int)he + "원");
			//고용보험
			System.out.println("고용보험 : " + (int)em + "원");
			//산재보험
			System.out.println("산재보험 : " + (int)in + "원");
			System.out.println();
			System.out.println("실 급여 : " + (int)(monthlyPay-sum)+"원");
		}else {
			System.out.println("월 급여 : " + monthlyPay + "원");
			System.out.println();
			System.out.println("세금 : 3.3%");
			System.out.println((int)tax + "원");
			System.out.println("실 급여 : " + (int)(monthlyPay-tax)+"원");
		}
		
	}

}
