class Solution {
        
        public int getPivot(int[] nums) {
                int n = nums.length;
                int s = 0;
                int e = n-1;
                
                while(s < e) {
                        int mid = s + (e - s) / 2;
                        
                        if(nums[mid] >= nums[0])
                        {
                                s = mid + 1;
                        }
                        else
                                e = mid;
                }
                return s;
        }
        
        public int binarySearch(int[] nums, int s, int e, int target) {
                
                while(s <= e)
                {
                        int mid = s + (e - s) / 2;
                        
                        if(nums[mid] == target) return mid;
                        
                        if( target > nums[mid]) s = mid + 1;
                        
                        else
                                e = mid - 1;
                        
                       
                } return -1;
        }
        
    public int search(int[] nums, int target) {
            int n = nums.length;
            int pivot = getPivot(nums);
            
            if( target >= nums[pivot] && target <= nums[n-1])
            {
                    return binarySearch(nums, pivot, n-1, target);
            }
            else
            {
                    return binarySearch(nums, 0 , pivot-1, target);
            }
        
    }
}