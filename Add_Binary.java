class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length()-1;
        int j = b.length()-1;
        
        String ans = "";
        int sum = 0;
        
        while(i>=0 || j>=0 || sum == 1) {
            
            sum = sum + ((i>=0) ? a.charAt(i) - '0' : 0);
            sum = sum + ((j>=0) ? b.charAt(j) - '0' : 0);
            
            // Typecasting 
            ans = (char) (sum % 2 + '0') + ans;
            
            sum = sum/2;
            i--;
            j--;
        }
        return ans;
    }
}
