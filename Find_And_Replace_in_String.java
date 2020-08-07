class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        
        Map<Integer, Integer> table = new HashMap<>();
        
        for (int i=0; i<indexes.length; i++) {

            if (S.startsWith(sources[i], indexes[i])) {
                table.put(indexes[i], i);
            }
        }
        
        System.out.println(table);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<S.length(); ) {

            if (table.containsKey(i)) {
                sb.append(targets[table.get(i)]);
                i += sources[table.get(i)].length();
                
            } else {
                sb.append(S.charAt(i++));
            }
        }
        
        return sb.toString();
    }
}
