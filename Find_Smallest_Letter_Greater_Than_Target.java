class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        for(char c:letters) {
            
            if(c > target) {
                return c;
            }
        }
        
        return letters[0];
    }
    
//     Binary Search Method
    
//     public char nextGreatestLetter(char[] letters, char target) {
        
//         int lo = 0, hi = letters.length;
     
//         while (lo < hi) {
//             int mi = lo + (hi - lo) / 2;
//             if (letters[mi] <= target) lo = mi + 1;
//             else hi = mi;
//         }
//         return letters[lo % letters.length];
//     }
}
