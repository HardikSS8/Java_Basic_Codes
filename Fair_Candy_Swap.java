//    2 ms

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        
       int tolA = 0; int tolB = 0;
        
        for(int i = 0; i < A.length; i++ )
            tolA+=A[i]; 
        
        boolean frec[] = new boolean[100001];
        int res[] = new int[2];
        
        for(int i = 0; i < B.length; i++){
            tolB += B[i]; 
            frec[B[i]] = true;
        }
          
        int diff = (tolB - tolA) /2;
        
        for(int i = 0; i < A.length; i++){
            int pair = A[i] + diff;
            if(pair >= 0 && pair <= 100000 && frec[pair]){
                res[0] = A[i];
                res[1] = pair;
            }
        }
      return res;
    }
}

//       8 ms

// class Solution {
//     public int[] fairCandySwap(int[] A, int[] B) {
        
       
//         int sa = 0, sb = 0;
        
//         for (int x: A) 
//             sa += x;
        
//         for (int x: B) 
//             sb += x;
        
//         int delta = (sb - sa) / 2;
        
//         Set<Integer> setB = new HashSet();
        
//         for (int x: B) 
//             setB.add(x);

//         for (int x: A)
//             if (setB.contains(x + extra))
//                 return new int[]{x, x + extra};

//         throw null;
//     }
// }
