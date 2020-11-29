class Solution {
    
    public int maxRepeating(String sequence, String word) {
        
        int count = 0;
        String s = word;
        
        while(word.length() <= sequence.length()){
        
            if(sequence.indexOf(word) > -1) {
                count++;
            }           
            word += s;
        }        
        return count;
    }
}
