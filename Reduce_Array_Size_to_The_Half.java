class Solution {
    public int minSetSize(int[] arr) {
    
        int size = arr.length;
        int freq[] = new int[100001];
        int count = 0;
        for (int num : arr) {
            freq[num]++;
        }
        Arrays.sort(freq);
        for (int i = freq.length - 1; i >= 0; i--) {
              size -= freq[i];
              count++;
              if (size <= arr.length / 2) {
                  break;
              }
        }
        return count;
    }
}
