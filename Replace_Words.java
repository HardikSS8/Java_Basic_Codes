class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        
        Set<String> set = new HashSet<>();
        
        for (String root: dict) 
            set.add(root);
        
        StringBuilder sb = new StringBuilder();
        
        String[] words = sentence.split("\\s+");
        
        for(String s : words) {
            
            String prefix = "";
            
            for(int i = 1; i <= s.length(); i++) {
                
                prefix = s.substring(0, i);
                
                if(set.contains(prefix))
                    break;
            }
            
            if(sb.length() > 0) sb.append(" ");
            
            sb.append(prefix);
        }
        
        return sb.toString();
    }
}
