package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabSeven {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {
    }

    /**
     * Please refer to the README file for question(s) description
     */
    public static int kthSmallestSubarraySum(int[] nums, int k) {
        int[] sub = subSum(nums);
        int temp = 0;

        for (int i = 0; i < sub.length; i++) {
            for (int j = 0; j < sub.length - 1; j++) {
                if (sub[j] > sub[j + 1]) { 
                    temp = sub[j];
                    sub[j] = sub[j + 1];
                    sub[j + 1] = temp;
                }
            }
        }

        return sub[k - 1];
    }

    public static int arraySize(int[] nums) {
    int n = nums.length;
    return (n * (n + 1)) / 2; 
}

    public static int[] subSum(int[] nums) {
        int[] sub = new int[arraySize(nums)];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                sub[index++] = sum;
            }
        }
        return sub;
    }
}
