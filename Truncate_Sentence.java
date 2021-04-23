class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] arr = s.split(" ");
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i < k && k <= arr.length; i++) {
            ans.append(arr[i] + " ");
        }
        
        return ans.toString().trim();
    }
}
