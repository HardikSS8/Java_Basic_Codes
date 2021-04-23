class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        int count = 0;
        
        Arrays.sort(costs);
        
        // System.out.println(Arrays.toString(costs));
        
        for(int i = 0; i < costs.length && coins > 0; i++) {
            
            if(costs[i] <= coins) {
                count++;
                coins -= costs[i];
            }
        }
        
        return count;
    }
}
