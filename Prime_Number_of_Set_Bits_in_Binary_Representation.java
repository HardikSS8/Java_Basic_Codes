class Solution {

    public int no_of_ones(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
    
    public int countPrimeSetBits(int L, int R) {    
        int ans = 0;
        int i = L;
        while(i <= R) {
            String A = Integer.toBinaryString(i);
            int ones = no_of_ones(A);
            if (ones==2 ||ones==3 ||ones==5 ||ones==7 ||ones==11 ||ones==13 ||ones==17 ||ones==19){
                ans++;
            } 
            i++;
        }
        return ans;
    }
}
