class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int>s(nums.begin(),nums.end());
        int longest=0;
        for(int num:s){
            if(!s.count(num-1)){
                int currnum=num;
                int streak=1;
                while(s.count(currnum+1)){
                    currnum++;
                    streak++;
                }
                longest=max(longest,streak);
            }
        }
        return longest;
        
    }
};
