class Solution {
    public int numOfSubarrays(int[] arr) {
        
        long odd = 0;
        int preSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            odd += preSum % 2;
        }

        return (int)(odd * (arr.length + 1 - odd) % 1000000007);
    }
}
