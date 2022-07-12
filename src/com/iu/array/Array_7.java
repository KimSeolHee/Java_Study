package com.iu.array;

public class Array_7 {
	
	public static void main(String[] args) {
		int [] ar = {4,7,1,3,9};
		//내림차순
		//앞뒤로 값비교 후 작은값이 뒤로
		//[0]값과 나머지 값들 비교하면서 가장 큰게 앞으로 돌아가면서 비교 후 자리 변경 
		
		for(int i=0;i < ar.length-1;i++) {
			//i가 0일때 1234와 비교
			//i가 1일때 234비교
			//i가 2일때 34와 비교
			//i가 3일때 4번과 비교
			for(int j = i + 1;j < ar.length;j++) {
				if(ar[i] < ar[j]) {
					//아래는 i값이 j값을 덮어서 j값이 사라짐.
					//그래서 변수에 j값을 담아서 나중에 따로 i에 j값을 담는다.
//					ar[j]=ar[i];
//					ar[i]=ar[j];
					int tmp = ar[j];
					ar[j]=ar[i];
					ar[i]=tmp;
				}
			}
		}
	}

}
