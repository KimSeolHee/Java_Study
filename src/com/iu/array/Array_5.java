package com.iu.array;

public class Array_5 {
	
	public static void main(String[] args) {
		int [] nums1 = {1,2,3};
		System.out.println(nums1.length);
		
		//얕은 복사(주소만 복사)
		int [] nums2 = nums1;
		System.out.println(nums2.length);
		
		int [] nums3 = new int[3];
		for(int i = 0;i < nums1.length;i++) {
			nums3[i] = nums1[i];
		}
		
		nums2[0] = 9;
		System.out.println(nums1[0]);
		
		//깊은복사
		nums3[0] = 100;
		System.out.println(nums1[0]);
		System.out.println(nums3[0]);
		
		System.out.println(nums3.length);
		//초기값 0이 들어감
		nums3 = new int [5]; //heap영역에 새로운 주소값이 생김
		System.out.println(nums3[0]);
		System.out.println(nums3.length);
	}

}
