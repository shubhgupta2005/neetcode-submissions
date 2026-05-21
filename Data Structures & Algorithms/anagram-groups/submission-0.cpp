class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        //sort kro phele first word ko aur woh original wale ko jisse sort hua hai 
        //usse array mein add kro aur  track rkho sorted wale ka phir agla sort kro aur dekho kya woh phele se hai sorted part agar hai woh 

        unordered_map<string,vector<string>> mpp;
        vector<vector<string>>s;
        for(int i=0;i<strs.size();i++){
            string temp =strs[i];
            sort(temp.begin(),temp.end());
            
            
            mpp[temp].push_back(strs[i]); //will store sorted string 

        }
        for(auto& it :mpp){
            s.push_back(it.second);
        }
        return s;
        
    }
};
