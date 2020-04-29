class Solution {
    public int bitwiseComplement(int N) {
        
        int complement =0;
        if(N==0)
            return 1;
        int power =1;
        while(N!=0) {
            complement+= (1-N%2)*power;
            power=power*2;
            N=N/2;
        }   
        return complement;
    }
}
