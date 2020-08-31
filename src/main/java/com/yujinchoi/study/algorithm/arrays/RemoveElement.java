package com.yujinchoi.study.algorithm.arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int len = nums.length;
		int swapTarget = len - 1;
		for (int i = len - 1 ; i >= 0 ; i--) {
			if (nums[i] == val) {
				nums[i] = nums[swapTarget--];
				len--;
			}
		}

		return len;
	}
}
