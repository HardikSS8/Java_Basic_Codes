class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int count = 0, n = arr.length;
        double sum = 0;
   
        for(int i=0; i<k; i++)
            sum += arr[i];
        
        double MAX_AVG = sum/k;
        if(MAX_AVG >= threshold) {
            count++;
        }
        for(int i=k; i<n; i++){
            if(i < i+k) {
                sum += arr[i]-arr[i-k];
                if(sum/k >= threshold) {
                    count++;
                }
            }   
        }
        return count;
    }
}
