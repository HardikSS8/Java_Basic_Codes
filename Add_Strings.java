class Solution {
    public String addStrings(String num1, String num2) {
                
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while(i >= 0 || j >= 0) {
            int d1 = i >= 0 ? Character.getNumericValue(num1.charAt(i)) : 0;
            int d2 = j >= 0 ? Character.getNumericValue(num2.charAt(j)) : 0;    
            
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            
            sum = sum % 10;
            sb.append(sum);
            
            i--;
            j--;
        }
        
        if(carry > 0) sb.append(carry);
        
        return sb.reverse().toString();
    }
}
