class Solution {
    public int maximumPopulation(int[][] logs) {
        
        int i = 1950;
        
        int max_pop = Integer.MIN_VALUE;
        
        int[] year = new int[2100];
        int ans = 0;
        
        while(i <= 2050) {
            
            int count = 0;
            
            for(int[] arr : logs) {
                int birth_i = arr[0];
                int death_i = arr[1];
                
                if(birth_i <= i && death_i > i) {
                    count++;
                }
                
                year[i] = count;
            }
            i++;
        }
        
        for(i = 0; i < year.length; i++) {
            
            if(year[i] > max_pop) {
                max_pop = year[i];
                ans = i;
            }
        }
        
        return ans;
    }
}
