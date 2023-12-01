package org.leetcode.easy;

public class ClimbingStairs {

    public static int climbingStairs(int k, int n) {

        if (k > n) {
            return 0;
        }
        if (k == n) {
            return 1;
        }
        return climbingStairs(k + 1, n) + climbingStairs(k + 2, n);
    }

    public static int climbStairs(int n) {

        return climbingStairs(0, n);
    }

    public static int climbStairsAnotherWay(int n) {

        if (n <= 2) return n;

        int byOne = 1;
        int byTwo = 2;

        for(int i = 2; i < n; i ++) {
            int temp = byOne;
            byOne = byTwo;
            byTwo = temp + byTwo;
        }
        return byTwo;
    }

    public static void main(String[] args) {
        System.out.println(climbStairsAnotherWay(5));
    }

}
