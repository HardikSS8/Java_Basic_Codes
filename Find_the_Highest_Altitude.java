class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] anas = new int[gain.length + 1];
        
        int max = Integer.MIN_VALUE;
        
        ans[0] = 0;
        ans[1] = gain[0];
        
        int sum = ans[0] + ans[1];
        
        for(int i = 2; i <= gain.length; i++) {
            sum += gain[i-1];
            ans[i] = sum;
        }
        
        // System.out.println(Arrays.toString(ans));
        
        for(int i = 0; i < ans.length; i++) {
            max = Math.max(max, ans[i]);
        }
        
        return max;
    }
}
