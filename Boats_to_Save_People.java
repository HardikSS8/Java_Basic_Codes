/*
* Let people[i] to the currently lightest person, and people[j] to the heaviest.

* Then, as described above, if the heaviest person can share a boat with the lightest person 
    (if people[j] + people[i] <= limit) then do so; 
* otherwise, 
    the heaviest person sits in their own boat.
*/


class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int n = people.length;
        int count = 0;
        Arrays.sort(people);
        
        int i = 0, j = n-1;
        while ( i <= j) {
            count++;
            if ( people[i] + people[j] <= limit)
                i++;
            j--;
        }
        
        return count;
    }
}
