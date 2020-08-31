package com.yujinchoi.study.algorithm.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandItsDoubleExist {
	public boolean checkIfExist(int[] arr) {
		Set<Integer> set = new HashSet(arr.length);
		for (int num : arr) {
			if (num % 2 == 0 && set.contains(num / 2)) { return true; }
			if (set.contains(num * 2)) { return true; }
			set.add(num);
		}
		return false;
	}
}
