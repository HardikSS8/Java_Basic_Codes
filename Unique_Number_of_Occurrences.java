class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int n = arr.length;
        boolean flag = false;
        List<Integer> count = new ArrayList<Integer>();
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        
        for(int i=0; i<n; i++) {
            if(visited[i] == true)
                continue;
            int val = 1;
            for(int j=i+1; j<n; j++) {
                if(arr[j] == arr[i]) {
                    visited[j] = true;
                    val++;
                }
            }
            count.add(val);
        }
        Set<Integer> s = new HashSet<Integer>(count);
        return count.size() == s.size();
    }
}
