class Solution {
     public int[] sortArrayByParityII(int[] A) {
        
        int len = A.length;
        int[] val = new int[A.length];
        int even = 0;
        int odd = 1;

        for (int i = 0; i < len; i++) {
            if((A[i] & 1) == 0)
            {
                val[even] = A[i];
                even += 2;
            }else {
                val[odd] = A[i];
                odd += 2;
            }
        }

        return val;

    }
}
