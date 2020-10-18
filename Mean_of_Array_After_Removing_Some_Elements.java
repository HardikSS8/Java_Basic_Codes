class Solution {
    public double trimMean(int[] arr) {
        
        double sum = 0;
     
        int len = arr.length;
        int start = (len * 5) / 100;
        
        Arrays.sort(arr);
           
        for(int i=start; i < len - start; i++)
            sum += arr[i];
        
        int total = len - (2 * start);
        
        return sum / total;
    }
}
