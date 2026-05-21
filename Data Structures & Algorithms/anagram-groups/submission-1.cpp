class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> res;
        vector<vector<string>> result;
        for(int i=0;i<strs.size();i++){
            string temp=strs[i];
            sort(temp.begin(),temp.end());
            res[temp].push_back(strs[i]);

        }

        for(auto& i :res){
            result.push_back(i.second);


        }
        return result;
        
    }
};
