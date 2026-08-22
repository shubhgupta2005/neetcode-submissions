class Solution {
    public void rotate(int[] nums, int k) {
        int l=k-1;
        int r=nums.length-1;
        while(l>=0){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            r--;
            l--;
        }
        
    }
}