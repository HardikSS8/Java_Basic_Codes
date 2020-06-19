class Solution {
    
    public int findDiscountValue(int[] arr, int start) {
        
        for(int j=start+1; j<arr.length; j++) {
            if(arr[j] <= arr[start]) {
                return j;
            }
        }
        return -1;
    }
    
    public int[] finalPrices(int[] prices) {
                
        for(int i=0; i<prices.length; i++) {
            int discount = findDiscountValue(prices, i);
            if(discount != -1)
                prices[i] = prices[i] - prices[discount];
        }
        
        return prices;
    }
}
