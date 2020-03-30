class Solution {
    public int[] dailyTemperatures(int[] T) {
        
        int[] ans = new int[T.length];
        Stack<Integer> s = new Stack<Integer>();
        int len = T.length;
        for (int i=0; i<len; i++) {
            
            while (!s.isEmpty() && T[i] > T[s.peek()]) {
                int index = s.pop();
                ans[index] = i - index;
            }
            s.push(i);
        }
        return ans;
    }
}
