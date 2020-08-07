class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> set = new HashSet<>();
        
        for(String s : emails) {
            
            String[] divide_by_at_sign = s.split("@");
        
            String local = divide_by_at_sign[0];
            String rest_final = divide_by_at_sign[1];
            
            String[] divide_string_by_plus = local.split("\\+");
                    
            String local_name = divide_string_by_plus[0];
                
            // Generate new local without '.' in string
            StringBuilder sb = new StringBuilder();
            
            for(int i=0; i<local_name.length(); i++) {
                
                if(local_name.charAt(i) != '.') {
                    sb.append(local_name.charAt(i));        
                }
            }
            
            set.add(sb.toString() + "@" + rest_final);
            
        }
        
        return set.size();
    }
}
