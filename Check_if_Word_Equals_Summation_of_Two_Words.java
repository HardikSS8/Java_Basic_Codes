class Solution {
    
    public int getNumber(String str) {
        
        StringBuilder temp = new StringBuilder();
        
        for(char c : str.toCharArray()) {
            temp.append(c - 'a');
        }
        
        return Integer.parseInt(temp.toString());
    }
    
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
    
        
        int num1 = getNumber(firstWord);
        int num2 = getNumber(secondWord);
        
        int num3 = getNumber(targetWord);
        
        // System.out.println(num1);
        // System.out.println(num2);  
        return (num1 + num2) == num3;
    }
}
