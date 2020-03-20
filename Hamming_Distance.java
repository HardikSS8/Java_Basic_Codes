class Solution {
    public int hammingDistance(int x, int y) {
        
        String A = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String B = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
       
        // System.out.println(A);
        // System.out.println(B);
        
        int hamming = 0;
        
        int i = 0;
        while(i < A.length()) {
            if(A.charAt(i) != B.charAt(i))
                hamming++;
            i++;
        }
        return hamming;
    }
}
