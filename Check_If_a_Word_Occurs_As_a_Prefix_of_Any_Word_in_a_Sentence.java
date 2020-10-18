class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        
        int count = 1;
        String[] words = sentence.split(" ");
        
        for(String s : words) {
            
            if(s.contains(searchWord) && s.charAt(0) == searchWord.charAt(0))
                return count;
            else count++;
        }
        
        return -1;
    }
}
