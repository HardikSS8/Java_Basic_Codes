class Solution {
    public int minSteps(String s, String t) {
        
        int[] count = new int[26];
        int no = 0;
        
        for(char c : s.toCharArray())
            count[c - 'a']++;
        
        for(char b : t.toCharArray())
            count[b - 'a']--;
        
        // System.out.println(Arrays.toString(count));
        
        for(int i=0; i<26; i++) {
            if(count[i] > 0) 
                no += count[i];
        }
        
        return no;
            
    }
}
