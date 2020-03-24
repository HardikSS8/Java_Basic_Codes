class Solution {
    
    public char flipBit(char c) {
        return (c == '0') ? '1' : '0';
    }
    
    public int findComplement(int num) {
        
        String A = String.format("%32s", Integer.toBinaryString(num));
        String B = "";
        
        for(int i=0; i<A.length(); i++) {
            B += flipBit(A.charAt(i));
        }
        return Integer.parseInt(B, 2);
    }
}
