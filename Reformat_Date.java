class Solution {
    
    Map<String, String> map = new HashMap<>();
    
    public Map<String, String> makeMonthTable() {
        
        map.put("Jan", "01"); map.put("Feb", "02");
        map.put("Mar", "03"); map.put("Apr", "04");
        map.put("May", "05"); map.put("Jun", "06");
        map.put("Jul", "07"); map.put("Aug", "08");
        map.put("Sep", "09"); map.put("Oct", "10");
        map.put("Nov", "11"); map.put("Dec", "12");
        
        return map;
    }
    
    public String reformatDate(String date) {
        
        makeMonthTable();
        
        StringBuilder a = new StringBuilder();
        
        String[] date_split = date.split(" ");
        
        // Year 
        a.append(date_split[2] + "-");
        
        // Month 
        a.append(map.get(date_split[1]) + "-");
        
        String dateStr = date_split[0];
        
        int n = 0;
        for(int i=0; i<dateStr.length(); i++) {
            if(Character.isDigit(dateStr.charAt(i)))
                n = n*10 + Integer.parseInt(String.valueOf(dateStr.charAt(i)));
        }
        
        // Date 
        if(n < 10)
            a.append("0" + Integer.toString(n));
        else
            a.append(Integer.toString(n));
        
        return a.toString();
        
    }
}
