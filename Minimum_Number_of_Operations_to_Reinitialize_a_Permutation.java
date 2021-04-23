class Solution {
    public int reinitializePermutation(int n) {
        
        int[] perm = new int[n];
        int[] compare = new int[n];
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            perm[i] = i;
            compare[i] = i;
        }

        int count = 0;
        
        while(!Arrays.equals(compare, perm) || count == 0) {
            

            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    arr[i] = perm[i / 2];
                } else {
                    arr[i] = perm[n / 2 + (i - 1) / 2];
                }
            }
            count++;
            
            // System.out.println(Arrays.toString(perm) + " " + Arrays.toString(arr) + "\n");
            
            for(int i = 0; i < n; i++) {
                perm[i] = arr[i];
            }                 
            
        }
        
        return count;
    }
}
