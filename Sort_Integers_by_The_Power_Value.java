class Solution {
    
    public int getNoOfSteps(int num) {
        
        int count = 0;
        while(num != 1) {
            count++;
            num = (num % 2 == 0) ? num/2 : 3*num + 1;
        }
        return count;
    }
    
    public int getKth(int lo, int hi, int k) {
        
        LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        for(int i = lo; i <= hi; i++){
            map.put(i,getNoOfSteps(i));
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
        
        // System.out.println(list);
        
        return list.get(k-1).getKey();
        
    }
}
