class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],1);
            else
                l.add(nums[i]);
        }
        return l;
    }
}