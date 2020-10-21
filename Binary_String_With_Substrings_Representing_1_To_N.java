class Solution {
    public boolean queryString(String S, int N) {
        
        int i = 1;
        
        while(i <= N) {
            
            String s = Integer.toBinaryString(i);
            
            if(!S.contains(s))
                return false;
            i++;
        }
        
        return true;
    }
}
