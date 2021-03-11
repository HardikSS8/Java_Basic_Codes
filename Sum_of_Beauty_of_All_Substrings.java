class Solution {
    
    public int beauty(int[] count) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < 26; i++) {
            if(count[i] > max)
                max = count[i];
            if(count[i] < min && count[i] != 0)
                min = count[i];
        }   
        return max - min;
    }
    
    public int beautySum(String s) {
        
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            int[] count = new int[26];      
            for(int j = i; j < s.length(); j++) {
                
                count[s.charAt(j) - 'a']++;        
                // System.out.println(Arrays.toString(count));              
                sum += beauty(count);
            }
        }
        return sum;
    }
}
