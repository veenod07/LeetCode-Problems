class Solution {
    public int pivotIndex(int[] nums) {
        

            int tsum = 0;
            int leftsum = 0;
            
            for( int i: nums)
            {
                    tsum += i;
            }
            
            for(int i = 0; i < nums.length; i++)
            {
                    int rightsum = tsum - leftsum - nums[i];
                    
                    if(rightsum == leftsum) return i;
                    
                    leftsum += nums[i];
                    
            }
            
            return -1;
    }
}