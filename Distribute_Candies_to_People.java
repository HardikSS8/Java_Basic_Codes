class Solution {

    public int[] distributeCandies(int candies, int num_people) {

        int[] ans = new int[num_people];
        
        int sum = 1, i = 0;
        
        while(candies-sum > 0) {
            ans[i] += sum;
            candies -= sum;
            sum++;
            i++;
            if(i == num_people)
                i = 0;
        }
        
        if(i == num_people)
            i = 0;
        
        ans[i] += candies;
        
        return ans;
        
    }
}
