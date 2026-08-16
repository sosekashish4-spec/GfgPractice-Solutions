class Solution {
    boolean twoSum(int nums[], int target) {
         HashSet<Integer>set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
             if(set.contains(target-nums[i])) return true;
             set.add(nums[i]);
         }
         return false;
    }
}