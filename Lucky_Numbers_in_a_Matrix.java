class Solution {
    
    public int findMin(int[] arr) {
        
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    
    public List<Integer> luckyNumbers (int[][] matrix) {
                
        List<Integer> min = new ArrayList<>();
        List<Integer> max = new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++) {
            min.add(findMin(matrix[i]));
        }
        
        int[] result = new int[matrix[0].length];
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > result[j]) {
                    result[j] = matrix[i][j];
                }
            }
        }
        
        for(int x: result)
            max.add(x);
    
        System.out.println("Min List : " + min);
        System.out.println("Max List : " + max);
        
        min.retainAll(max);
        
        return min;
    }
}
