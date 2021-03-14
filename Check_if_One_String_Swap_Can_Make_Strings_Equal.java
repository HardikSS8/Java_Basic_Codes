class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        int[] count1 = new int[26];           
        int count = 0;
        
        for(int i = 0; i < s1.length(); i++) {
            
            count1[s1.charAt(i) - 'a']++;
            count1[s2.charAt(i) - 'a']--;
            if(s1.charAt(i) == s2.charAt(i))
                count++;
        }
        
        for(int i = 0; i < 26; i++) {
            
            if(count1[i] > 0)
                return false;
        }
        
        return s1.length() - count == 2 || count == s1.length();
    }
}
