class Solution {
    public int maxNumberOfBalloons(String text) {
        
        int[] count = new int[5];
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) == 'a')
                count[0]++;
            else if(text.charAt(i) == 'b')
                count[1]++;
            else if(text.charAt(i) == 'l')
                count[2]++;
            else if(text.charAt(i) == 'n')
                count[3]++;
            else if(text.charAt(i) == 'o')
                count[4]++;
            else
                continue;
        }
        count[2] /= 2, count[4] /= 2;
        int min = count[0];
        for(int j=0; j<5; j++) {
            if(count[j] < min)
                min = count[j];
        }
        return min;
    }
}
