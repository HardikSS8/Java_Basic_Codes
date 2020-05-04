class Solution {
    public String getHint(String secret, String guess) {
       
        int[] arr = new int[10];
        int bulls = 0, cows = 0;
        for(int i=0; i<secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                arr[secret.charAt(i) - '0']++;
            }
        }
        
        for(int i = 0; i < guess.length(); i++){
            if(secret.charAt(i) != guess.charAt(i) && arr[guess.charAt(i) - '0'] > 0){
                cows++;
                arr[guess.charAt(i) - '0']--;
            }
        }
        return bulls+"A"+(cows)+"B";
    }
}
