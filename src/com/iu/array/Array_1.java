package com.iu.array;

public class Array_1 {
	
	public static void main(String[] args) {
		// 배열 선언
		// 변수 선언공식
		// 데이터타입 변수명;
		// 모으려고 하는 데이터타입 [] 변수명
		int age = 30;
		int [] nums = new int[3]; //3가지 정수형을 모으려고 합니다.라고 선언한 것.
		//heap영역에 int타입을 3개 만들라는 것.(4byte) - 힙영역에 만들어진 주소를 nums에 담으세요.(실제 데이터 힙영역에 있음)
		//nums에는 힙을 가르키는 메모리 주소가 들어가 있음(Reference타입 - 실제값을 가르키는 주소가 들어있음.)
		System.out.println(age); // 30 >> 정수타입 30이 들어있음.
		System.out.println(nums); //[I@37d31475 >>[ : 배열 I : 정수타입의미 @ : 뒤에 메모리 주소
		
		nums[0] = 10;
		nums[1] = age;
		nums[2] = 50;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		char [] names = new char[2];
		System.out.println(names);
		String [] str = new String[3];
		System.out.println(str);
		
		names[0] = 97;
		names[1] = '한';
		System.out.println(names[0]);
		System.out.println(names[1]);
		String n="test";
		System.out.println(n);
		
	}

}

