class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            
        }
        
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i]-1)){
                int length=1;
            
            while(set.contains(nums[i]+length)){
                length++;
            }
            count=Math.max(length,count);         
        }
        }
        return count;
        


        
    }
}
