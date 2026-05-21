class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int,int> count;
        int res=0,maxcount=0;
        for(int num:nums){
            count[num]++;
            if(count[num]>maxcount){
                res=num;
                maxcount=count[num];
            }
        }
        return res;
        
    }
};