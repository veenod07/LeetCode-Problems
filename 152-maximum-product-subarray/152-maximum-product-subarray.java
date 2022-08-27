class Solution {
    public int maxProduct(int[] nums) {
        
            int n = nums.length;
            int m = Integer.MIN_VALUE;
            int p = 1;
            
            for(int i= 0; i < n; i++)
            {
                    p *= nums[i];
                    m = Math.max(m, p);
                    if(p == 0) p=1;
            }
            p = 1;
            for(int i = n-1; i >= 0; i--)
            {
                    p *= nums[i];
                    m = Math.max(m, p);
                    if(p == 0) p=1;
            }
            return m;
            
            
            
        
         
    }
}