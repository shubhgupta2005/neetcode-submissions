class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& nums) {
        vector<int>ans(nums.size(),0);
        stack<int>st;
        for(int i=0;i<nums.size();i++){
            while(!st.empty() && nums[i]>nums[st.top()]){
                int idx=st.top();
                st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        return ans;
        
    }
};
