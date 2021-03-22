class Solution {
    public int secondHighest(String s) {
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        for(char c : s.toCharArray()) {
            
            if(Character.isDigit(c) && !list.contains(Integer.parseInt(String.valueOf(c)))) {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        
        Collections.sort(list);
        
        return list.size() > 1 ? list.get(list.size() - 2) : -1;
    }
}
