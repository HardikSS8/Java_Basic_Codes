class Solution {
    public int clumsy(int N) {
        
        Integer res;
        
        if(N == 0)
            return 0;
        if(N == 1)
            return N;
        else if(N == 2)
            return N * (N-1);
        else if(N == 3)
            return (N * (N-1)) / (N-2);
        else if(N == 4)
            return (N * (N-1)) / (N-2) + (N-3);
        else {
            res = (N*(N-1))/(N-2);
            if((N-3)%4 == 0) 
                res-=2;
            else if((N-3)%4 == 2 || (N-3)%4 == 3) 
                res+=1;            
        }
        return res;
    }
}
