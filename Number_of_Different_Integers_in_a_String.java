class Solution {
    public int numDifferentIntegers(String word) {
        
        String[] arr= word.split("\\D");
        Set<String> s = new HashSet<>();
        
        for(String str:arr){
            str = str.trim();
            if(!str.equals("")){
                str = str.replaceAll("^0*","");
                s.add(str);
            }
        }
        return s.size();
    }
}
