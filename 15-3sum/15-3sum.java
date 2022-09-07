class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
                List<List<Integer>> a = new ArrayList<List<Integer>>();
                Set<List<Integer>> s = new HashSet<>();
                
            Arrays.sort(nums);
            for(int i = 0; i < nums.length - 2; i++){
                    int  l = i + 1, r = nums.length - 1;
                    while(l < r)
                    {
                            int sum = nums[i] + nums [l] + nums[r];
                            if(sum == 0)
                                    s.add(Arrays.asList(nums[i], nums[l], nums[r]));
                            if(sum < 0)
                                    l++;
                            else
                                    r--;
                    }
            }
            return new ArrayList(s);
          
        
            
    }
}