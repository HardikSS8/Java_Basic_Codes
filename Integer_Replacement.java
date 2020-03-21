class Solution {    
    public int integerReplacement(long n) {
        
        // int temp = n;
        int count = 0;
        while(n != 1) {
            // if(temp == 2147483647)
            //     return 32;
            if((n%2) == 0) {
                n = n/2;   
            } else {
                if(integerReplacement(n-1) < integerReplacement(n+1))
                    n = n-1;
                else
                    n = n+1;   
            }
            count++;
        }
        return count;
    }
}
