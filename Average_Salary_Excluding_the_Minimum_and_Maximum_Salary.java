class Solution {
    public double average(int[] salary) {
       
        int min = salary[0];
        int max = salary[0];
        
        for(int i : salary) {
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        
        double sum = 0;
        int count = 0;
        
        for(int i : salary) {
            if(i != min && i != max) {
                count++;
                sum += i;
            }
        }
        
        return sum/(count);
    }
}

// class Solution {
//     public double average(int[] salary) {
        
//         Arrays.sort(salary);
        
//         double sum = 0;
        
//         for(int i=1; i<salary.length-1; i++) {
//             sum += salary[i];
//         }
        
//         return sum/(salary.length-2);
//     }
// }
