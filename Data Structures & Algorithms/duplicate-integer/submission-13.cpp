class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> c;
        for(int n :nums){
            if(c.count(n)){
                return true;
            }
            c.insert(n);
        }
        return false;
        
    }
};