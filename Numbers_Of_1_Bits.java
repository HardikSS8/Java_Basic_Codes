public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;
        int AND = 1;
        for (int i = 0; i < 32; i++) {
        // MASKING USING STARTING FROM 00000000000000000000000000000001 (1)
            if ((n & AND) != 0) {
                count++;
            }
        // SHIFT 1 bit at each time like 00000000000000000000000000000010 (2)
            AND <<= 1;
        }
        return count;
    }
}
