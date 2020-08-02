class Solution {
    
    String dayOfTheWeek(int day, int month, int year) {
        
        Map<Integer, String> day_code = new HashMap<>();
        
        day_code.put(0, "Sunday");
        day_code.put(1, "Monday");
        day_code.put(2, "Tuesday");
        day_code.put(3, "Wednesday");
        day_code.put(4, "Thursday");
        day_code.put(5, "Friday");
        day_code.put(6, "Saturday");
        
        
        if (month == 1 || month == 2) {
            year = year - 1;
            month = month + 10;
        } else {
            month = month - 2;
        }

        return day_code.get((day + (31 * month)/12 + year + year/4 - year/100 + year/400) % 7);
    }
}
