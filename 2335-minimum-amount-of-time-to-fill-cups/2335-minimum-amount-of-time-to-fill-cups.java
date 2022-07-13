class Solution {
    public int fillCups(int[] amount) {
        int second = 0;
         Arrays.sort(amount);
            int highest = amount.length - 1;
            int secondhighest = amount.length - 2;
            
            while( amount[highest] > 0 && amount[secondhighest] > 0)
            {
                    amount[highest]--;
                    amount[secondhighest]--;
                    second++;
                    Arrays.sort(amount);
            }
            while(amount[highest]>0) {
                    amount[highest]--;
                    second++;
                    
            }
            return second;
    }
}