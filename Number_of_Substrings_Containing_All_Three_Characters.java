class Solution {
    public int numberOfSubstrings(String s) {
        
        int n = s.length(), ans=0, left=0, right=0;
        
        char[] str = s.toCharArray();
        int[] count = new int[3]; 
        
        while(right < n) {
            
            count[str[right]-'a']++;
            
            while(left < right && count[0] > 0 && count[1] > 0 && count[2] > 0){ 
                ans += n - right;  
                count[str[left++] - 'a']--;
            }
            right++;
            
            
            // System.out.println("Count : " + Arrays.toString(count));
            // System.out.println("Ans : " + ans + "\n");
        }
        return ans;
    }
}
