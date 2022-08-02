class Solution {
    public List<Integer> lexicalOrder(int n) {
          List<Integer> res = new ArrayList<>();
        dfs(res, 0, n);
        return res;
    }
    
    private void dfs(List<Integer> res, int base, int max){
       
        for(int digit = 0; digit < 10; digit++){
            int curNum = base + digit;
            
            if(curNum > max) return;
           
            if(curNum == 0) continue;

            res.add(curNum);
            
            if(curNum * 10 <= max){
                dfs(res, curNum * 10, max);
            }
        }
    }
}