class Solution {
    public boolean checkPowersOfThree(int n) {
        
      // Method - 1
      
//         String s = Integer.toString(n, 3);
        
//         System.out.println(s);
        
//         if(s.contains("2"))
//             return false;
//         else 
//             return true;
      
      // Method - 2
      
        if(n == 0 || n == 1)
            return true;
        
        int remianValue = n % 3;
        
        if(remianValue == 2)
            return false;
            
        if(remianValue == 1){
            n -= 1;
        }
            
        n = n/3;
        
        return checkPowersOfThree(n);
    }
}
