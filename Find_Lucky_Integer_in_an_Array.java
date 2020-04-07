class Solution {
    public int findLucky(int[] arr) {
        
        int max = -1;
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);
        
        for(int i=0; i<arr.length; i++) {
            if(visited[i] == true)
                continue;
            
            int val = 1;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] == arr[i]) {
                    visited[j] = true;
                    val++;
                }
            }
            if(val == arr[i]) {
                if(arr[i] > max)
                    max = arr[i];
            }
        }
        return max;
    }
}
