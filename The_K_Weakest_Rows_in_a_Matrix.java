class Solution {
    
    public int getSoldiers(int[] arr) {
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1)
                count++;
        }
        return count;
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        
        
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        
        for(int i = 0; i < mat.length; i++){            
            map.put(i, getSoldiers(mat[i]));
        }
        
        List<Map.Entry<Integer, Integer>> list = 
               new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet()); 
  
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        
        System.out.println(list);
        
        int[] ans = new int[k];
        
        for(int i=0; i<list.size() && i<k; i++)
            ans[i] = list.get(i).getKey();
        
        return ans;
    }
}
