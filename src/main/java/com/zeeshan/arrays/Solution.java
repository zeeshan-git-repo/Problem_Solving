package com.zeeshan.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZAhmad
 */


public class Solution {
    public static void main(String args[]){
        int nums[] = new int[]{0,1,2,4,5,7};
        Solution sol = new Solution();
        System.out.println(sol.summaryRanges(nums));
    }
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                i++;
            }
            int b = nums[i];
            if (a == b) {
                ranges.add(String.valueOf(a));
            } else {
                ranges.add(a + "->" + b);
            }
        }
        return ranges;
    }
}

