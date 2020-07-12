package com.conpany.project;

import java.util.Arrays;

public class Paixu {

	/**
	 * 冒泡排序
	 * @param arrays
	 * @return
	 */
	public static int[] sort(int [] arrays) {
		
		if(arrays.length==0) {
			return arrays;
		}
		
		for (int i = 0; i < arrays.length; i++) {

			for (int j = 0; j < arrays.length -1- i; j++) {

				if (arrays[j + 1] >arrays[j]) {
					int tmep = arrays[j + 1];
					arrays[j + 1] = arrays[j];
					arrays[j] = tmep;
				}

			}

		}
		return arrays;
	}
	/**
	 * 简单选择排序
	 * @param arrays
	 * @return
	 */
	public static int [] jdSort(int [] arrays) {
		
		if(arrays.length==0) {
			return arrays;
			
		}
		
		for(int i = 0 ;i <arrays.length;i++) {
			//最小的下标
			int minIndex=i;
			for(int j=i;j<arrays.length;j++) {
				if(arrays[j]<arrays[minIndex]) {
					minIndex=j;
					
				}
			}
			//交换
			int temp=arrays[minIndex];
			arrays[minIndex]=arrays[i];
			arrays[i]=temp;
		}
		
		
		return arrays;
	}
	/**
	 * 归并算法
	 * @param arrays
	 * @return
	 */
	public static int[] mergeSort(int[] arrays) {
		if (arrays.length < 2) {
			return arrays;
		}
		int mind = arrays.length / 2;

		int left[] = Arrays.copyOfRange(arrays, 0, mind);
		int right[] = Arrays.copyOfRange(arrays, mind, arrays.length);
		return merge(mergeSort(left), mergeSort(right));
	}
	
	
	
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];

		for (int index = 0, leftIndex = 0, rightIndex = 0; index < result.length; index++) {

			if (leftIndex >= left.length) {
				result[index] = right[rightIndex++];
			} else if (rightIndex >= right.length) {
				result[index] = left[leftIndex++];
			} else if (left[leftIndex] > right[rightIndex]) {
				result[index] =  right[rightIndex++];

			} else {
				result[index] =left[leftIndex++];
			}

		}

		return result;
	}
	public static void main(String[] args) {
		int [] srr = new int[] {2,10,5,88,34,1,43,2};
//		int [] star=new int[3];
//		int [] s= {1,4,6,8};
		System.out.println("冒泡排序="+Arrays.toString(sort(srr)));
		System.out.println("简单选择排序="+Arrays.toString(jdSort(srr)));
		System.out.println("归并算法排序="+Arrays.toString(mergeSort(srr)));
	}

}
