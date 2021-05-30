class Solution {
    public int sumBase(int n, int k) {
        
        String s = Integer.toString(n);
        String num = Integer.toString(Integer.parseInt(s, 10), k);
        
        int sum = 0;
        
        for(char c : num.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        
        return sum;
    }
}
