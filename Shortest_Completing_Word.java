class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        licensePlate = licensePlate.toLowerCase();
        
        int[] map = new int[26];
        for(char c : licensePlate.toCharArray()) {
            if(c >= 'a' && c <= 'z')
                map[c - 'a']++;
        }
        
        String omax = "";
        
        for(int i = 0; i < words.length; i++) {
            
            int[] map2 = new int[26];
            boolean flag = true;
            
            for(int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if(ch >= 'a' && ch <= 'z') 
                    map2[ch-'a']++;
            }
            
            for(int k = 0; k < 26; k++) {
                if(map[k] != 0 && map2[k] < map[k]){
                    flag = false;
                    break;
                }
            }
                 
            if(flag && (words[i].length() < omax.length() || omax.length() == 0 )) omax = words[i];
        }
        
        return omax;
    }
}
