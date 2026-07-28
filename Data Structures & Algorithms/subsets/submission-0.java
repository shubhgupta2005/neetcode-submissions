class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        
        res.add(new ArrayList<>());
        int l=0;
        int r=nums.length;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                List<Integer>temp=new ArrayList<>(res.get(i));
                temp.add(nums[i]);
                res.add(temp);
            }
            
        }
        return res;
        
        
        
    }
}
