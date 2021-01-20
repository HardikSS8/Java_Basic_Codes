// class Solution {
//     public boolean divisorGame(int N) {
//         
//         return N % 2 == 0;
//     }
// }


class Solution {
    public boolean divisorGame(int N) {
        if(N == 1)
            return false;
        int[] dp = new int[N];
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            dp[i] = N == 1 ? 1 : --N;
        }
        return dp.length % 2 == 0 ? dp[dp.length-1] == 1 : dp[dp.length-1] != 1;
    }
}
