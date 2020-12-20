class Solution {
    public String reformatNumber(String number) {
        
        number = number.replaceAll("-", "");
        number = number.replaceAll(" ", "");
                
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = number.length();
        
        while(j > 4) {
            sb.append(number.substring(i, i+3));
            sb.append("-");
            i += 3;
            j = j-3;
        } 
        if(j < 4)
            sb.append(number.substring(i, i+j));
        else if(j == 4) {
            sb.append(number.substring(i, i+2));
            sb.append("-");
            sb.append(number.substring(i+2, i+4));
        }
        
        return sb.toString();
    }
}
