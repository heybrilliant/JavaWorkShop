package com.test;

public class Sample14 {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		int temp;
		boolean sorted = false;
		while(!sorted) { // !sorted=true
			sorted = true;
			for(int inx = 0; inx < arr.length-1 ; inx++) { //length가 마지막 값이 되버리면 값을 비교할때 마지막값+1번째 자리가 없으므로 오류로 값이 출력되지 않음
//			System.out.print(arr[inx]);
			if(arr[inx] > arr[inx+1]) { //값을 비교해서 움직일때 값을 저장할 임시값이 필요함 
				temp = arr[inx]; // 임시값을 선언해서 저장
				arr[inx] = arr[inx+1]; // 비교해서 큰 값을 자리 바꿔치기 
				arr[inx+1] = temp; // 임시값에 저장해뒀던 작은 값을 자리 다시 바꿔치기
				sorted = false;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
