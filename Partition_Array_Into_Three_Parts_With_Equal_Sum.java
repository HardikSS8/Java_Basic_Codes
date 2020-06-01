class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        
        int sum = 0;
        for(int i: A)
            sum += i;
        
        int equalSum = sum / 3;
        
        int sum1 = 0;
        int index1 = 0;
        
        for(int i=0; i<A.length; i++) {
            sum1 += A[i];
            if(sum1 == equalSum) {
                index1 = i;
                break;
            }
        }
        
        int sum2 = 0;
        int index2 = 0;
        
        for(int i=index1+1; i<A.length; i++) {
            sum2 += A[i];
            
            if(sum2 == equalSum) {
                index2 = i;
                break;
            }
        }
        
        int sum3 = 0;
        int index3 = 0;
        
        for(int i = index2+1; i<A.length; i++) {
            sum3 += A[i];
            
            if(sum3 == equalSum) {
                index3 = i;
                break;
            }
        }
        
        
//         System.out.println(sum);
        
//         System.out.println(sum1);
//         System.out.println(sum2);
//         System.out.println(sum3);
        
//         System.out.println(index1);
//         System.out.println(index2);
//         System.out.println(index3);
        
         
        return index3 <= A.length-1 && index2 > index1 && index3 > index2;
    }
}
