class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new LinkedList<>();
        
        String chain = "123456789";
        String min = low + "";
        String max = high + "";
        
        int minK = min.length();
        int maxK = max.length() + 1;
        
        for(int k = minK; k < maxK; k++){

            if(k > chain.length()) continue;
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < k; i++){
                sb.append(chain.charAt(i));
            }

            int x = Integer.parseInt(sb.toString());
            if(low <= x && x <= high) res.add(x);
            
            for(int i = k; i < chain.length(); i++){
                sb.append(chain.charAt(i));
                sb.deleteCharAt(0);
                x = Integer.parseInt(sb.toString());
                if(low <= x && x <= high) res.add(x);
            }
        } 
        return res;
    }
}
