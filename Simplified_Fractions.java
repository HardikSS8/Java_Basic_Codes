class Solution {
    
    public static int gcd(int a, int b){
        if (b == 0)
            return a;
        
        return gcd(b, a % b);
    }
    
    public List<String> simplifiedFractions(int n) {
        
        List<String> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            
            for(int j=1; j<=n; j++) {
                
                if(gcd(i, j) == 1 && i < j)
                    list.add(i + "/" + j);
            }
        }
        
        return list;
    }
}
