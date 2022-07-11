package com.iu.array;

import java.util.Scanner;

public class Array_2 {
	
	public static void main(String[] args) {
		// 배열은 어떤 데이터타입이든 상관 X
		// 모으려고 하는 데이터타입 [] 변수명 = new 모으려고 하는 데이터타입 [갯수];
		String [] names = new String[3];
//		names[3] = "";
//		System.out.println(names[3]); //ArrayIndexOutOfBoundsException >> 배열 범위를 벗어남
		
		int [] nums = new int[3];
		System.out.println(names[0]); // String타입이므로 참조타입의 초기 값 null이 들어감
		
		Scanner [] sc = new Scanner[2];
		System.out.println(sc[0]); // reference 타입 → 초기값 null
		
		int [] nums2 = {1, 4, 52}; // >> 선언도 가능, 배열 3칸을 만들면서 [0]:1,[1]:4,[2]:52
		
		
	}
}
