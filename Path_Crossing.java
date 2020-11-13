class Solution {
    public boolean isPathCrossing(String path) {
        
        if(path.length() == 0 || path.length() == 1) return false;
        
        char[] p = path.toCharArray();
        int[][] A = new int[2000][2000];
        
        int row=1000,col=1000;
        A[row][col]=1;
        
        for(int i=0;i<p.length;i++) {
            if(p[i]=='N') {
                A[row-1][col]++; row=row-1;
            }
            else if(p[i]=='E') {
                A[row][col-1]++; col=col-1;
            }
            else if(p[i]=='S') {
                A[row+1][col]++; row=row+1;
            }
            else if(p[i]=='W') {
                A[row][col+1]++; col=col+1;
            }
            
            if(A[row][col]>1) return true;
        }
        
        return false;
    }
}
