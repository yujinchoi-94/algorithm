package com.yujinchoi.study.algorithm.arrays;

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int maxCount = 0;
		for (int num : nums) {
			if (num == 1) { count++; }
			else {
				if (count > maxCount) { maxCount = count; }
				count = 0;
			}
		}

		if (count > maxCount) { return count; }
		return maxCount;
	}
}
