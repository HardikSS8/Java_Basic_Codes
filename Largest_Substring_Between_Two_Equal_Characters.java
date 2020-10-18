class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int max = -1;
        
        for(int i = 0; i < s.length(); i++) {
            
            StringBuilder curr = new StringBuilder();
            curr.append(s.charAt(i));
            
            if(s.contains(curr) && s.lastIndexOf(curr.toString()) != i) {
                max = Math.max(max, (s.lastIndexOf(curr.toString()) - 1) - i);
            }
        }
        
        return max;
    }
}
