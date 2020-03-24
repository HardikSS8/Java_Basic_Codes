class Solution {
    public boolean checkRecord(String s) {
    int a = 0 , l = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='A'){
                a++;
            if(a>1)
                return false; 
            continue;
            }
            while(i < s.length() && s.charAt(i)=='L'){
                l++;
                i++;
            }
            if(l>2)
                return false;
            else
                l=0; 
            if(i<s.length()&&s.charAt(i)=='P') 
                continue;
            else 
                i--;
        }
        return true;
    }
}
