class Solution {
    
    public int calculateManhattanDis(int x1, int y1, int x2, int y2) {
        
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
    
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int index = -1;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < points.length; i++) {
            
            if(points[i][0] == x || points[i][1] == y) {
                
                int dis = calculateManhattanDis(x, y, points[i][0], points[i][1]);
                
                if(dis < min) {
                    min = dis;
                    index = i;
                }
            }
        }
        
        return index;
    }
}
