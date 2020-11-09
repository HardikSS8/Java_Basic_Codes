class Solution {
    public int findMedian(int arr[]) {
        
        Arrays.sort(arr);
        
        int len = arr.length;
        return arr[(len - 1) / 2];
    }
    
    
    public int[] getStrongest(int[] arr, int k) {
        
        
        int m = findMedian(arr);
        
        int i = 0;
        int j = arr.length - 1;
        int[] ans = new int[k];  
        int p = 0;
        
        while(p < k) {
            int value1 = Math.abs(arr[i] - m);
            int value2 = Math.abs(arr[j] - m);
            
            if(value1 > value2)
                ans[p++] = arr[i++];
            else
                ans[p++] = arr[j--];
        }
            
        return ans;
    }

}
