class Solution {
    
    public int[] constructRectangle(int area) {

        int u = (int) Math.sqrt(area);
        
        for (int i = u; i >= 1; i--) {
            if (area % i == 0) return new int[]{area / i, i};
        }
        return null;
    }
}
