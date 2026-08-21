class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer>res=new ArrayList<>();
        int l=0;
        res.add(nums[l]);
        int r=l+1;
        while(r<nums.length){
            if(nums[l]==nums[r]){
                r++;
            }else{
                res.add(nums[r]);
                l=r;
                r++;

            }
        }
        for(int i=0;i<res.size();i++){
            nums[i]=res.get(i);
        }
        return res.size();
        
    }
}