class Solution {
    public int numTeams(int[] rating) {
        
        int n = rating.length, count = 0;
        for(int i=0; i<n; i++) {
        
            for(int j=0; j<n && j != i; j++) {
            
                for(int k=0; k<n && k!=j && k!=i; k++) {
                    
                    if((rating[i] < rating[j] && rating[j] < rating[k]) ||  (rating[i] > rating[j] && rating[j] > rating[k]))
                        count++;
                }   
            }    
        }
        return count;
    }
}
