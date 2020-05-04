class Solution {
    public int lengthOfLastWord(String s) {
        
        boolean flag = false;

        int i = s.length()-1;
        int count = 0;
        while(i >= 0) {
            if(Character.isLetter(s.charAt(i))) {
                flag = true;
                count++;
            }
            else {
                if(flag == true)
                    return count;
            }
            i--;
        }
        return count;
    }
}
