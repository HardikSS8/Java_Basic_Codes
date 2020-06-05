class Solution {
    public boolean isBoomerang(int[][] points) {
    
        float area = (points[0][0] * (points[1][1] - points[2][1]) + points[1][0] * (points[2][1] - points[0][1]) + points[2][0] * (points[0][1] - points[1][1])) / 2.0f; 
        
        return Math.abs(area) != 0;
    }
}
