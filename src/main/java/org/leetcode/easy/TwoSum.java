package org.leetcode.easy;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // create a new array

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        System.out.println("LeetCode. Easy. 1. Two Sum:");
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}


//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer,Integer> a= new HashMap<>();
//        int arr[] = new int[2];
//        for(int i=0;i<nums.length;i++){
//            a.put(target-nums[i], i);}
//        for(int i=0;i<nums.length;i++){
//            if(a.containsKey(nums[i]) && a.get(nums[i])!=i){
//                arr[0] = a.get(nums[i]);
//                arr[1] = i;
//                return arr; }
//        }
//
//        return arr; }
//}