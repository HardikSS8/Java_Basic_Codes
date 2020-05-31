class Solution {
    public int distributeCandies(int[] candies) {
        
        HashSet<Integer> c = new HashSet<Integer>();
        
        for(int i=0; i<candies.length; i++) {
            
            c.add(candies[i]);
        }
        
        return Math.min(candies.length/2 , c.size());
    }
}
