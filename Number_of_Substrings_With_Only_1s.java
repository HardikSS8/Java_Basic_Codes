class Solution {
    public int numSub(String s) {
        
        long count = 0;
        long sum = 0;
        
        s += "0";
        
        for(int i=0; i<s.length(); i++) {
            
            if(s.charAt(i) == '0') {
                sum += ((count + 1) * count / 2);
                count = 0;
            }
            else {
                count++;
            }            
        }
    
        return (int)(sum % 1000000007);
    }
}
