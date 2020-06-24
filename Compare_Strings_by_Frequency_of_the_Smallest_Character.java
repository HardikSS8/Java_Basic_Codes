class Solution {
    public int calculateFreq(String a) {
        int[] count = new int[26];
        
        for(int i=0; i<a.length(); i++)
            count[a.charAt(i) - 'a']++;
        
        int min = 0;
        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                min = count[i];
                break;
            }
        }
        return min;
    }
    
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int[] res = new int[queries.length];
        int word[] = new int[words.length];
                
        for(int i = 0; i < words.length; i++) {
            word[i] = calculateFreq(words[i]);
        }
        Arrays.sort(word);
        
        for(int i = 0; i < queries.length; i++) {
            
            int lead_count = calculateFreq(queries[i]);
            int j = 0;
            for(j = 0; j < word.length; j++){
                if(lead_count < word[j])
                    break;
            }
            res[i] = word.length - j;
        }
        return res;
    }
}

    
