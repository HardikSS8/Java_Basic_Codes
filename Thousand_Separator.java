class Solution {
    public String thousandSeparator(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        if(n == 0)
            return "0";
        
        int count = 0;
        while(n > 0) {
            
            if(count == 3) {
                count = 1;
                sb.append("." + n % 10);
            }
            else {
                count++;
                sb.append(n % 10);
            }
            
            n /= 10;
        }
        
        return sb.reverse().toString();
    }
}
