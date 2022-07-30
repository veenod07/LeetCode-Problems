class Solution {
    public int sumSubarrayMins(int[] arr) {
        long res = 0l;
        Stack<Integer> s = new Stack<>();
        int j = 0;
        int k = 0;
            for(int i = 0; i <= arr.length; i++) {
                    while(!s.empty() && arr[s.peek()] > (i == arr.length? Integer.MIN_VALUE: arr[i])) {
                            j = s.pop();
                            k = s.isEmpty()? -1: s.peek();
                            res = (res + (i-j)*(j-k)*(long)(arr[j]))%1000000007;
                    }
                    s.push(i);
            }
            return (int)res;
                
    }
}