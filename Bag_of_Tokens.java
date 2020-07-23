// class Solution {
//     public int bagOfTokensScore(int[] tokens, int P) {
//         int score = 0;
//         int i = 0;
//         while(i < tokens.length) {
            
//             if(tokens[i] > P && score >= 1 && i < tokens.length) {
//                 score--;
//                 P += tokens[i]; 
//             } else if(tokens[i] <= P) {
//                 P -= tokens[i];
//                 score++;
//             }
//             i++;
//         }
        
//         return score;
//     }
// }

class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int i = 0, n = tokens.length - 1;
        int score = 0, ans = 0;
        
        while (i <= n && (P >= tokens[i] || score > 0)) {
            
            while (i <= n && P >= tokens[i]) {
                P -= tokens[i++];
                score++;
            }

            ans = Math.max(ans, score);
            if (i <= n && score > 0) {
                P += tokens[n--];
                score--;
            }
        }

        return ans;
    }
}
