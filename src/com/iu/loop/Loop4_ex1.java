package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 0.0초 ~ 59.59초까지
		System.out.println("몇 분 몇 초 입니까?");
		int mm = sc.nextInt();
		int ss = sc.nextInt();
		
		boolean flag = false;

		for(int m = 0;m < 60;m++) {
			for(int s = 0;s < 60;s++) {
				System.out.println(m +"분 " + s + "초");
				if(mm == m && ss == s) {
					flag = !flag;
					m = 60;
					break;
				}
			}

//			if(flag) {
//				break;
//			}
		}
	}
}

