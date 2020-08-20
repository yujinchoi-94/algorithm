package com.yujinchoi.study.algorithm.arrays;

public class SquaresOfASortedArray {
	public int[] sortedSquares(int[] A) {
		int len = A.length;
		int fast_index = 0;
		int[] result = new int[len];
		while (fast_index < len && A[fast_index] < 0) {fast_index++;}
		if (fast_index == 0 ) {
			for (int i = 0; i < len ; i++) { result[i] = A[i] * A[i]; }
			return result;
		}

		int slow_index = fast_index - 1;
		int i = 0;

		while (slow_index >= 0 && fast_index < len) {
			int slow = A[slow_index] * A[slow_index];
			int fast = A[fast_index] * A[fast_index];
			if (slow < fast) {result[i] = slow; slow_index--;}
			else {result[i] = fast; fast_index++;}
			i++;
		}

		while (slow_index >=0) {result[i] = A[slow_index] * A[slow_index]; i++; slow_index--;}
		while (fast_index < len) {result[i] = A[fast_index] * A[fast_index]; i++; fast_index++;}
		return result;
	}
}
