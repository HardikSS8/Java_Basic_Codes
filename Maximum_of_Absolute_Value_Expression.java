class Solution {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max1, max4 = max1;
        int min1 = Integer.MAX_VALUE, min2 = min1, min3 = min1, min4 = min1;
        int sum = 0;
        for(int i = 0; i< arr1.length; i++){
            sum = arr1[i] + arr2[i] + i;
            max1 = Math.max(max1, sum);
            min1 = Math.min(min1, sum);
            
            sum = arr1[i] + arr2[i] - i;
            max2 = Math.max(max2, sum);
            min2 = Math.min(min2, sum);
            
            sum = arr1[i] - arr2[i] + i;
            max3 = Math.max(max3, sum);
            min3 = Math.min(min3, sum);
            
            sum = arr1[i] - arr2[i] - i;
            max4 = Math.max(max4, sum);
            min4 = Math.min(min4, sum);
        }
        int diff1 = max1 - min1, diff2 = max2 - min2, diff3 = max3 - min3, diff4 = max4 - min4; 
        return Math.max(Math.max(diff1, diff2), Math.max(diff3, diff4));
    }
}
