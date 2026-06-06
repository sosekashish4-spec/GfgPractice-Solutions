class Solution {
	public ArrayList<Integer> twoSum(int[] nums, int target) {
		// code here
		ArrayList<Integer>ans = new ArrayList<>();
		int i = 0;
		int j = nums.length - 1;
		while (i<j) {
			int sum = nums[i]+nums[j];
			if (sum>target) {
				j--;
			} else if (sum<target) {
				i++;
			} else {
				ans.add(i+1);
				ans.add(j+1);
				return ans;
			}
		}
		ans.add(-1);
		ans.add(-1);
		return ans;
		
	}
}
