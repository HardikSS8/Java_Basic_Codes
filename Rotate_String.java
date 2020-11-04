class Solution {
    public boolean rotateString(String A, String B) {
        
        if(A.length() != B.length())
            return false;
        if(A.equals(B))
            return true;
        
        int len = A.length();
        
        int i = 1;
        while(i < len) {
            
            if(B.equals(A.substring(i, len) + A.substring(0, i)))
                return true;
            
            i++;
        }
        
        return false;
    }
}
