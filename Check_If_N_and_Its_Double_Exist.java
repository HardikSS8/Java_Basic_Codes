class Solution {
    public boolean checkIfExist(int[] arr) {
      
        for(int i=0; i<arr.length; i++) {
            
            for(int j=0; j<arr.length && j!=i; j++) {
                
                if(arr[j]*2 == arr[i] || arr[i]*2 == arr[j])
                    return true;
            }
        }
        return false;
    }
}
