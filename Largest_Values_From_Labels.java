class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) { 
        
        final int n = values.length; 
        int[][] arr = new int[n][2];
        
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for(int i=0; i<n; i++) {
            arr[i][0] = values[i]; 
            arr[i][1] = labels[i]; 
            map.put(labels[i], 0); 
        }
        
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);
        
        // System.out.println(Arrays.deepToString(arr));
        
        int count = 0, ret = 0;
        
        for(int i=n-1; i>=0; i--) {
        
            // System.out.println(map);
            
            int val = arr[i][0], label = arr[i][1];  
            
            if(map.get(label) < use_limit) {
                ret += val; 
                map.put(label, map.get(label)+1); 
                count++; 
            }
            if(count == num_wanted) break; 
        }
        return ret;
    }
}
