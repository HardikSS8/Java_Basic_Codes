class Solution {
    
    public boolean check(int[] arr1, int[] arr2) {
        for(int i=0; i<26; i++) {
            if(arr1[i] > arr2[i]) return false;  
        }
        return true;
    }
    
    public int countCharacters(String[] words, String chars) {
        
        if(chars.length() == 0 || words == null) return 0;
        
        int ans = 0;
        
        int[] count = new int[26];
        
        for(char c : chars.toCharArray())
            count[c - 'a']++;
        
        for(String s : words) {
            
            int[] temp_count = new int[26];
            
            for(char c : s.toCharArray())
                temp_count[c - 'a']++;
            
            if(check(temp_count, count))
                ans += s.length();
        
        }
        
        return ans;
    }
}
