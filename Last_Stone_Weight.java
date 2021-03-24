class Solution {
    public int lastStoneWeight(int[] stones) {
          
        // Method - 1
        
        Arrays.sort(stones);
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int n : stones)
            list.add(n);
        
        while(list.size() > 1) {
            
            int one = Collections.max(list);
            list.remove(list.indexOf(one));
            
            int two = Collections.max(list);
            list.remove(list.indexOf(two));
            
            if(one != two) 
                list.add(Math.abs(one - two));
        }
        
        return list.size() == 1 ? list.get(0) : 0;
        
        // Method - 2
        
//         Arrays.sort(stones);
        
//         for(int i=stones.length-1; i>0; i--) {
//             System.out.println(Arrays.toString(stones));
//             stones[i-1] = stones[i] - stones[i-1];
            
//             // System.out.println(Arrays.toString(stones));
            
//             System.out.println();
//             Arrays.sort(stones);
//         }
//         return stones[0];
    }
}
