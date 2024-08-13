package com.evan;

import java.util.Arrays;

public class TwoNumSum2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = sumTwoNums(26, nums);
        assert result != null;
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] sumTwoNums(int target, int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int cur = nums[left] + nums[right];
            if (target > cur) {
                left++;
            } else if (target < cur) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return null;
    }

}
