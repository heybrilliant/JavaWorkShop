package com.test;

public class Sample14 {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4};
		int temp;
		boolean sorted = false;
		while(!sorted) { // !sorted=true
			sorted = true;
			for(int inx = 0; inx < arr.length-1 ; inx++) { //length�� ������ ���� �ǹ����� ���� ���Ҷ� ��������+1��° �ڸ��� �����Ƿ� ������ ���� ��µ��� ����
//			System.out.print(arr[inx]);
			if(arr[inx] > arr[inx+1]) { //���� ���ؼ� �����϶� ���� ������ �ӽð��� �ʿ��� 
				temp = arr[inx]; // �ӽð��� �����ؼ� ����
				arr[inx] = arr[inx+1]; // ���ؼ� ū ���� �ڸ� �ٲ�ġ�� 
				arr[inx+1] = temp; // �ӽð��� �����ص״� ���� ���� �ڸ� �ٽ� �ٲ�ġ��
				sorted = false;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
