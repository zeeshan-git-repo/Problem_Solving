package com.zeeshan.arrays;

/**
 *
 * @author ZAhmad
 */
public class RotateArray {
    
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        // Normalize the number of rotations
        k = k % nums.length;
        if (k < 0) {
            k += nums.length; // Java modulo can return negative, adjust if needed
        }
        
        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        RotateArray rotator = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotator.rotate(nums, 9); // Rotate array by 3 steps
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
