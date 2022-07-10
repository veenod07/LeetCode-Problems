class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
            int ans = Integer.MIN_VALUE;
            int s = 0, e = nums.length-1;
            
            while(s < e)
            {
                    ans = Math.max(ans, nums[s] + nums[e]);
                    s++;
                    e--;
                    
            }
            return ans;
    }
}