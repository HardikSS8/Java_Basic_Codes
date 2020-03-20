class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0)
            return false;
        
        int temp = x;
        int rem = 0;
        int rev = 0;
        while(x != 0) {
            rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }
        
        if(temp == rev)
            return true;
        else
            return false;
    }
}
