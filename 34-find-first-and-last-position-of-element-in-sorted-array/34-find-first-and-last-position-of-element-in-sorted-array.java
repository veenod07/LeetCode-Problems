class Solution {
    public int[] searchRange(int[] nums, int target) {
                
          int n = nums.length;
        int i = search(true, 0 , n - 1 ,target, nums );
        int j = search(false, 0 ,n - 1, target, nums );
        return new int[]{i , j};
    }
    
    int search(boolean lower_bound, int l , int r, int target, int []nums){
         int m , j = -1;
         while(l <= r){
            m = l + (r - l)/2;
            if(nums[m] == target ){
                j = m;
                if(lower_bound)
                    r = m -1;
                else
                    l = m + 1;
            }
            else if(nums[m] > target){
                r = m - 1; 
            }else{
                l = m + 1;
            }
        }
        return j;
        }
            
}