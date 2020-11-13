class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     
        Set<String> set = new HashSet<>();
        
        String alpha = "abcdefghijklmnopqrstuvwxyz";   
        String[] codes = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String s : words) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<s.length(); i++) {
                int index = alpha.indexOf(s.charAt(i));
                sb.append(codes[index]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
