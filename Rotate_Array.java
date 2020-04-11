// Solution 1:  Brute Force Approach

class Solution {
    public void rotateByOne(int[] nums) {
        
        int n = nums.length, last = nums[n-1], i=0;
        for(i=n-1; i>0; i--)
            nums[i] = nums[i-1];
        nums[0] = last;
    }
    
    public void rotate(int[] nums, int k) {
        for(int i=0; i<k; i++) {
            rotateByOne(nums);
        }
    }
}

// Solution 2: Reverse

public class Solution {
    public void rotate(int[] nums, int k) {
    
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
    
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
