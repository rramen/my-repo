# Given an integer array nums, find a contiguous non-empty subarray within the array that has
# the largestproduct, and return the product.
# It is guaranteed that the answer will fit in a 32-bit integer.
# A subarray is a contiguous subsequence of the array.

# Input: nums = [2,3,-2,4]
# Output: 6
# Explanation: [2,3] has the largest product 6.

class MaxProdSubarray:
    def MaxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        curMax, curMin = 1, 1
        
        for n in nums:
            temp = n*curMax
            curMax = max(n*curMax, n*curMin, n)
            curMin = min(n*curMin, temp, n)
            res = max(curMax, res)
        
        return res