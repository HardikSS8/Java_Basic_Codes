class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        helperFunc(list, new ArrayList<>(), nums, 0);
        
        return list;
    }
    
    private void helperFunc(List<List<Integer>> list , 
                            List<Integer> resultList, 
                            int [] nums, 
                            int start) {
        
		list.add(new ArrayList<>(resultList));
        
        System.out.println(resultList);
        
		for(int i = start; i < nums.length; i++) {

            resultList.add(nums[i]);
            
            helperFunc(list, resultList, nums, i + 1);

            resultList.remove(resultList.size() - 1);
	    }
    }
}
