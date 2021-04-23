class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        char row = coordinates.charAt(0);        
        int r = row - 'a';
        r = r + 1;
        
        int c = Character.getNumericValue(coordinates.charAt(1));
        
        // System.out.println(r + " " + c);
        
        if(r % 2 == 0 && c % 2 == 0)
            return false;
        else if(r % 2 != 0 && c % 2 == 0)
            return true;
        else if(r % 2 != 0 && c % 2 != 0)
            return false;
        else
            return true;
    }
}
