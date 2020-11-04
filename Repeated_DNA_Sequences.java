class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<String> set = new HashSet<>();
        Set<String> all_dna = new HashSet<>();
        
        for(int i=0; i <= s.length()-10; i++) {
            
            String dna = s.substring(i, i+10);
            
            if(!all_dna.add(dna))
                set.add(dna);
        }
        
        return new ArrayList<>(set);
    }
}
