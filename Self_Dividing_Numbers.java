class Solution {
    public boolean self(int n) {
        int temp = n;
        while(n > 0) {
            int rem = n % 10;
            if(rem == 0 || temp % rem != 0)
                return false;
            n = n/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
    
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=left; i<=right; i++) {
            if(self(i))
                ans.add(i);
        }
        return ans;
    }
}
