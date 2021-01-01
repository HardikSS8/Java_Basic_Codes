class Solution {
    public String reorderSpaces(String text) {
        
        String[] words = text.trim().split("\\s+");
                
        int no_of_spaces = 0;
        
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ')
                no_of_spaces++;
        }
            
        // If no space in input
        if(no_of_spaces <= 0)
            return text;
        
        // If only word in the input
        if(words.length == 1) {
            for(int i=0; i<no_of_spaces; i++) {
                words[0] += " ";
            }
            return words[0];
        }
        
        int final_space = no_of_spaces / (words.length - 1);
                    
        StringBuilder ans = new StringBuilder();
                
        // Add similar spaces between the words
        for(int i = 0; i < words.length; i++) {
            
            ans.append(words[i]);
            
            if(no_of_spaces >= final_space) {
                for(int j = 0; j < final_space; j++) {
                    ans.append(" ");
                }
                no_of_spaces -= final_space;
            }
        }
    
        // Append remaining spaces at the end
        while(no_of_spaces > 0) {
            ans.append(" ");
            no_of_spaces--;
        }
        
        return ans.toString();
    }
}
