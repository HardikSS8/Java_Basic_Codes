class Solution {
    public String reformat(String s) {
        
        StringBuilder a = new StringBuilder();
        
        int[] nums = new int[s.length()];
        char[] alph = new char[s.length()];
        
        int p = 0, q = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
                nums[p++] = Integer.parseInt(Character.toString(s.charAt(i)));
            else
                alph[q++] = s.charAt(i);
        }
        
        p--; q--;

        if(p == 0 && q == -1)
            return Integer.toString(nums[0]);
        else if(p == -1 && q == 0)
            return Character.toString(alph[0]);
        
        if(p == -1 || q == -1) return "";
        
        for(int i=0, j=0; i<=p || j<=q; i++,j++) {
        
            if(p > q) {
                if(i <= p)
                    a.append(nums[i]);
                if(j <= q) 
                    a.append(alph[j]);   
            } else {
                if(j <= q) 
                    a.append(alph[j]);
                if(i <= p)
                    a.append(nums[i]);
            }
        }
        
        return a.toString();
    }
}
