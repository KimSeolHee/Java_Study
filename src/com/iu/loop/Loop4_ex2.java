package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {
	
	public static void main(String[] args) {
		//FPS게임
		//총알 : 탕
		//탄창 : 30발, 3개씩 줌.
		//30번 당아쇠당기는걸 반복
		//다시 쏘려면 새로운 탄창으로 바꿔낌
		//1. 단발로 쏠건지? 2. 점사(3발씩 나감)	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.단발 2.점사 선택");
		int fire = sc.nextInt();
		
//		for(int i = 1;i < 4;i++) { 	
//			
//			
//			if(fire == 1) {
//				for(int j = 1;j < 31;j++) { 
//					System.out.println(("탄창: " + i + "개 | 총 : " + j + "탕💥"));
//					
//				}
//			}
//			if(fire == 2) {
//				for(int j = 1;j < 30;j+=3) { 
//					System.out.println("탕💥💥💥");
//					
//				}
//			}
//			
//			if(i < 3) {
//				System.out.println("==========================");
//				System.out.println("재충전");		
//				System.out.println("==========================");
//
//				System.out.println("재선택 : 1.단발 2.점사");
//				fire = sc.nextInt();
//			}
//		}
		
//		int count = 10;
//		String sound = "타타탕";
//		if(fire == 1) {
//			count = 30;
//			sound = "탕";
//		}
//		for(int b = 0;b<count;b++) {
//			System.out.println(sound);
//		}
		
// ----------------------------------------------------------------------------------------------
		
		int inc = 3;
		String sound = "탕탕탕";
		
		if(fire == 1) {
			inc = 1;
			sound = "탕";
		}
		for(int b = 0;b < 30; b=b+inc) {
			System.out.println(sound);
		}
		
		
	}

}
