/* 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Runtime of O(n)
*/
class containsDuplicate{
    public boolean duplicate(int[] nums){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
};