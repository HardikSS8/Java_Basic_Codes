class Solution {
    
    public int noOf1S(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1')
                count++;
        }
        return count;
    }
    
    public int[] sortByBits(int[] arr) {
     
        Integer[] t = new Integer[arr.length];
        for (int i = 0; i < t.length; i++) 
            t[i] = arr[i]; 

        Arrays.sort(t, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int bitComparision = noOf1S(a) - noOf1S(b);
                if (bitComparision == 0) return a - b;
                return bitComparision;
            }
        });
        
        for (int i = 0; i < t.length; i++) 
            arr[i] = t[i];
        
        return arr;
    }
}
