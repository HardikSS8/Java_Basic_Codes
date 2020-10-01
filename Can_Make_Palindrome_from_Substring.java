class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        
        List<Boolean> list = new ArrayList<>();
    
        int n = s.length();
        int[][] map = new int[n+1][26];
        
        for(int i = 0; i < n; i++)
        {
            for(int j=0;j<26;j++)
                map[i+1][j] = map[i][j];
            
            map[i+1][s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < queries.length; i++) {
            
            int l = queries[i][0];
            int r = queries[i][1];
            
            int k = queries[i][2];
            int res = 0;
            
            for(int j = 0; j < 26; j++)
                res += (map[r+1][j] - map[l][j]) % 2;
            
            list.add(res / 2 <= k);
        }
        
        return list;
    }
}
        
