package com.yujinchoi.study.algorithm.arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0) {
			for (int i = 0 ; i < nums2.length ; i++) { nums1[i] = nums2[i]; } return;
		}

		int idxM = m-1;
		int idxN = n-1;

		for (int i = nums1.length - 1 ; i >= 0 && idxM >= 0 && idxN >= 0; i--) {
			if (nums1[idxM] > nums2[idxN]) { nums1[i] = nums1[idxM--]; }
			else {nums1[i] = nums2[idxN--];}
		}

		for (int i = 0 ; i <= idxN ; i++) { nums1[i] = nums2[i]; }
	}
}
