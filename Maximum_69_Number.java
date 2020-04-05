class Solution {
    public int maximum69Number (int num) {
        
        int rev = 0;
        while(num > 0) {
            rev = rev*10 + num%10;
            num /= 10;
        }
        
        int occurrence = 1; 
        while(rev != 0){
            int last = rev % 10;
            if(last < 9 && occurrence == 1){
                last = 9;
                occurrence++;
            }
            num = num * 10 + last;
            rev /= 10;  
            }   
        return num;
    }
}
