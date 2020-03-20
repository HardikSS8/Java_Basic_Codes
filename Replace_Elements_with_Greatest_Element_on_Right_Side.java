class Solution {
    public int[] replaceElements(int[] arr) {
        
        int len = arr.length, max = arr[len-1];
        
        for(int i=len-2; i>=0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(max < temp) 
                max = temp;
        }
        arr[len-1] = -1;
        return arr;
    }
}
