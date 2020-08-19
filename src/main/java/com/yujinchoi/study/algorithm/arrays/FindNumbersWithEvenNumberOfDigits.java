package com.yujinchoi.study.algorithm.arrays;

public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int evenCount = 0;
		for (int num : nums) {
			int quote = num;
			int count = 0;
			while (true) {
				quote = quote / 10;
				if (quote > 0) count++;
				else break;
			}
			if (count % 2 == 1) evenCount++;
		}
		return evenCount;
	}
}
