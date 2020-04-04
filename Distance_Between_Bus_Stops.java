class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int clock = 0;
        int anti_clock = 0;
        
        if(destination < start) {
            int temp = destination;
            destination = start;
            start = temp;
        }
        
        int total = 0;
        for(int i : distance) 
            total += i;
        for(int i = start; i < destination; i++) 
            clock += distance[i];
        
        anti_clock = total - clock;
        return (clock > anti_clock ? anti_clock : clock);
    }
}
