/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.\
A subarray is a contiguous part of an array.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Runtime of O(n)
*/
class maxSubArray {
    public int maxSub(int[] nums) {
        int curSum = 0, maxSum = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(curSum < 0){
                curSum = 0;
            }
            curSum += nums[i];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
};