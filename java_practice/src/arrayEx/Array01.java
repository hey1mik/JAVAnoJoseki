package arrayEx;

import java.util.Arrays;

public class Array01{
	// �迭�� ��¿� ���� ���� ����
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int[] arr3 = {100, 95, 80, 70, 60};
		
		char[] chArr = {'b','a','b','o'};
		
		System.out.println("����������������������for�� ��ü���� �迭 ��¡��������������������");
		
		for(int i = 0; i< arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i] + "/");
		}
		System.out.println();
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random()*10)+1;
			System.out.print(arr2[i] + "/");
		}
		System.out.println();
		
		System.out.println("����������������������for�� �ۿ��� �迭 ��¡��������������������");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(chArr));
		System.out.println(Arrays.toString(arr3));
		System.out.println(chArr);
	}
	
}
